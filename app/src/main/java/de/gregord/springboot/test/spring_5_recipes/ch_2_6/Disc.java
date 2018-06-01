package de.gregord.springboot.test.spring_5_recipes.ch_2_6;

public class Disc extends Product {

    private int capacity;

    public Disc(int capacity) {
        this.capacity = capacity;
    }

    public Disc(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
