package src.POO;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    public Date expiratinDate;

    public Double getTotalToPay(){
        return price + tax;
    }
    public void calculateTax(){
        tax= price * 0.19;
    }
    /*
    public Boolean canItBeSold(){
        Date today = new Date();
        if(expiratinDate.after(today)){
            return false;
        }else {
            return  true;
        }
    }*/
    public Boolean canItBeSold(){
        Date today = new Date();
        return  !expiratinDate.after(today);
    }
}
