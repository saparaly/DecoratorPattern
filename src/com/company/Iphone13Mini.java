package com.company;

public class Iphone13Mini extends PhoneDecorator{
    public Iphone13Mini(Phone newPhone)    {
        super(newPhone);
    }
    public String typeOfPhone(){
        return super.typeOfPhone() +" iphone 13 mini  ";
    }
    public double price()   {
        return super.price()+300;
    }
}
