package FieldViewModels;

import java.util.List;

public class ChoiceFldModel {
    private String title;
    private String instruction;
    private String fieldType;
    private String uiSize;
    private Boolean isButtonType;
    private int choiceLimit;
    private int columnCount;
    private List<?> choiceArray;
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

    public String getUISize() {
        return uiSize;
    }

    public void setUISize(String uiSize) {
        this.uiSize = uiSize;
    }

    public Boolean getButtonType() {
        return isButtonType;
    }

    public void setButtonType(Boolean isButtonType) {
        this.isButtonType = isButtonType;
    }

    public int getChoiceLimit() {
        return choiceLimit;
    }

    public void setChoiceLimit(int choiceLimit) {
        this.choiceLimit = choiceLimit;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public List<?> getChoiceArray() {
        return choiceArray;
    }

    public void setChoiceArray(List<?> list) {
        this.choiceArray = list;
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
