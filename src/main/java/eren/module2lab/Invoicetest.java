/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.module2lab;

/**
 *
 * @author ereni
 */
public class Invoicetest {
    public static void main(String[] args){
    Invoice NewInvoice = new Invoice("1580", "Bolts", 5, 2.0);
    System.out.println("Invoice amount: $" + NewInvoice.getInvoiceAmount());
    System.out.println("Quantity:"+ NewInvoice.getQuantity());
    System.out.println("Price per Item: $"+ NewInvoice.getPriceperitem());
    System.out.println("Part Description:"+ NewInvoice.getPartdesc());
    System.out.println("Part Number:"+NewInvoice.getPartnum());
}
}