package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.ChoiceFldModel;

public class ChoiceFldViewController {
    public ChoiceFldViewController(Config obj,ChoiceFldModel model) {
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

        if(obj.hasPath("choiceLimit"))
            model.setChoiceLimit(obj.getInt("choiceLimit"));
        else
            model.setChoiceLimit(1);

        if(obj.hasPath("columnCount"))
            model.setColumnCount(obj.getInt("columnCount"));
        else
            model.setColumnCount(1);

        if(obj.hasPath("isButtonType"))
            model.setButtonType(obj.getBoolean("isButtonType"));
        else
            model.setButtonType(false);
        
        model.setChoiceArray(obj.getStringList("choiceArray"));

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