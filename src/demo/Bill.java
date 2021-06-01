/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


public class Bill {
    private String res_num, paid_on,cc_info,guest_username;
    private double payment_amount;
    public Bill(String res_num, String paid_on, double payment_amount, String cc_info, String guest_username){
        this.res_num = res_num;
        this.paid_on = paid_on;
        this.payment_amount = payment_amount;
        this.cc_info= cc_info;
        this.guest_username = guest_username;
    }
  
    public Bill(String res_num, double payment_amount, String cc_info,String paid_on){
        this.res_num = res_num;
        this.payment_amount = payment_amount;
        this.cc_info = cc_info;
        this.paid_on = paid_on;
    }
    public String getResNum(){
        return res_num;
    }
    public String getPayDate(){
        return paid_on;
    }
    public double getAmount(){
        return payment_amount;
    }
    public String getCC(){
        return cc_info;
    }
    public String getGuest(){
        return guest_username;
    }
}
