package eMart.dao;

import java.sql.SQLException;
import eMart.dbutil.DBUtil;
import eMart.pojo.EmployeePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeesDAO {
    public static String getNextEmpId() throws SQLException{  //called from AddEmployees frame to generate EmpId automatically
        Connection conn=DBUtil.getConnection();
        Statement stat=conn.createStatement();
        ResultSet rs=stat.executeQuery("SELECT MAX(EmpId) FROM Employees");
        rs.next();  //doubt
        String empId=rs.getString(1);
        int nextId=Integer.parseInt(empId.substring(1));
        nextId=nextId+1;
        return "E"+nextId;
    }
    public static boolean addEmp(EmployeePojo ep) throws SQLException{    //called from AddEmployees frame
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO Employees(EmpId,EmpName,Job,Salary) VALUES(?,?,?,?)");
        ps.setString(1, ep.getEmpId());
        ps.setString(2,ep.getEmpName());
        ps.setString(3,ep.getJob());
        ps.setDouble(4,ep.getSalary());
        int rowsAffected=ps.executeUpdate();
        /*if(rowsAffected>0){
            return true;
        }
        else{
            return false;
        }*/
        return rowsAffected==1;
    }
    public static ArrayList<EmployeePojo> viewAllEmp() throws SQLException{    //called by ViewAllEmployeesJFrame
        Connection conn=DBUtil.getConnection();
        Statement stat=conn.createStatement();
        ResultSet rs=stat.executeQuery("SELECT * FROM Employees");
        ArrayList<EmployeePojo> list=new ArrayList<>();
        while(rs.next()){
            EmployeePojo emp=new EmployeePojo();
            emp.setEmpId(rs.getString(1));
            emp.setEmpName(rs.getString(2));
            emp.setJob(rs.getString(3));
            emp.setSalary(rs.getDouble(4));
            list.add(emp);
        }
        return list;
    }
    public static boolean removeEmp(String empId) throws SQLException{  //called from RemoveEmployee frmae
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM Employees WHERE EmpId=?");
        ps.setString(1, empId);
        int rowsAffected=ps.executeUpdate();
        return rowsAffected==1;
    }
    public static ArrayList<String> getAllEmpId() throws SQLException{      //called from UpdateEmployee frmae
        Connection conn=DBUtil.getConnection();
        Statement stat=conn.createStatement();
        ResultSet rs=stat.executeQuery("Select EmpId From Employees");
        ArrayList<String> empIdList=new ArrayList<>();
        while(rs.next()==true){
            empIdList.add(rs.getString(1));
        }
        return empIdList;
    }
    public static EmployeePojo findEmpById(String empId) throws SQLException{    //called from UpdateEmployee frmae ,RemoveEmployeesJFrame
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from Employees where EmpId=?");
        ps.setString(1,empId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        EmployeePojo ep=new EmployeePojo();
        ep.setEmpId(rs.getString(1));
        ep.setEmpName(rs.getString(2));
        ep.setSalary(rs.getDouble(4));
        ep.setJob(rs.getString(3));
        return ep;
    }
    public static boolean updateEmp(EmployeePojo ep) throws SQLException{       //called from UpdateEmployee frmae
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE Employees SET EmpName=? ,Job=? ,Salary=? where EmpId=?");
        ps.setString(1, ep.getEmpName());
        ps.setString(2, ep.getJob());
        ps.setDouble(3,ep.getSalary());
        ps.setString(4, ep.getEmpId());
        int x=ps.executeUpdate();
        if(x==0)
            return false;
        else if(ep.getJob().equals("Manager") || ep.getJob().equals("Receptionist")){
             //Emp present in Employees table
            boolean userPresent=UsersDAO.isUserPresent(ep.getEmpId());  //check Employee present in Users table
            if(userPresent==false)
                return true;  //Emp not present in Users table but present in Employees table
            //Emp present in both Users table and Employees table
            ps=conn.prepareStatement("UPDATE Users SET UserName=? ,UserType=?  where EmpId=?");
            ps.setString(1,ep.getEmpName());
            ps.setString(2, ep.getJob());
            ps.setString(3,ep.getEmpId());
            int y=ps.executeUpdate();  //return either 0 or 1
            return y==1;  //true
        }
        return true;  //Emp present in Employees table but not in Users table and Emp is neither Manager nor Receptionist
    }

    public static ArrayList<String> getAllEmployeesId() throws SQLException{    //called by RemoveEmployee frame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT EmpId FROM Employees");
        ArrayList<String> empList=new ArrayList<>();
        while(rs.next()){
            empList.add(rs.getString(1));
        }
        return empList;   
    }
}
