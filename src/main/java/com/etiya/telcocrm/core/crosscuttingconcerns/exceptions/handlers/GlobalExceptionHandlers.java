package com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.handlers;

import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.problemdetails.BusinessProblemDetails;
import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.problemdetails.ProblemDetails;
import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.types.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlers {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException){
        BusinessProblemDetails businessProblemDetails = new BusinessProblemDetails();
        businessProblemDetails.setDetail(businessException.getMessage());
        return businessProblemDetails;
    }
}
