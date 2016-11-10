/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern;

import com.leapfrog.daopattern.controller.StudentDAOController;
import com.leapfrog.daopattern.daoimpl.StudentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDAOController sc=new StudentDAOController(new Scanner(System.in),new StudentDAOImpl());
        sc.process();
    }
    
    
}
