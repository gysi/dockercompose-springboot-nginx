package de.gregord.springboot.test.spring_5_recipes.ch_2_2;

public abstract class Product {
    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("%s %s",
                this.name,
                this.price
        );
    }
}
