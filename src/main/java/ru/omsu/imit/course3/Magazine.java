package ru.omsu.imit.course3;

import java.util.Arrays;

public class Magazine extends Publications {
    private String[] articles;

    public Magazine(String name, double price, String[] articles){
        super(name, price);
        this.articles = articles;
    }

    Magazine(String name, double price){
        super(name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        return this.name==magazine.name||this.price==magazine.price||this.articles==magazine.articles;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(articles);
    }
}
