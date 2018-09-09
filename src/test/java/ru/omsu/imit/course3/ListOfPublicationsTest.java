package ru.omsu.imit.course3;

import org.junit.Test;

import static org.junit.Assert.*;


public class ListOfPublicationsTest {
    @Test
    public void add() {
        String[] articles1 = {"статья 1", "статья 2"};
        String[] articles2 = {"статья 1", "статья 2", "статья 3", "статья 4"};
        Newspaper newspaper1 = new Newspaper("News1", 10, articles1);
        Newspaper newspaper2 = new Newspaper("News2", 15, articles2);
        ListOfPublications list = new ListOfPublications();
        list.add(newspaper1);
        list.add(newspaper2);
        assertEquals(list.get(1).equals(newspaper2), true);

    }
}


