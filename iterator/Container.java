package com.kaboomb.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container<T> implements Iterable<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {

        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < items.size();
        }

        @Override
        public T next() {
            if(hasNext()) {
                return items.get(cursor++);
            }
            return null;
        }
    }
}
