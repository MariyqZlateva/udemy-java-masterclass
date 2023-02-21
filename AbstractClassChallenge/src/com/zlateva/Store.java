package com.zlateva;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}

public class Store {

    private static ArrayList<ProductForSale> productForSales = new ArrayList<>();

    public static void main(String[] args) {

        Dress dress = new Dress("Dress", 300.8, "long, black");

        productForSales.add(dress);
        productForSales.add(new Jeans("Jeans", 50, "straight leg"));
        productForSales.add(new Shirt("Shirt", 30, "Oxford Shirt"));
        for (ProductForSale productForSale : productForSales) {
            manageProducts(productForSale);
        }

        System.out.println("\nOrder1");
        var order1 = new ArrayList<OrderItem>();
        addItemToTheOrder(order1, 1, 2);
        addItemToTheOrder(order1, 0, 1);
        printTheOrderedItems(order1);

        System.out.println("\nOrder2");
        var order2 = new ArrayList<OrderItem>();
        addItemToTheOrder(order2, 1, 2);
        addItemToTheOrder(order2, 2, 1);
        printTheOrderedItems(order2);

    }

    public static void manageProducts(ProductForSale productForSale) {
        productForSale.showDetails();
    }

    public static void addItemToTheOrder(ArrayList<OrderItem> order, int orderIndex,
                                         int quantity) {
        order.add(new OrderItem(quantity, productForSales.get(orderIndex)));
    }

    public static void printTheOrderedItems(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printItemizedLineItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }
}