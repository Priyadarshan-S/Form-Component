package FieldViewModels;

import java.util.List;

public class UploadFldModel extends CommonFldModel{
    private int uploadSizeLimit;
    private int uploadCountLimit;
    private List<String> acceptedFileTypes;

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
