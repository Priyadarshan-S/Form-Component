package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.SliderFldModel;

public class SliderFldViewController {
    public SliderFldViewController(Config obj,SliderFldModel model) {
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

        if(obj.hasPath("minValue"))
            model.setMinValue(obj.getInt("minValue"));
        else model.setMinValue(0);

        if(obj.hasPath("maxValue"))
            model.setMaxValue(obj.getInt("maxValue"));
        else 
            model.setMaxValue(100000000);

        if(obj.hasPath("defaultValue"))
            model.setDefaultValue(obj.getInt("defaultValue"));
        else
            model.setDefaultValue(0);
        
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
