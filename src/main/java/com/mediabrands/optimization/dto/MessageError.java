package com.mediabrands.optimization.dto;

public class MessageError {

    private String errorMessage;
    private String errorId;
    private String fieldError;

    public MessageError(String errorMessage, String errorId, String fieldError) {
        this.errorMessage = errorMessage;
        this.errorId = errorId;
        this.fieldError = fieldError;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getFieldError() {
        return fieldError;
    }

    public void setFieldError(String fieldError) {
        this.fieldError = fieldError;
    }

    @Override
    public String toString() {
        return "MessageError{" +
                "errorMessage='" + errorMessage + '\'' +
                ", errorId='" + errorId + '\'' +
                ", fieldError='" + fieldError + '\'' +
                '}';
    }
}
