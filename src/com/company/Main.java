package com.company;
public class Main {
    public static void main(String[] args) {
        Furniture furniture = new Bookcase("Березовая роща", 15000, "дуб"); //  объект курастырдык
        System.out.println("Производитель: " + furniture.getManufacturer());
        System.out.println("Стоимость: " + furniture.getPrice());
        System.out.println("Материал: " + furniture.getMaterial());
    }
}
