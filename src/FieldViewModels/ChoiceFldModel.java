package FieldViewModels;

import java.util.List;

public class ChoiceFldModel extends CommonFldModel{
    private Boolean isButtonType;
    private int choiceLimit;
    private int columnCount;
    private List<?> choiceArray;

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
}
