package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();


    public int size() {
        return products.size();
    }

    public void displayAllProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "\t" + products.get(i));
        }
    }

    public void addNewProduct(int index, Product product) {
        this.products.add(index, product);
    }

    public void updateProduct(int index, Product newProduct) {
        this.products.set(index, newProduct);
    }

    public void removeProduct(int index) {
        this.products.remove(index);
    }

    public void priceIncreasingSort() {
        PriceIncreasing priceComparator=new PriceIncreasing();
        Collections.sort(products,priceComparator);
        this.displayAllProduct();
    }
    public void priceDecreasingSort() {
        PriceDecreasing priceReduce=new PriceDecreasing();
        Collections.sort(products,priceReduce);
        this.displayAllProduct();
    }
    public void findProductByName(String nameProduct) {
        boolean checkProduct = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(nameProduct)) {
                checkProduct = true;
                System.out.println((i + 1) + "\t" + products.get(i));
                break;
            }
        }
        if (checkProduct == false) {
            System.out.println("không có sản phẩm mà bạn đang tìm kiếm");
        }
    }
}
