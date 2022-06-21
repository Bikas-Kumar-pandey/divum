package com.list.service;

import com.list.dto.RequestDto;

import java.util.List;

public interface ListService {

    void listDemo(RequestDto request);

    void listDemoPath(String name, String country, String subject);

    void saveAsList(RequestDto request);

    void saveAsListofDto(List<RequestDto> request);
}
