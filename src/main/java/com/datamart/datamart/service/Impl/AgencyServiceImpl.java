package com.datamart.datamart.service.Impl;

import com.datamart.datamart.dto.AgencyDto;
import com.datamart.datamart.service.AgencyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyServiceImpl implements AgencyService {

    public List<AgencyDto.Response.AgencyList> agencyList() {
        List<AgencyDto.Response.AgencyList> agencyList = new ArrayList<>();
        AgencyDto.Response.AgencyList argencyInfo = new AgencyDto.Response.AgencyList();
        argencyInfo.setAgencyId(1);
        argencyInfo.setAgencyName("(주)JYP엔터테인먼트");
        agencyList.add(argencyInfo);

        argencyInfo = new AgencyDto.Response.AgencyList();
        argencyInfo.setAgencyId(2);
        argencyInfo.setAgencyName("BIGHIT MUSIC");
        agencyList.add(argencyInfo);

        argencyInfo = new AgencyDto.Response.AgencyList();
        argencyInfo.setAgencyId(3);
        argencyInfo.setAgencyName("YG Entertainment");
        agencyList.add(argencyInfo);

        argencyInfo = new AgencyDto.Response.AgencyList();
        argencyInfo.setAgencyId(4);
        argencyInfo.setAgencyName("SM ENTERTAINMENT");
        agencyList.add(argencyInfo);

        argencyInfo = new AgencyDto.Response.AgencyList();
        argencyInfo.setAgencyId(5);
        argencyInfo.setAgencyName("카카오엔터테인먼트");
        agencyList.add(argencyInfo);

        argencyInfo = new AgencyDto.Response.AgencyList();
        argencyInfo.setAgencyId(6);
        argencyInfo.setAgencyName("GENIE MUSIC");
        agencyList.add(argencyInfo);


        return agencyList;
    }

    public List<AgencyDto.Response.ArtistList> agencyArtistList(int agencyId) {
        List<AgencyDto.Response.ArtistList> agencyArtistList = new ArrayList<>();
        AgencyDto.Response.ArtistList artistInfo = new AgencyDto.Response.ArtistList();

        if (agencyId == 1) {
            artistInfo.setArtistId(1);
            artistInfo.setArtistName("트와이스");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/080/463/902/80463902_1676948301093_45_200x200.JPG");
            agencyArtistList.add(artistInfo);

            artistInfo = new AgencyDto.Response.ArtistList();
            artistInfo.setArtistId(2);
            artistInfo.setArtistName("박진영");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/014/945/855/14945855_1669021032623_10_200x200.JPG");
            agencyArtistList.add(artistInfo);

            artistInfo = new AgencyDto.Response.ArtistList();
            artistInfo.setArtistId(3);
            artistInfo.setArtistName("데이식스");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/080/444/970/80444970_1643261833596_15_200x200.JPG");
            agencyArtistList.add(artistInfo);

        } if (agencyId == 2) {
            artistInfo.setArtistId(1);
            artistInfo.setArtistName("방탄소년단");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/080/221/635/80221635_1686280162961_20_200x200.JPG");
            agencyArtistList.add(artistInfo);

            artistInfo = new AgencyDto.Response.ArtistList();
            artistInfo.setArtistId(2);
            artistInfo.setArtistName("투모로우바이투게더");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/080/683/240/80683240_1688700225075_10_200x200.JPG");
            agencyArtistList.add(artistInfo);

            artistInfo = new AgencyDto.Response.ArtistList();
            artistInfo.setArtistId(3);
            artistInfo.setArtistName("이현");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/079/943/692/79943692_1581041979866_9_200x200.JPG");
            agencyArtistList.add(artistInfo);

        } if (agencyId == 3) {
            artistInfo.setArtistId(1);
            artistInfo.setArtistName("BLACKPINK");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/080/539/764/80539764_1663289664075_11_200x200.JPG");
            agencyArtistList.add(artistInfo);

            artistInfo = new AgencyDto.Response.ArtistList();
            artistInfo.setArtistId(2);
            artistInfo.setArtistName("빅뱅");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/041/719/277/41719277_1649063621217_10_200x200.JPG");
            agencyArtistList.add(artistInfo);

            artistInfo = new AgencyDto.Response.ArtistList();
            artistInfo.setArtistId(3);
            artistInfo.setArtistName("iKON");
            artistInfo.setImgPath("https://image.genie.co.kr/Y/IMAGE/IMG_ARTIST/080/447/683/80447683_1683186215048_11_200x200.JPG");
            agencyArtistList.add(artistInfo);

        } else {}

        return agencyArtistList;
    }
}
