package com.company;

public class Iphone13ProMax extends PhoneDecorator{
    public Iphone13ProMax(Phone newPhone) {
        super(newPhone);
    }

    public String typeOfPhone(){
        return super.typeOfPhone() +" Iphone 13 Pro Max";
    }
    public double pPrice()   {
        return super.price()+500.0;
    }
}
