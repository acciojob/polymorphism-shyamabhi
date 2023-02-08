package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(5,1);
        p.product(5,1,2);
        p.product(5,4);

    }
    public static class Product{
        public int product(int x, int y) {
            return x;
        }
        public int product(int x, int y, int z) {
            return x;
        }
        public double product(double x, double y) {
            return y;
        }
    }
}