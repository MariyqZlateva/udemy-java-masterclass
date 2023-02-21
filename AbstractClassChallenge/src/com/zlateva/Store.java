package com.zlateva;

import java.util.ArrayList;

public class Store {


    public static void main(String[] args) {

        Dress dress = new Dress("Dress", 300.8, " long, black");
        ArrayList<ProductForSale> productForSales = new ArrayList<>();
        productForSales.add(dress);
        productForSales.add(new Jeans("Jeans", 50, "straight leg"));
        productForSales.add(new Shirt("Shirt", 30, "Oxford Shirt"));
        for (ProductForSale productForSale: productForSales){
            manageProducts(productForSale);
        }
        ArrayList<ProductForSale> order = new ArrayList<>();
        addItemToTheOrder(dress, order);
        
    }

    public static void manageProducts(ProductForSale productForSale) {
        productForSale.showDetails();
    }

    public static void addItemToTheOrder(ProductForSale product, ArrayList<ProductForSale> order){
        order.add(product);
    }

    public static void printTheOrderedItems(){

    }
}