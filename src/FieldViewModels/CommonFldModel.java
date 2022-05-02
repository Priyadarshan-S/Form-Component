package FieldViewModels;

public class CommonFldModel {
        private String title;
        private String instruction;
        private String uiSize;
        private Boolean visibility;
        private Boolean mandatory;
        // private String role;
        private String fieldType;
        private String placeholder;
        private int charLimit;
        private int wordLimit;
        private String pattern;


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

        // public String getRole() {
        //     return role;
        // }

        // public void setRole(String role) {
        //     this.role = role;
        // }

        public String getFieldType() {
            return fieldType;
        }

        public void setFieldType(String fieldType) {
            this.fieldType = fieldType;
        }

        public String getPlaceholder() {
            return placeholder;
        }

        public void setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
        }

        public int getCharLimit() {
            return charLimit;
        }

        public void setCharLimit(int charLimit) {
            this.charLimit = charLimit;
        }

        public int getWordLimit() {
            return wordLimit;
        }

        public void setWordLimit(int wordLimit) {
            this.wordLimit = wordLimit;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }
}
