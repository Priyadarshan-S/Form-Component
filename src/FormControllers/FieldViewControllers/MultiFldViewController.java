package FormControllers.FieldViewControllers;

import java.util.List;
import java.util.Iterator;

import com.typesafe.config.Config;

import FieldViewModels.*;
import FormControllers.FieldChecks;
import FormControllers.JsonWriter;

public class MultiFldViewController {
    public String MultiFldJsonGenerator(Config obj, MultiFldModel model) {
        model.setTitle(obj.getString("title"));
        String title = model.getTitle();

        if(obj.hasPath("instruction"))
            model.setInstruction(obj.getString("instruction"));
        String instruction = model.getInstruction();

        model.setFieldType(obj.getString("fieldType"));
        String fieldType = model.getFieldType();

        if(obj.hasPath("mandatory"))
            model.setMandatory(obj.getBoolean("mandatory"));
        else 
            model.setMandatory(false);
            
        Boolean mandatory = model.getMandatory();
        Boolean visibility = model.getVisibility();

        String start = "{\n\"title\": \""+title+"\",\n\"instruction\" : \""+instruction+
                        "\"\n\"fieldType\" : \""+fieldType+"\"\n\"visibility\" : \""+visibility+
                        "\"\n\"mandatory\" : \""+mandatory+"\"\n\"fieldArray\" : [\n";
        String jsonString = start;

        JsonWriter json = new JsonWriter();

        int fieldCount = 0;
        List<? extends Config> fieldList = obj.getConfigList("fieldArray");
        Iterator<? extends Config> it = fieldList.iterator();

        FieldChecks check = new FieldChecks();
        String access;
        access = check.FieldAuthorize(obj.getString("title")).toString();

        while(it.hasNext())
        {
            Config objArr = (Config) it.next();
            fieldType = objArr.getString("fieldType");
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
                        if(access.equals("HIDE"))
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
                        if(access.equals("HIDE"))
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
                        cho.setChoiceArray(check.valueSupplier(cho.getTitle(),cho.getChoiceArray()));

                        if(access.equals("SHOW"))
                            cho.setVisibility(true);
                        else
                        if(access.equals("HIDE"))
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
                        if(access.equals("HIDE"))
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
                        if(access.equals("HIDE"))
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
                        if(access.equals("HIDE"))
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
                        if(access.equals("HIDE"))
                            dec.setVisibility(false);

                        if(fieldCount!=0)
                            jsonString += ",\n";
                        jsonString = json.toJsonString(jsonString, dec);
                    }
                    break;
            }
            fieldCount++;
        }
        jsonString += "\n]\n}";
        return jsonString;
    }
}
