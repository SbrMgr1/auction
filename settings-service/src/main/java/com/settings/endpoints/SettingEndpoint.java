package com.settings.endpoints;

import com.settings.services.SettingService;
import com.wsdl.SettingResponse;
import com.wsdl.SettingRequest;
import org.springframework.beans.factory.NamedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SettingEndpoint {
    private static final String NAMESPACE = "http://www.wsdl.com";

    @Autowired
    SettingService settingService;

    @PayloadRoot(namespace = NAMESPACE, localPart = "SettingRequest")
    @ResponsePayload
    public SettingResponse getSetting(@RequestPayload SettingRequest request) {
        return settingService.getResponse(request);
    }
}
