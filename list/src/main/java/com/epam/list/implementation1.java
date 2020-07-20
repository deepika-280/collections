package com.epam.list;

import java.util.Arrays;

public class implementation1<E>{
	private int size = 0;
    private static final int cap = 10;
    private Object a[];
    public implementation1() {
        a = new Object[cap];
    }
 
    public void addele(E e) {
        if (size == a.length) {
            Capacity();
        }
        a[size++] = e;
    }
     
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) a[i];
    }
    @SuppressWarnings("unchecked")
    public E removeele(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = a[i];
        int n = a.length - ( i + 1 ) ;
        System.arraycopy( a, i + 1, a, i, n ) ;
        size--;
        return (E) item;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() 
    {
         StringBuilder s = new StringBuilder();
         s.append('[');
         for(int i = 0; i < size ;i++) {
             s.append(a[i].toString());
             if(i<size-1){
                 s.append(",");
             }
         }
         s.append(']');
         return s.toString();
    }
     
    private void Capacity() {
        int newSize = a.length * 2;
        a = Arrays.copyOf(a, newSize);
    }

}