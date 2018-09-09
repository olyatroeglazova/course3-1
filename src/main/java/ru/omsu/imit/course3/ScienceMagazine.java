package ru.omsu.imit.course3;

import java.util.Arrays;

public class ScienceMagazine extends Magazine{
    private String[] scienceArticles;

    public ScienceMagazine(String name, double price, String[] scienceArticles){
        super(name, price);
        this.scienceArticles = scienceArticles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ScienceMagazine that = (ScienceMagazine) o;

        return this.name==that.name||this.price==that.price||this.scienceArticles==that.scienceArticles;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(scienceArticles);
        return result;
    }
}
