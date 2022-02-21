package com.company;

import java.util.Objects;

public class Apple {
    private int price;

    public Apple() {
    }

    public Apple(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return price == apple.price;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
