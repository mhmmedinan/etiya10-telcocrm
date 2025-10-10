package com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.types;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}
