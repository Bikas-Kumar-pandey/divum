package com.list.service;

import com.list.dto.DemoDto;
import com.list.dto.RequestDto;
import com.list.dto.RequestsDtos;
import com.list.entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ListService {

    void listDemo(RequestDto request);

    void listDemoPath(String name, String country, String subject);

    void saveAsList(RequestDto request);

    void saveAsListofDto(List<RequestDto> request);

    void mappings(RequestDto request);

    void mappingss(RequestDto request);

    void mappingInSameDto(RequestsDtos request);

    void dataUsingId(int id) throws Exception;

    void usingMap(Map<String, String> demo);

    void modeMapper(RequestsDtos request);

    void useOFforEach(int id);


    ResponseEntity<Student> updateStudent(int id, RequestDto student) throws Exception;

    Student updateStudentByName(String name, RequestDto student);

    String deleteData(int id);

    Student patchDemo(int id,RequestDto student);

    String allMapDemo(List<DemoDto> requestDto);

    String deleteMap( int id);
}
