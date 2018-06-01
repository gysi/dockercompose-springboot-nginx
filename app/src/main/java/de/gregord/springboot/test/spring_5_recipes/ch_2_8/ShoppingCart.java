package de.gregord.springboot.test.spring_5_recipes.ch_2_8;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope("prototype")
@Lazy
public class ShoppingCart {

    private List<Product> items = new ArrayList<>();

    void addItem(Product item){
        this.items.add(item);
    }

    void addItems(Product... items){
        Collections.addAll(this.items, items);
    }

    List<Product> getItems(){
        return this.items;
    }
}
