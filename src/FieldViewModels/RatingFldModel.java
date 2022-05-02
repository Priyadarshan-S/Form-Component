package FieldViewModels;
public class RatingFldModel extends CommonFldModel{
    private String shape;
    private int shapeValue;
    private int maxValue;
    private int incrementValue;

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
