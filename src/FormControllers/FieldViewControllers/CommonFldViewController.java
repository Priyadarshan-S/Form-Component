package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.CommonFldModel;

public class CommonFldViewController {
    //authorize

    public CommonFldViewController(Config obj,CommonFldModel model)
    {
        model.setTitle(obj.getString("title"));

        if(obj.hasPath("instruction"))
            model.setInstruction(obj.getString("instruction"));
        else
            model.setInstruction("");
            
        model.setFieldType(obj.getString("fieldType"));

        if(obj.hasPath("placeholder"))
            model.setPlaceholder(obj.getString("placeholder"));

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
