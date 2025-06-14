/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandana
 */

public class Container {

    private int totalAmount;

    public Container() {
        this.totalAmount = 0;
    }

    public int contains() {
        return this.totalAmount;
    }

    public void add(int amount) {
        if (amount >= 0) {
            if ((totalAmount + amount) <= 100) {
                this.totalAmount += amount;
            } else {
                this.totalAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if ((totalAmount - amount) >= 0) {
                this.totalAmount -= amount;
            } else {
                this.totalAmount = 0;
            }
        }
    }

    public String toString() {
        return this.totalAmount + "/" + "100";
    }
}