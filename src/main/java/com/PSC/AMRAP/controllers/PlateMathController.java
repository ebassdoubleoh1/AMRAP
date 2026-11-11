package com.PSC.AMRAP.controllers;

import com.PSC.AMRAP.models.Request;
import com.PSC.AMRAP.models.Response;
import com.PSC.AMRAP.services.PlateMathService;
import org.springframework.stereotype.Controller;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class PlateMathController {

    @GetExchange
    public static Response getPlateMath(Request request){
        return PlateMathService.firstMethod(request);
    }
}
