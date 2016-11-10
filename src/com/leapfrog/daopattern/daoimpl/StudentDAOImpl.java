/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern.daoimpl;

import com.leapfrog.daopattern.dao.StudentDao;
import com.leapfrog.daopattern.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class StudentDAOImpl implements StudentDao{
    List<Student>studentList=new ArrayList<>();
    @Override
    public boolean insert(Student s) {
       return studentList.add(s);
        
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public boolean delete(int id) {
        for(Student s:studentList){
            if(s.getId()==id){
                return studentList.remove(s);
            }
            
        }        
        return false;
    }

    @Override
    public Student getById(int id) {
        for(Student s:studentList){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
    
}
