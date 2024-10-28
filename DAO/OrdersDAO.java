package eMart.dao;

import eMart.pojo.ProductPojo;
import eMart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrdersDAO {
    public static String getNextOrderId() throws SQLException{   // called by BillingJFrame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select Max(OrderId) FROM Orders");
        rs.next();  //will return a blank row(if first order add) or max orderId of order table
        String orderId=rs.getString(1);
        if(orderId==null){  
            orderId="O-101";
            return orderId;
        }
        int nextOrderId=Integer.parseInt(orderId.substring(1));
        nextOrderId++;
        return "O-"+(nextOrderId) ;
    }
    public static boolean addOrder(ArrayList<ProductPojo> purchasedProdList ,String orderId) throws SQLException{    //called by BillingJFrame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO Orders VALUES(?,?,?,?)");
        int count=0;
        for(ProductPojo item:purchasedProdList){
            ps.setString(1,orderId);
            ps.setString(2,item.getProdId());
            ps.setInt(3,item.getQuantity());
            ps.setString(4,UserProfile.getUserId());
            count+=ps.executeUpdate();   //executeUpdate() returns 0 or 1;
            
        }
        if(count==purchasedProdList.size())
            return true;
        return false;
    }
    /*public static ArrayList<String> getAllOrderIds() throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("SELECT OrderId FROM Orders");
        ArrayList<String> orderIdsList=new ArrayList<>();
        while(rs.next()==true){
            orderIdsList.add(rs.getString(1));            
        }
        return orderIdsList;
    }
    public static String getQuantity(String ordId) throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select Quanity from Orders where OrderId=?");
        ps.setString(1,ordId);
        return ps.executeQuery().toString(); //return quantity of OrderId product
    }*/
    /*public static OrdersDAO get2(String ordId) throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select ProId,Quantity from Orders where OrderId=?") ;
        ps.setString(1,ordId);
        ResultSet rs=ps.executeQuery();
        OrdersDAO o=new OrdersDAO();
        
    }*/
}
