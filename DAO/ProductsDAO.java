package eMart.dao;

import eMart.dbutil.DBUtil;
import eMart.pojo.ProductPojo;
import java.sql.*;
import java.util.ArrayList;

public class ProductsDAO {
    public static String getNextProdId() throws SQLException{   // called by AddItem frame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select Max(ProId) FROM Products");
        rs.next();
        String prodId=rs.getString(1);
        if(prodId==null){
            prodId="P101";
            return prodId;
        }
        int nextProdId=Integer.parseInt(prodId.substring(1));
        nextProdId++;
        return "P"+(nextProdId) ;
    }
    public static boolean addItem(ProductPojo pp) throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO Products(ProId,ProName,ProCompany,ProPrice,"
                + "OurPrice,ProTax,Quantity,Status) VALUES(?,?,?,?,?,?,?,'Y')") ;
        ps.setString(1,pp.getProdId());
        ps.setString(2,pp.getProdName());
        ps.setString(3,pp.getProdCompany());
        ps.setDouble(4,pp.getProdPrice());
        ps.setDouble(5, pp.getOurPrice());
        ps.setInt(6, pp.getTax());
        ps.setInt(7,pp.getQuantity());
        int rowsAffected= ps.executeUpdate();
        return rowsAffected==1;
    }
    public static ArrayList<ProductPojo> viewAllItems() throws SQLException{   //used by DeleteItemJFrame ,UpdateItemJFrame;
        Connection conn=DBUtil.getConnection();
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("SELECT * FROM Products WHERE Status='Y'");
        ArrayList<ProductPojo> itemList=new ArrayList<>();
        while(rs.next()==true){
            ProductPojo pp=new ProductPojo();
            pp.setProdId(rs.getString(1));
            pp.setProdName(rs.getString(2));
            pp.setProdCompany(rs.getString(3));
            pp.setProdPrice(rs.getDouble(4));
            pp.setOurPrice(rs.getDouble(5));
            pp.setTax(rs.getInt(6));
            pp.setQuantity(rs.getInt(7));
            itemList.add(pp);
            
        }
        return itemList;
    }
    public static boolean deleteItem(String prodId) throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE Products Set Status='N' where ProId=?");
        ps.setString(1,prodId);
        return ps.executeUpdate()==1;
    }
    public static boolean updateItem(ProductPojo pp) throws SQLException{
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE Products SET ProName=?,ProCompany=?,ProPrice=?,OurPrice=?,ProTax=?,Quantity=? WHERE ProId=?");
        ps.setString(7,pp.getProdId());
        ps.setString(1,pp.getProdName());
        ps.setString(2,pp.getProdCompany());
        ps.setDouble(3,pp.getProdPrice());
        ps.setDouble(4, pp.getOurPrice());
        ps.setInt(5, pp.getTax());
        ps.setInt(6,pp.getQuantity());
        return ps.executeUpdate()==1;
    }
    
    //For receptionist (Billing Frame)
    
    public static ProductPojo getPurchasedProductDetails(String prodId) throws SQLException{    //called by BillingJFrame
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM Products WHERE ProId=?");
        ps.setString(1,prodId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        ProductPojo pp=new ProductPojo();
        pp.setProdId(rs.getString(1));
        pp.setProdName(rs.getString(2));
        pp.setProdCompany(rs.getString(3));
        pp.setProdPrice(rs.getDouble(4));
        pp.setOurPrice(rs.getDouble(5));
        pp.setQuantity(rs.getInt(7));    //will return total stock of that product present in eMart ,we will set it to 1 initially while generating bill
        pp.setTax(rs.getInt(6));
        return pp;
    }
    public static boolean reducePurchasedProductQuantiyFromStock(ArrayList<ProductPojo> purchasedProdList) throws SQLException{ //called when clicked on "Generate Bill" button
        //This method will be called 1 time for 1 bill 
        //the received arrayList will contain all the purchased items details of a bill but to update the Products table we require only prodId and Quantity
        Connection conn=eMart.dbutil.DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE Products SET Quantity=Quantity-? WHERE ProId=?");
        int totalPurchasedProducts=0;
        for(ProductPojo p:purchasedProdList){
            ps.setInt(1, p.getQuantity());
            ps.setString(2, p.getProdId());
            int rowsAffected=ps.executeUpdate();
            if(rowsAffected==1){
                totalPurchasedProducts++;  //will increment only when quantity of a product is updated successfully in Prodcts Table
            }
        }
        return totalPurchasedProducts==purchasedProdList.size();  //all purchased product's qunatity updated 

    }
}
