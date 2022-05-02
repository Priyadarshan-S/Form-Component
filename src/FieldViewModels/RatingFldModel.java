package FieldViewModels;

public class RatingFldModel {
    private String shape;
    private int shapeValue;
    private int maxValue;
    private int incrementValue;
    private String title;
    private String instruction;
    private String uiSize;
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

    public String getUISize() {
        return uiSize;
    }

    public void setUISize(String uiSize) {
        this.uiSize = uiSize;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
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

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getShapeValue() {
        return shapeValue;
    }

    public void setShapeValue(int shapeValue) {
        this.shapeValue = shapeValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(int incrementValue) {
        this.incrementValue = incrementValue;
    }
}
