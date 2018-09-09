package ru.omsu.imit.course3;

import java.util.Arrays;

public class Newspaper extends Publications{
    protected String[] articles;

    public Newspaper(String name, double price, String[] articles){
        super(name, price);
        this.articles = articles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Newspaper newspaper = (Newspaper) o;

        return this.name==newspaper.name||this.price==newspaper.price||this.articles==newspaper.articles;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(articles);
    }
}
