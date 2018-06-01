package de.gregord.springboot.test.spring_5_recipes.ch_2_5;

public class Battery extends Product {

    private boolean rechargeable;

    public Battery(){
        super();
    }

    public Battery(String name, double price, boolean rechargeable){
        super(name, price);
        this.rechargeable = rechargeable;
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
