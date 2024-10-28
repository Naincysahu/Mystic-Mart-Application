package eMart.pojo;
public class ProductPojo {
    //only 7 data members out of 8 
    private String prodId;
    private String prodName;
    private String prodCompany;
    private double prodPrice;
    private double ourPrice;
    private int tax;
    private int quantity;
    private double total;
    
    public ProductPojo(){
        
    }

    public ProductPojo(String prodId, String prodName, String prodCompany, double prodPrice, double ourPrice, int tax, int quantity,double total) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCompany = prodCompany;
        this.prodPrice = prodPrice;
        this.ourPrice = ourPrice;
        this.tax = tax;
        this.quantity = quantity;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdCompany() {
        return prodCompany;
    }

    public void setProdCompany(String prodCompany) {
        this.prodCompany = prodCompany;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public double getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(double ourPrice) {
        this.ourPrice = ourPrice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
