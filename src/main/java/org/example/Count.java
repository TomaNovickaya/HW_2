package org.example;

/**
 * Счет, входит в портфолио имеет стоимость
 */
public class Count implements Lemon {

    public int quantity;

    public Count(int quantity) {

        this.quantity= quantity;
    }

    @Override
    public int getQuantity() {

        return quantity;
    }
}
