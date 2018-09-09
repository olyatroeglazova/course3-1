package ru.omsu.imit.course3;

import org.junit.Test;

import static org.junit.Assert.*;

public class PublicationsTest {

    @Test
    public void NewspaperTest(){
        String[] articles1 = {"статья 1", "статья 2"};
        String[] articles2 = {"статья 1", "статья 2", "статья 3", "статья 4"};
        Newspaper newspaper1 = new Newspaper("News1", 10, articles1);
        Newspaper newspaper2 = new Newspaper("News2", 15, articles2);
        assertEquals(newspaper1.equals(newspaper2), false);
    }

    @Test
    public void AdvertisingNewspaperTest(){
        String[] articles = {"статья 1", "статья 2"};
        String[] advertising = {"реклама 1", "реклама 2", "реклама 3"};
        AdvertisingNewspaper advNews1 = new AdvertisingNewspaper("News", 5, articles, advertising);
        AdvertisingNewspaper advNews2 = new AdvertisingNewspaper("News", 5, articles, advertising);
        assertEquals(advNews1.equals(advNews2), true);
    }


}