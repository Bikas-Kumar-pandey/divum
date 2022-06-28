package com.list.dto;

import lombok.Data;

import java.util.List;

@Data
public class RequestsDtos {
    private String name;
    private String country;
    private String subject;
    private List<Dtos> dtos;
}
