package FieldViewModels;

public class DecisionFldModel {
    private Boolean initalValue;
    private String title;
    private String instruction;
    private String fieldType;
    private Boolean visibility;
    private Boolean mandatory;

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

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public Boolean getInitialValue() {
        return initalValue;
    }

    public void setInitialValue(Boolean initialValue) {
        this.initalValue = initialValue;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }
}
