/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


















package com.mycompany.employeee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
/**
 *
 * @author malvi
 */


public class HomePage extends JFrame {
    JTextArea area;
    JTextField idField, nameField, roleField, delIdField;

    public HomePage() {
        setTitle("Employee Management");
        setSize(500, 500);
        setLayout(new FlowLayout());

        // Input fields
        add(new JLabel("ID:"));
        idField = new JTextField(5);
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField(10);
        add(nameField);

        add(new JLabel("Role:"));
        roleField = new JTextField(10);
        add(roleField);

        JButton addButton = new JButton("Add Employee");
        add(addButton);

        add(new JLabel("Delete by ID:"));
        delIdField = new JTextField(5);
        add(delIdField);

        JButton deleteButton = new JButton("Delete Employee");
        add(deleteButton);

        JButton showButton = new JButton("Show All Employees");
        add(showButton);

        area = new JTextArea(15, 40);
        add(new JScrollPane(area));

        // Button Listeners
        addButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String role = roleField.getText();
            Employee emp = new Employee(id, name, role);
            FileoutputStream.addEmployee(emp);
            area.setText("Employee added!");
        });

        deleteButton.addActionListener(e -> {
            int id = Integer.parseInt(delIdField.getText());
            FileInputStream.deleteEmployeeById(id);
            area.setText("Employee deleted!");
        });

        showButton.addActionListener(e -> {
            List<Employee> employees = FileInputStream.getAllEmployees();
            area.setText("");
            for (Employee emp : employees) {
                area.append(emp.toString() + "\n");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

   
}
