package com.datamart.datamart.controller;

import com.datamart.datamart.form.response.AgencyResponse;
import com.datamart.datamart.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agency")
public class AgencyController {
    @Autowired
    private AgencyService agencyService;

    @GetMapping("/list")
    public List<AgencyResponse.FindAll> agencyList() {
        List<AgencyResponse.FindAll> agencyResponse = agencyService.agencyList();
        return agencyResponse;
    }

    /*
    * @GetMapping("/{agency}/list")
    public List<AgencyResponse.FindAll> AgencyList(@PathVariable String agency) {
        List<AgencyResponse.FindAll> agencyResponse = agencyService.agencyList();
        return agencyResponse;
    }
    * */
}
