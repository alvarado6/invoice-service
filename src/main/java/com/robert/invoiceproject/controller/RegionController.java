package com.robert.invoiceproject.controller;

import com.robert.invoiceproject.Service.IRegionService;
import com.robert.invoiceproject.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionController {

    @Autowired
    private IRegionService regionService;

    @GetMapping("/region/list")
    public List<Region> findAllRegion(){
        return regionService.finsAllRegiones();
    }
}
