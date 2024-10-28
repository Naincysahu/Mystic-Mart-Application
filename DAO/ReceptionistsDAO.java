package eMart.dao;

import eMart.pojo.ReceptionistPojo;
import eMart.pojo.UserPojo;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//created for viewAllReceptionist()
public class ReceptionistsDAO {
    public static boolean addReceptionist(UserPojo up) throws SQLException{ //called when AddReceptionist wale frmae me poora data aa gya hoga or manager add button pr click kr rha hoga
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO Users(UserId,EmpId,Password,UserType,UserName) VALUES(?,?,?,?,?)");
        ps.setString(1,up.getUserId());
        ps.setString(2,up.getEmpId());
        ps.setString(3,up.getPassword());
        ps.setString(4,up.getUserType());
        ps.setString(5,up.getUserName());
        int rowsAffected=ps.executeUpdate();
        if(rowsAffected==1)
            return true;
        return false;
    }
    
    public static Map<String,String> getAllNonRegisteredRecep() throws SQLException{    //called by AddReceptionist frame 
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT EmpId,EmpName FROM Employees WHERE Job='Receptionist' and EmpId NOT IN (SELECT EmpId FROM Users WHERE UserType='Receptionist')");
        HashMap<String,String> recepList=new HashMap<>();
        while(rs.next()){
            String recepId=rs.getString(1);
            String recepName=rs.getString(2);
            recepList.put(recepId,recepName);
        }
        return recepList;
    }
    public static ArrayList<ReceptionistPojo> viewAllRegisteredReceptionist() throws SQLException{  //called by ViewAllReceptionist frame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT Employees.EmpId,EmpName,Job,Salary,UserId FROM Employees,Users WHERE Job='Receptionist' and Users.EmpId=Employees.EmpId");
        ArrayList<ReceptionistPojo> recepList=new ArrayList<>();
        while(rs.next()){
            ReceptionistPojo rp=new ReceptionistPojo();
            rp.setEmpId(rs.getString(1));
            rp.setEmpName(rs.getString(2));
            rp.setJob(rs.getString(3));
            rp.setSalary(rs.getDouble(4));
            rp.setUserId(rs.getString(5));
            recepList.add(rp);
        }
        return recepList;
    }
     public static Map<String,String> getAllRegisteredRecep() throws SQLException{  //called by UpdateReceptionist frame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT UserId,UserName FROM Users WHERE UserType='Receptionist'");
        
        HashMap<String,String> recepList=new HashMap<>();
        while(rs.next()){
            recepList.put(rs.getString(1),rs.getString(2));
        }
        return recepList;   
    }
    public static boolean updateReceptionistPassword(String userId ,String pwd) throws SQLException{
         Connection conn=eMart.dbutil.DBUtil.getConnection();
         PreparedStatement ps=conn.prepareStatement("Update Users SET Password=? WHERE UserId=?");
         ps.setString(1, pwd);
         ps.setString(2, userId);
         return ps.executeUpdate()==1;
    }
    public static ArrayList<String> getRegisteredRecep() throws SQLException{  //called by RemoveReceptionist frame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT UserId FROM Users WHERE UserType='Receptionist'");
        ArrayList<String> recepList=new ArrayList<>();
        while(rs.next()){
            recepList.add(rs.getString(1));
        }
        return recepList;   
    }

    public static boolean deleteRegisteredReceptionist(String recepid) throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM Users WHERE UserId=?");
        ps.setString(1,recepid);
        return ps.executeUpdate()==1;
    }
}
