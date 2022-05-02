package FieldViewModels;

import java.util.List;

import com.typesafe.config.Config;

public class MultiFldModel extends CommonFldModel{
    private List<List<? extends Config>> fieldArray;
    
    public List<List<? extends Config>> getFieldArray() {
        return fieldArray;
    }

    public void setFieldArray(List<? extends Config> fieldArray) {
        this.fieldArray.add(fieldArray);
    }
}
