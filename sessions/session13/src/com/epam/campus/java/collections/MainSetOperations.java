package com.epam.campus.java.collections;

import java.util.Set;

import static com.epam.campus.java.collections.SetOperations.findCommon;
import static com.epam.campus.java.collections.SetOperations.union;
import static com.epam.campus.java.collections.SetOperations.difference;
import static com.epam.campus.java.collections.SetOperations.intersection;

public class MainSetOperations {

    public static void main(String...args) {
	Set<Integer> setA = Set.of(1,2,3,4,5);
	Set<Integer> setB = Set.of(1,3,5);

	System.out.printf("A union B %s%n", union(setA, setB));
	System.out.printf("A intersection B %s%n", intersection(setA, setB));
	System.out.printf("A - B %s%n", difference(setA, setB));
	System.out.printf("B - A %s%n", difference(setB, setA));
    }
}
