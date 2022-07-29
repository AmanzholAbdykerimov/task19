package com.company;

public class Hostel extends Human {
    String adress;
    int residents;
    int rent;
    @Override
    public String toString() {
        return "Obshejitie po adressu "+adress+" platyat za mesyas "+rent+" jivut "+residents+" clelovek   Spisok:";}

    public Hostel(String adress, int residents, int rent) {
        super(null,0,null);
        this.adress = adress;
        this.residents=residents;
        this.rent = rent;
    }
}



