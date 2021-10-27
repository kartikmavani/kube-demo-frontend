package com.kubedemo.frontend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FrontEndController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FrontEndController.class);

    private static Map<String, Date> REQUEST_MAP = new HashMap<>();

    @GetMapping(path = "/getList")
    public Map<String, Date> getAllBackEndSystems() {
        Map<String, Date> returnValue = new HashMap<>(REQUEST_MAP);
        REQUEST_MAP.clear();
        return returnValue;
    }

    @PostMapping(path = "/addToList")
    public boolean addToBackendSystems(@RequestParam String name) {
        REQUEST_MAP.put(name, new Date());
        return true;
    }

}
