package com.epam.campus.java.collections;

import java.util.Set;
import java.util.HashSet;

public class MutableSet {

    public static void main(String...args) {

	Ref<Integer> ref1 = new Ref<>(1);
	Ref<Integer> ref2 = new Ref<>(2);

	Set<Ref<Integer>> refSet = Set.of(ref1, ref2);

	System.out.printf("refSet: %s%n", refSet);

	ref1.set(2);

	System.out.printf("refSet: %s%n", refSet);

	try {
	    Set<Ref<Integer>> refSet2 = Set.of(ref1, ref2);

	    System.out.printf("refSet2: %s%n", refSet2);
	}
	catch (IllegalArgumentException iae) {
	    System.err.printf("Error: %s%n", iae);
	}

	try {
	    Set<Integer> intSet = Set.of(1,1);

	    System.out.printf("intSet: %s%n", intSet);
	}
	catch (IllegalArgumentException iae) {
	    System.err.printf("Error: %s%n", iae);
	}
    }
}
