 package eMart.dao;
import eMart.dbutil.DBUtil;
import eMart.pojo.UserPojo;
import eMart.pojo.UserProfile;
import java.sql.*;

public class UsersDAO {
    public static boolean validateUser(UserPojo user) throws SQLException{   //LoginJFrame
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM Users WHERE UserId=? and Password=? and UserType=?");
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            UserProfile.setUserName(rs.getString(5));
            return true;
        }
        return false;
    }
    
    public static boolean isUserPresent(String empId) throws SQLException{  //updateEmp()-->EmployeeDAO class
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM Users WHERE EmpId=?");
        ps.setString(1,empId);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return true;
        }
        return false;
    }
}
