package FieldViewModels;

import java.util.List;

public class UploadFldModel {
    private int uploadSizeLimit;
    private int uploadCountLimit;
    private List<String> acceptedFileTypes;
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

    public List<String> getAcceptedFileTypes() {
        return acceptedFileTypes;
    }
     
    public void setAcceptedFileTypes(List<String> acceptedFileTypes){ 
        this.acceptedFileTypes = acceptedFileTypes;
    }

    public int getUploadSizeLimit() {
        return uploadSizeLimit;
    }

    public void setUploadSizeLimit(int uploadSizeLimit) {
        this.uploadSizeLimit = uploadSizeLimit;
    }

    public int getUploadCountLimit() {
        return uploadCountLimit;
    }

    public void setUploadCountLimit(int uploadCountLimit) {
        this.uploadCountLimit = uploadCountLimit;
    }
}
