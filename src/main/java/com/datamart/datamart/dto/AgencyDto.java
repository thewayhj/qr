package com.datamart.datamart.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AgencyDto {
    @Data
    public static class Response {
        public static AgencyList agencyList;
        public static ArtistList artistList;

        @Data
        @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
        public static class AgencyList {
            public int agencyId;
            public String agencyName;
        }

        @Data
        @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
        public static class ArtistList {
            public int artistId;
            public String artistName;
            public String imgPath;
        }

    }
}
