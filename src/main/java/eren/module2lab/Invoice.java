/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.module2lab;

/**
 *
 * @author ereni
 */
public class Invoice{
private String partnum;
private String partdesc;
private int quantity;
private double priceperitem;

    public Invoice(String partnum, String partdesc, int quantity, double priceperitem) {
        this.partnum = partnum;
        this.partdesc = partdesc;
        this.quantity = quantity;
        this.priceperitem = priceperitem;
    }

    public void setPartnum(String partnum) {
        this.partnum = partnum;
    }

    public void setPartdesc(String partdesc) {
        this.partdesc = partdesc;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPriceperitem(double priceperitem) {
        if (priceperitem > 0.0){
            this.priceperitem=priceperitem;
        }
        else{
            this.priceperitem=0.0;
        }
    }


    public String getPartnum() {
        return partnum;
    }

    public String getPartdesc() {
        return partdesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPriceperitem() {
        return priceperitem;
    }
public double getInvoiceAmount(){
    return quantity * priceperitem;
}

    
}
