/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeee;

import java.io.*;
import java.util.*;

/**
 *
 * @author malvi
 */

public class FileInputStream {

    public static List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        File file = new File("Employee.txt");
        if (!file.exists()) return list;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.trim().isEmpty()) {
                    list.add(Employee.fromString(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void deleteEmployeeById(int idToDelete) {
        List<Employee> updatedList = new ArrayList<>();
        for (Employee emp : getAllEmployees()) {
            if (emp.getId() != idToDelete) {
                updatedList.add(emp);
            }
        }

        try (FileOutputStream fos = new FileOutputStream("Employee.txt", false)) {
            for (Employee emp : updatedList) {
                String line = emp.toString() + System.lineSeparator();
                fos.write(line.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}