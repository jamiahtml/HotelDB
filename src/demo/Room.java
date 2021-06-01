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
public class Room {
    private String r_num, c_Ssn,r_description,r_name;
    private boolean r_available;
    private int r_price, r_beds, r_capacity,r_floor;
    public Room(String r_num, String c_Ssn, String r_description, int r_price, int r_beds, int r_capacity, String r_name, int r_floor, boolean r_available){
        this.r_num = r_num;
        this.c_Ssn = c_Ssn;
        this.r_description = r_description;
        this.r_price = r_price;
        this.r_beds = r_beds;
        this.r_capacity = r_capacity;
        this.r_name = r_name;
        this.r_floor = r_floor;
        this.r_available = r_available;
        
    }
    public Room (String r_num, String r_name,String r_description, int r_price){
        this.r_num = r_num;
        this.r_name = r_name;
        this.r_description  = r_description;
        this.r_price = r_price;
    }
    public String getRoomNum(){
        return r_num;
    }public String getCleaner(){
        return c_Ssn;
    }
    public String getDescription(){
        return r_description;
    }
    public int getPrice(){
        return r_price;
    }
    public int getBeds(){
        return r_beds;
    }
    public int getCapacity(){
        return r_capacity;
    }
    public String getRoomName(){
        return r_name;
    }
    public int getFloor(){
        return r_floor;
    }
    public boolean isAvailable(){
        return r_available;
    }
    
}
