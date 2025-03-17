package com.epam.campus;

public class Lista {
    private Object[] array;
    int next;

    public Lista() {
	array = new Object[10];
	next = 0;
    }

    public void add(Object o) {
	array[next++] = o;
    }

    @Override
    public String toString() {
	String str = "[";
	for (Object o : array) {
	    str = str + "  " + o.toString();
	}
	return str + "]";
   }
}
