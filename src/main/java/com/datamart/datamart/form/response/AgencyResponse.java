package com.datamart.datamart.form.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AgencyResponse {
    private static FindAll AgencyList;

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class FindAll {
        public String AgencyName;
    }
}
