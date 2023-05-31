package org.likelion.item;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    private String manger;

    public Item(){

    }

    public Item(String itemName, Integer price, Integer quantity, String manger){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.manger = manger;
    }
}
