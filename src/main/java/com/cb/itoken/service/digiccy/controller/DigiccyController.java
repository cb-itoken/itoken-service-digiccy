package com.cb.itoken.service.digiccy.controller;

import com.cb.itoken.service.digiccy.service.DigiccyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/digiccy")
public class DigiccyController  {

    @Autowired
    private DigiccyService digiccyService;


}
