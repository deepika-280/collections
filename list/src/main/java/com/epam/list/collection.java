package com.epam.list;

public class collection {
	public static void main(String[] args)
    {
        implementation1<Integer> c = new implementation1<Integer>();
        int val;
        c.addele(34);
        c.addele(32);
        c.addele(30);
        c.addele(15);
        System.out.println("size");
        System.out.println(c.size());
        System.out.println(c);
        val=c.removeele(1);
        System.out.println("element removed:"+val);
        System.out.println("size of the list after removing element from position 1");
        System.out.println(c.size());
        System.out.println(c);
        c.addele(28);
        System.out.println(c);
        System.out.println( c.get(0) );
        System.out.println( c.get(1) );
        System.out.println( c.get(2) );
        
    }
}