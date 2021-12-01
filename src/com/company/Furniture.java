package com.company;

public abstract class Furniture {
    private String manufacturer; // этот параметр: производитель
    private int price; // цена
    private String material; // материал

    public Furniture(String manufacturer, int price, String material) { // конструктор
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    public String getManufacturer() { // getter нужен, чтобы возвращать значения
        return manufacturer;
    }

    public String getMaterial() { // getter нужен, чтобы возвращать значения
        return material;
    }

    public int getPrice() { // getter нужен, чтобы возвращать значения
        return price;
    }
}
