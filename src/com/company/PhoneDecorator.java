package com.company;

public abstract class PhoneDecorator implements Phone{
    private Phone newPhone;
    public PhoneDecorator(Phone newPhone)  {
        this.newPhone=newPhone;
    }
    @Override
    public String typeOfPhone(){
        return newPhone.typeOfPhone();
    }
    public double price(){
        return newPhone.price();
    }
}
