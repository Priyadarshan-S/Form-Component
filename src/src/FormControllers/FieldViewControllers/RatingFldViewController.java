package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.RatingFldModel;

public class RatingFldViewController {
    public RatingFldViewController(Config obj,RatingFldModel model)
    {
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

        if(obj.hasPath("shape"))
            model.setShape(obj.getString("shape"));
        else
            model.setShape("Star");

        if(obj.hasPath("maxValue"))
            model.setMaxValue(obj.getInt("maxValue"));
        else
            model.setMaxValue(5);

        if(obj.hasPath("shapeValue"))
            model.setShapeValue(obj.getInt("shapeValue"));
        else
            model.setShapeValue(1);
            
        if(obj.hasPath("incrementValue"))
            model.setIncrementValue(obj.getInt("incrementValue"));
        else
            model.setIncrementValue(1);
        
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