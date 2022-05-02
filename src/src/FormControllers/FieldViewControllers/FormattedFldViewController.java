package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.FormattedFldModel;

public class FormattedFldViewController {
    public FormattedFldViewController(Config obj,FormattedFldModel model){
        model.setTitle(obj.getString("title"));

        if(obj.hasPath("instruction"))
            model.setInstruction(obj.getString("instruction"));
        else
            model.setInstruction("");

        model.setFieldType(obj.getString("fieldType"));

        if(obj.hasPath("uiSize"))
            model.setUISize(obj.getString("uiSize"));
        else
            model.setUISize("Small");

        if(obj.hasPath("charLimit"))
            model.setCharLimit(obj.getInt("charLimit"));
        else
            model.setCharLimit(65535);

        if(obj.hasPath("wordLimit"))
            model.setWordLimit(obj.getInt("wordLimit"));
        else
            model.setWordLimit(5000);
        
        if(obj.hasPath("pattern"))
            model.setPattern(obj.getString("pattern"));
        
        model.setFormat(obj.getString("format"));

        if(obj.hasPath("visibility"))
            model.setVisibility(obj.getBoolean("visibility"));
        else 
            model.setVisibility(true);

        if(obj.hasPath("mandatory"))
            model.setMandatory(obj.getBoolean("mandatory"));
        else 
            model.setMandatory(false);
    }
}
