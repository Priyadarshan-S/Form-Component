package FormControllers.FieldViewControllers;

import com.typesafe.config.Config;

import FieldViewModels.UploadFldModel;

public class UploadFldViewController {
    public UploadFldViewController(Config obj,UploadFldModel model) {
        model.setTitle(obj.getString("title"));

        if(obj.hasPath("instruction"))
            model.setInstruction(obj.getString("instruction"));
        else
            model.setInstruction("");

        model.setFieldType(obj.getString("fieldType"));

        if(obj.hasPath("uploadSizeLimit"))
            model.setUploadSizeLimit(obj.getInt("uploadSizeLimit"));
        else
            model.setUploadSizeLimit(1);

        if(obj.hasPath("uploadCountLimit"))
            model.setUploadCountLimit(obj.getInt("uploadCountLimit"));
        else
            model.setUploadCountLimit(1);
        
        model.setAcceptedFileTypes(obj.getStringList("acceptedFileTypes"));

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
