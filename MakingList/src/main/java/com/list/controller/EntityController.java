package com.list.controller;

import com.list.dto.RequestDto;
import com.list.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntityController {

    @Autowired
    private ListService listService;


    @PostMapping("/data")
    public void listDemo(@RequestBody RequestDto request){
        listService.listDemo(request);
        return;
    }

    @RequestMapping("/save")
    public void listDemoPathVariable(@PathVariable String name,@PathVariable String country,@PathVariable String subject ){
        listService.listDemoPath(name,country,subject);
        return;
    }

    @PostMapping("/list")
    public void saveAsList(@RequestBody RequestDto request){
        listService.saveAsList(request);
        return;
    }

    @PostMapping("/dtolist")
    public void saveAsListofDto(List<RequestDto> request){
        listService.saveAsListofDto(request);
    }

}

