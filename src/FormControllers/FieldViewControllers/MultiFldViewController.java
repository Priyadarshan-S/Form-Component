package FormControllers.FieldViewControllers;

import java.util.List;
import java.util.Iterator;

import com.typesafe.config.Config;

import FieldViewModels.*;
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
        while(it.hasNext())
        {
            Config objArr = (Config) it.next();
            fieldType = objArr.getString("fieldType");
            switch(fieldType)
            {
                case "Common":
                    CommonFldModel com = new CommonFldModel();
                    new CommonFldViewController(objArr,com);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, com);
                    // System.out.println("\t"+com.getTitle());
                    break;
                case "Format":
                    FormattedFldModel format = new FormattedFldModel();
                    new FormattedFldViewController(objArr,format);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, format);
                    // System.out.println(format.getTitle());
                    // System.out.println(format.getFormat()+"\n");
                    break;
                case "Choice":
                    ChoiceFldModel cho = new ChoiceFldModel();
                    new ChoiceFldViewController(objArr,cho);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, cho);
                    // System.out.println("\t"+cho.getTitle());
                    // System.out.println(cho.getChoiceArray()+"\n");
                    break;
                case "Rate":
                    RatingFldModel rat = new RatingFldModel();
                    new RatingFldViewController(objArr,rat);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, rat);
                    // System.out.println(rat.getTitle());
                    // System.out.println(rat.getShape()+"\n");
                    break;
                case "Upload":
                    UploadFldModel upl = new UploadFldModel();
                    new UploadFldViewController(objArr,upl);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, upl);
                    // System.out.println(upl.getTitle());
                    // System.out.println(upl.getAcceptedFileTypes()+"\n");
                    break;
                case "Slider":
                    SliderFldModel sli = new SliderFldModel();
                    new SliderFldViewController(objArr,sli);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, sli);
                    // System.out.println(sli.getTitle());
                    // System.out.println(sli.getDefaultValue()+"\n");
                    break;
                case "Decision":
                    DecisionFldModel dec = new DecisionFldModel();
                    new DecisionFldViewController(objArr, dec);
                    if(fieldCount!=0)
                        jsonString += ",\n";
                    jsonString = json.toJsonString(jsonString, dec);
                    // System.out.println(dec.getTitle());
                    // System.out.println(dec.getInitialValue()+"\n");
                    break;
            }
            fieldCount++;
        }
        jsonString += "\n]\n}";
        return jsonString;
    }
}
