package com.alasdoo.developercourseassignment.service.impl;

import com.alasdoo.developercourseassignment.dto.TeacherDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl {

    public TeacherDTO findOne(Integer id) {
        return null;
    }

    public List<TeacherDTO> findAll() {
        return null;
    }

    public TeacherDTO save(TeacherDTO teacherDTO) {
        return null;
    }

    public void remove(Integer id) throws IllegalArgumentException {
    }

    public TeacherDTO update(Integer id, TeacherDTO teacherDTO) {
    	Optional<Teacher> oldTeacher = teacherRepository.findById(id);
        if (!oldTeacher.isPresent()) {
            throw new IllegalArgumentException
                ("Teacher with the following id = " + id + " is not found.");
        }
        oldTeacher.get().setTeacherName(teacherDTO.getTeacherName());
        oldTeacher.get().setTeacherSurname(teacherDTO.getTeacherSurname());
        oldTeacher.get().setTeacherEmail(teacherDTO.getTeacherEmail());      
        teacherRepository.save(oldTeacher.get());
        return teacherMapper.transformToDTO(oldTeacher.get());
    }

    public TeacherDTO findByTeacherNameAndTeacherSurname(String name, String surname) {
        return null;
    }

    public TeacherDTO findByTeacherEmail(String email) {
        return null;
    }
}
