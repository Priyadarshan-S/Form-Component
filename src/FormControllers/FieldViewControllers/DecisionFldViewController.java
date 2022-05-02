package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.DecisionFldModel;

public class DecisionFldViewController {
    public DecisionFldViewController(Config obj,DecisionFldModel model) {
        model.setTitle(obj.getString("title"));

        if(obj.hasPath("instruction"))
            model.setInstruction(obj.getString("instruction"));
        else
            model.setInstruction("");
            
        model.setFieldType(obj.getString("fieldType"));

        if(obj.hasPath("initialValue"))
            model.setInitialValue(obj.getBoolean("initialValue"));
        else
            model.setInitialValue(false);

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
