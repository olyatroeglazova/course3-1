package ru.omsu.imit.course3;

import java.util.ArrayList;

public class ListOfPublications<T> {
    private ArrayList<T> list;

    public ListOfPublications() {
        list = new ArrayList<T>();
    }

    public void add(T obj){
        list.add( obj);
    }

    public void remove(int current){
        list.remove(current);
    }

    public T get(int current){
        return list.get(current);
    }

}
