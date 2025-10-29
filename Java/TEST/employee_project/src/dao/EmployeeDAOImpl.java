package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Employee;
import util.DBConnection;

public class EmployeeDAOImpl implements EmployeeDAO{
	public  boolean add(Employee e) {
		  boolean status = true;
		  try (Connection con = DBConnection.getConnection();){
			  String sql = "insert into employee(name,email,salary,department) values(?,?,?,?)";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, e.getName());
			  ps.setString(2, e.getEmail());
			  ps.setInt(3, e.getSalary());
			  ps.setString(4, e.getDepartment());
			  if(ps.executeUpdate()!=0)
				  return true;
		  }
		  catch(Exception ee) {
			  ee.printStackTrace();
		  }
		  return status;
	  }
	  public boolean update(Employee e) {
		  try (Connection con = DBConnection.getConnection();){
			  String sql = "update employee set name = ?, email = ?, salary = ?, department = ? where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, e.getName());
			  ps.setString(2, e.getEmail());
			 ps.setInt(3, e.getSalary());
			  ps.setInt(4, e.getId());
			  if(ps.executeUpdate()!=0)
				  return true;
		  }
		  catch(Exception ee) {
			  ee.printStackTrace();
		  }
		  return false;
	  }
	  public  ArrayList<Employee> viewAll(){
		 ArrayList<Employee> al = new ArrayList<Employee>(); 
		 try (Connection con = DBConnection.getConnection();){
			 String sql = "select * from employee";
			 PreparedStatement ps = con.prepareStatement(sql);
			 ResultSet rs =  ps.executeQuery();
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String email = rs.getString(3);
				 int salary  =rs.getInt(4);
				 String department = rs.getString(5);
				 Employee emp = new Employee(id,name,email,salary,department);
				 al.add(emp);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return al;
	  }
	  public  boolean delete(int id) {
		  try (Connection con = DBConnection.getConnection();){
			  String sql = "delete from employee where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setInt(1, id);
			  if(ps.executeUpdate()!=0)
				  return true;
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  return false;
	  }
}
