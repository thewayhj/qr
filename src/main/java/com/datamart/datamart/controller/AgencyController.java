package com.datamart.datamart.controller;

import com.datamart.datamart.dto.AgencyDto;
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
    public List<AgencyDto.Response.AgencyList> agencyList() {
        List<AgencyDto.Response.AgencyList> agencyList = agencyService.agencyList();
        return agencyList;
    }


    @GetMapping("/{agencyId}/artist/list")
    public List<AgencyDto.Response.ArtistList> agencyArtistList(@PathVariable int agencyId) {
        List<AgencyDto.Response.ArtistList> agencyArtistList = agencyService.agencyArtistList(agencyId);
        return agencyArtistList;
    }

}
