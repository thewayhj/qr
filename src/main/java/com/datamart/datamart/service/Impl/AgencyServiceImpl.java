package com.datamart.datamart.service.Impl;

import com.datamart.datamart.form.response.AgencyResponse;
import com.datamart.datamart.service.AgencyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyServiceImpl implements AgencyService {

    public List<AgencyResponse.FindAll> agencyList() {
        List<AgencyResponse.FindAll> agencyList = new ArrayList<>();
        AgencyResponse.FindAll argencyInfo = new AgencyResponse.FindAll();
        argencyInfo.setAgencyName("(주)JYP엔터테인먼트");
        agencyList.add(argencyInfo);
        return agencyList;
    }
}
