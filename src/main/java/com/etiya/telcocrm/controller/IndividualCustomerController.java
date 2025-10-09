package com.etiya.telcocrm.controller;

import com.etiya.telcocrm.model.entities.IndividualCustomer;
import com.etiya.telcocrm.service.abstracts.IndividualCustomerService;
import com.etiya.telcocrm.service.requests.individualcustomers.CreateIndividualCustomerRequest;
import com.etiya.telcocrm.service.responses.individualcustomers.CreatedIndividualCustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/individual-customers")
public class IndividualCustomerController {

    private final IndividualCustomerService individualCustomerService;

    public IndividualCustomerController(IndividualCustomerService individualCustomerService) {
        this.individualCustomerService = individualCustomerService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedIndividualCustomerResponse add(@RequestBody CreateIndividualCustomerRequest request){
         return individualCustomerService.add(request);
    }
}
