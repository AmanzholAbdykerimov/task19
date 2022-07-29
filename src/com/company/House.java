package com.company;

public class House extends Human {
    String adress;
    int residents;
    int service;
    @Override
    public String toString() {
        return "Dom po adressu "+adress+" platyat za mesyas "+service+" jivut "+residents+" clelovek   Spisok:";}

    public House(String adress, int residents, int service) {
        super(null,0,null);
        this.adress = adress;
        this.residents=residents;
        this.service=service;
    }
}



