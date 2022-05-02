package FormControllers;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import FieldViewModels.*;
import FormControllers.FieldViewControllers.*;

public class FormViewController {

    public static void main(String[] args) {

        Login login = new Login();
        String role = login.getRole();

        File Form = new File("src/FormConfigurationv4.conf");
        Config config = ConfigFactory.parseFile(Form);
        
        FormFldModel model = new FormFldModel();
        model.setTitle(config.getString("title"));
        String title = model.getTitle();

        if(config.hasPath("instruction"))
            model.setInstruction(config.getString("instruction"));
        String instruction = model.getInstruction();

        List<? extends Config> fieldList = config.getConfigList("fields");
        Iterator<? extends Config> it = fieldList.iterator();
        
        String start = "{\n\"title\": \""+title+"\",\n\"description\" : \""+instruction+"\"\n\"fields\" : [\n";
        String jsonString = start;

        JsonWriter json = new JsonWriter();

        int fieldCount = 0;
        
        while(it.hasNext())
        {
            Config obj = (Config) it.next();
            String fieldType = obj.getString("fieldType");
            FieldChecks check = new FieldChecks();
            String access;
            access = check.FieldAuthorize().toString();
            if(check.RoleCheck(role,obj.getString("role")))
            {
                switch(fieldType)
                {
                    case "Common": 
                        if(!(access.equals("DISABLE")))
                        {
                            CommonFldModel com = new CommonFldModel();
                            new CommonFldViewController(obj,com);

                            if(access.equals("SHOW"))
                                com.setVisibility(true);
                            else
                                com.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";

                            jsonString = json.toJsonString(jsonString, com);
                        }
                        break;
                    case "Format":
                        if(!(access.equals("DISABLE")))
                        {
                            FormattedFldModel format = new FormattedFldModel();
                            new FormattedFldViewController(obj,format);

                            if(access.equals("SHOW"))
                                format.setVisibility(true);
                            else
                                format.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString = json.toJsonString(jsonString, format);
                        } 
                        break;
                    case "Choice":
                        if(!(access.equals("DISABLE")))
                        {
                            ChoiceFldModel cho = new ChoiceFldModel();
                            new ChoiceFldViewController(obj,cho);
                            cho.setChoiceArray(check.valueSupplier(cho.getChoiceArray()));

                            if(access.equals("SHOW"))
                                cho.setVisibility(true);
                            else
                                cho.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString = json.toJsonString(jsonString, cho);
                        }
                        break;
                    case "Rate":
                        if(!(access.equals("DISABLE")))
                        {   
                            RatingFldModel rat = new RatingFldModel();
                            new RatingFldViewController(obj,rat);

                            if(access.equals("SHOW"))
                                rat.setVisibility(true);
                            else
                                rat.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString = json.toJsonString(jsonString, rat);
                        }
                        break;
                    case "Upload":
                        if(!(access.equals("DISABLE")))
                        {  
                            UploadFldModel upl = new UploadFldModel();
                            new UploadFldViewController(obj,upl);

                            if(access.equals("SHOW"))
                                upl.setVisibility(true);
                            else
                                upl.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString = json.toJsonString(jsonString, upl);
                        }
                        break;
                    case "Slider":
                        if(!(access.equals("DISABLE")))
                        {  
                            SliderFldModel sli = new SliderFldModel();
                            new SliderFldViewController(obj,sli);

                            if(access.equals("SHOW"))
                                sli.setVisibility(true);
                            else
                                sli.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString = json.toJsonString(jsonString, sli);
                        }
                        break;
                    case "Decision":
                        if(!(access.equals("DISABLE")))
                        {
                            DecisionFldModel dec = new DecisionFldModel();
                            new DecisionFldViewController(obj, dec);

                            if(access.equals("SHOW"))
                                dec.setVisibility(true);
                            else
                                dec.setVisibility(false);

                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString = json.toJsonString(jsonString, dec);
                        }
                        break;
                    case "Multi":
                        if(!(access.equals("DISABLE")))
                        {
                            MultiFldModel mul = new MultiFldModel();
                            MultiFldViewController mulControl = new MultiFldViewController();

                            if(access.equals("SHOW"))
                                mul.setVisibility(true);
                            else
                                mul.setVisibility(false);

                            String multiJsonString = mulControl.MultiFldJsonGenerator(obj,mul);
                            if(fieldCount!=0)
                                jsonString += ",\n";
                            jsonString += multiJsonString;
                        }
                        break;
                }
                fieldCount++;
            }
        }
        jsonString += "\n]\n}";
        System.out.println("\n"+jsonString);
    }
}