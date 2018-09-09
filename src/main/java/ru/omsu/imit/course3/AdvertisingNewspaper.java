package ru.omsu.imit.course3;

import java.util.Arrays;

public class AdvertisingNewspaper extends Newspaper {
    private String[] advertising;

    public AdvertisingNewspaper(String name, double price, String[] articles, String[] advertising){
        super(name, price, articles);
        this.advertising = advertising;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdvertisingNewspaper that = (AdvertisingNewspaper) o;

        return this.name==that.name||this.price==that.price||this.articles==that.articles||this.advertising==that.advertising;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(advertising);
    }
}
