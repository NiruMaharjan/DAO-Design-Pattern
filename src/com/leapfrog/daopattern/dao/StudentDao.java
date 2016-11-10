/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern.dao;

import com.leapfrog.daopattern.entity.Student;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface StudentDao {
    public boolean insert(Student s);
    List<Student>getAll();
    boolean delete(int id);
    Student getById(int id);
}
