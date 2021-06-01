/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author jamiaharper
 */
class Reservation {
    private String res_num, r_username, checkin, checkout,r_num,guest_uname;
    private int checkedIn, checkedOut;
    public Reservation(String res_num, String r_username, String checkin, String checkout, String r_num, String guest_uname, int checkedIn, int checkedOut){
        this.res_num = res_num;
        this.r_username = r_username;
        this.checkin = checkin;
        this.checkout = checkout;
        this.r_num = r_num;
        this.guest_uname = guest_uname;
        this.checkedIn = checkedIn;
        this.checkedOut  = checkedOut;
    }
    public Reservation(String res_num, String r_num, String checkin, String checkout){
        this.res_num = res_num;
        this.r_num = r_num;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    public String getResnum(){
        return res_num;
    }
    public String getReceptionist(){
        return r_username;
    }
    public String getCheckinD(){
        return checkin;
    }
    public String getCheckout(){
        return checkout;
    }
    public String getRoom(){
        return r_num;
    }
    public String getGuest(){
        return guest_uname;
    }
    public int isCheckin(){
        return checkedIn;
    }
    public int isCheckout(){
        return checkedOut;
       
    }
}
