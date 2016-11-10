/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern.controller;

import com.leapfrog.daopattern.daoimpl.StudentDAOImpl;
import com.leapfrog.daopattern.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StudentDAOController {

    private Scanner input;
    private StudentDAOImpl stdDao;

    public StudentDAOController(Scanner input, StudentDAOImpl stdDao) {
        this.input = input;
        this.stdDao = stdDao;
    }

    public void menu() {
        System.out.println("1.Add Students");
        System.out.println("2.List students");
        System.out.println("3.Delete students by id");
        System.out.println("4.get student by id");
        System.out.println("5.Exit");
        System.out.println("Enter your choice[1-5]");
    }

    public void add() {
        while (true) {
            Student student = new Student();
            System.out.println("Enter id");
            student.setId(input.nextInt());
            System.out.println("Enter first name");
            student.setFirstName(input.next());
            System.out.println("Enter last name");
            student.setLastName(input.next());
            System.out.println("Enter email");
            student.setEmail(input.next());
            System.out.println("Enter address");
            student.setAddress(input.next());
            stdDao.insert(student);
            System.out.println("Do you want to add more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void ListAll() {
        
        System.out.println("Listing all elements");
        for (Student s : stdDao.getAll()) {
            System.out.println(s.toString());
            
       
        }
    }
    
    public void delete(){
        while(true){
            System.out.println("Enter id to delte");
            int id=input.nextInt();
            stdDao.delete(id);
            System.out.println("Do you want to delete more?[y/n]");
            if(input.next().equalsIgnoreCase("n"))
                break;
        }
        
    }
    
    public void searchById(){
        
        while (true){
            System.out.println("Enter id to search");
            int id=input.nextInt();
            Student s=stdDao.getById(id);
            System.out.println(s.toString());
            System.out.println("Do you want to seatch more?[y/n]");
            if(input.next().equalsIgnoreCase("n"))
                break;
        }
    }

    public void process() {
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    ListAll();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    searchById();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }

}
