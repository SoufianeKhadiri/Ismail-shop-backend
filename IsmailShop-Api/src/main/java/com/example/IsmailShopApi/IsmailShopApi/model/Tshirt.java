package com.example.IsmailShopApi.IsmailShopApi.model;

import java.util.List;

public class Tshirt extends Item {

    public Tshirt() {
    }

    public Tshirt(String name, String price, String size, List<String> fotos) {
        super(name, price, size, fotos);
    }
}
