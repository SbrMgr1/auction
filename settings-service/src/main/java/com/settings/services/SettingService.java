package com.settings.services;

import com.wsdl.SettingResponse;
import com.wsdl.SettingRequest;
import org.springframework.stereotype.Service;

@Service
public class SettingService {
    public SettingResponse getResponse(SettingRequest settingResquest){

        SettingResponse settingResp = new SettingResponse();
        settingResp.setSiteName("Auction");
        settingResp.setAuctionResetTime(20);
        settingResp.setLoginCredit(5);
        return settingResp;
    }
}
