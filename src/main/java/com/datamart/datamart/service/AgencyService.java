package com.datamart.datamart.service;

import com.datamart.datamart.form.response.AgencyResponse;
import java.util.List;

public interface AgencyService {
    List<AgencyResponse.FindAll> agencyList();
}
