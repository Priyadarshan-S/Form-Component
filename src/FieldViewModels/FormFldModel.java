package FieldViewModels;

import java.util.ArrayList;
import java.util.List;

public class FormFldModel {
    private String title;
    private String instruction;
    private List<Object> fields = new ArrayList<Object>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public List<Object> getFieldObject() {
        return fields;
    }

    public void setFieldObject(Object field) {
        this.fields.add(field);
    }
}
