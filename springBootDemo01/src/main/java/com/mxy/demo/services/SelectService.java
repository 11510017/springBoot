package com.mxy.demo.services;

import com.mxy.demo.domain.Student;
import com.mxy.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectService {
    @Autowired
    StudentMapper studentMapper;
    public List<Student> findAll(){
        return studentMapper.selectAll();
    }
}
