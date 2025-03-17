package com.epam.campus.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Consumer;


public class ListOperations {

    // Remover Duplicatos de una lista
    // [1, 1, 2, 2, 3, 3, 4] -> [1, 2, 3, 4]
    // [1, 1, 1, 1, 1, 1] -> [1]
    public static <T> List<T> removeDuplicates(List<T> list) {
	List<T> results = new ArrayList<>();
	Iterator<T> iterator = list.iterator();
	while (iterator.hasNext()) {
	    T e = iterator.next();
	    if (!results.contains(e)) {
		results.add(e);
	    }
	}

	return results;
    }

    public static <T> List<T> removeDuplicates2(List<T> list) {
	List<T> results = new ArrayList<>();
	for (T e : list) {
	    if(!results.contains(e)) {
		results.add(e);
	    }
	}

	return results;
    }

    public static <T> List<T> removeDuplicates3(List<T> list) {
	final List<T> results = new ArrayList<>();

	list.forEach(new Consumer<T>() {
		@Override
		public void accept(T e) {
		    if (!results.contains(e)) {
			results.add(e);
		    }
		}
	    });
	
	return results;
    }

    public static <T> List<T> removeDuplicates4(List<T> list) {
	List<T> results = new ArrayList<>(list);
	Set<T> numbers = new HashSet<>();
	
	Iterator<T> iterator = list.iterator();
	while (iterator.hasNext()) {
	    T e = iterator.next();
	    if (numbers.contains(e)) {
		results.remove(e);
	    }
	    else {
		numbers.add(e);
	    }
	}

	return results;
    }

    public static <T> List<T> removeDuplicates5(List<T> list) {
	Set<T> result = new HashSet<>(list);
	return new ArrayList<>(result);
    }

    public static <T> Consumer<T> imprimir() {
	return new Consumer<> () {
	    @Override
	    public void accept(T t) {
		System.out.printf("e: %s%n", t);
	    }
	    
	};
    }
    
    public static void main(String...args) {
	List<Integer> list1 = List.of(1,1,2,2,3,3,4);
	List<Integer> list2 = List.of(1,1,1,1,1,1,1);

	System.out.printf("list1 unica: %s%n", removeDuplicates5(list1));
	System.out.printf("list2 unica: %s%n", removeDuplicates5(list2));

    }
}
