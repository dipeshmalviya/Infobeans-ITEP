/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeee;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author malvi
 */


public class FileoutputStream {

    public static void addEmployee(Employee emp) {
        try (FileOutputStream fos = new FileOutputStream("Employee.txt", true)) {
            String line = emp.toString() + "\n";
            fos.write(line.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
