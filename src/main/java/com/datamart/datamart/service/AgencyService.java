package com.datamart.datamart.service;

import com.datamart.datamart.dto.AgencyDto;
import java.util.List;

public interface AgencyService {
    List<AgencyDto.Response.AgencyList> agencyList();

    List<AgencyDto.Response.ArtistList> agencyArtistList(int agencyId);
}
