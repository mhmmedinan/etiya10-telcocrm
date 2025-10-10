package com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.handlers;

import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.constants.ExceptionMessages;
import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.problemdetails.BusinessProblemDetails;
import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.problemdetails.ProblemDetails;
import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.problemdetails.ValidationProblemDetails;
import com.etiya.telcocrm.core.crosscuttingconcerns.exceptions.types.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandlers {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException){
        BusinessProblemDetails businessProblemDetails = new BusinessProblemDetails();
        businessProblemDetails.setDetail(businessException.getMessage());
        return businessProblemDetails;
    }


    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleValidationException(MethodArgumentNotValidException exception){
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setDetail(ExceptionMessages.VALIDATION_ERRORS);

        Map<String,String> validationErrors = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error->validationErrors.put(error.getField(),error.getDefaultMessage()));
        validationProblemDetails.setValidationErrors(validationErrors);
        return validationProblemDetails;
    }
}
