package com.list.service;

import com.list.dto.RequestDto;
//import com.list.dto.Response;
import com.list.entity.ListEntity;
import com.list.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListServiceImpl implements ListService{

@Autowired
private ListRepository repo;

//@Autowired
//private Response response;

@Override
    public void listDemo(RequestDto request) {
    ListEntity entity = new ListEntity();
    entity.setCountry(request.getCountry());
       entity.setName(request.getName()); ;
        entity.setSubject(request.getSubject());
        repo.save(entity);

    }

    @Override
    public void listDemoPath(String name, String country, String subject) {
        ListEntity entity = new ListEntity();
        entity.setName(name);
        entity.setCountry(country);
        entity.setSubject(subject);
        repo.save(entity);

    }

    @Override
    public void saveAsList(RequestDto request) {
        ListEntity entity = new ListEntity();
        List<ListEntity> list = new ArrayList<>();
        List<RequestDto> list1 = new ArrayList<>();
        entity.setCountry(request.getCountry());
        entity.setName(request.getName()); ;
        entity.setSubject(request.getSubject());
        list.add(entity);
        repo.saveAll(list);
    }

    @Override
    public void saveAsListofDto(List<RequestDto> request) {
    List<ListEntity> list = new ArrayList<>();
       for(RequestDto requests:request){
           ListEntity entity = new ListEntity();
           entity.setSubject(requests.getSubject());
           entity.setCountry(requests.getCountry());
           entity.setName(requests.getName());
           list.add(entity);
       }
       repo.saveAll(list);
    }
}
