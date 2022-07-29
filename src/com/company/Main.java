package com.company;

public class Main {
    public static void main(String[] args) {
        Human[][] hotels={{new Hotel("Abdurakhmanov 1",3,25000)},
                {new Human("Askat",27,"Atasy"),
                new Human("Asema",24,"Apasy"),
                new Human("Malika",7,"kyzy")}};
        Human[][] houses={{new House("Botkina 4",4,3000)},
                {new Human("Samat",29,"Atasy"),
                        new Human("Asel",24,"Apasy"),
                        new Human("Sezim",7,"kyzy"),
                        new Human("Aktan",3,"balasy")}};
        Human[][] hostels={{new Hostel("Turusbekova 7",2,24000)},
                {new Human("Erkin",29,"Kuiosu"),
                        new Human("Jamiyla",24,"Ayaly")}};
        System.out.println(hostels[0][0].toString());
        for (int i=0;i<2;i++){
            System.out.println(hostels[1][i].toString());
        }
        System.out.println("     ");
        System.out.println(houses[0][0].toString());
        for (int i=0;i<4;i++){
            System.out.println(houses[1][i].toString());
        }
        System.out.println("     ");
        System.out.println(hotels[0][0].toString());
        for (int i=0;i<3;i++){
            System.out.println(hotels[1][i].toString());
        }
        System.out.println("     ");
    }
}

        /*                УЙ ТАПШЫРМА №19
        ЕЩЁ
        1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
        2. Квартирада жашагандар ком услуга толошот
        3. Общежитие менен гостиницада жашагандар аренда толошот
        4. Уй-булолор бир канча адамдан турушат
        5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
        6. Жашоо демек озунун адресин корсотуу      */