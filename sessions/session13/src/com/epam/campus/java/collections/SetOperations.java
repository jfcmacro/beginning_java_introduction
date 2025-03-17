package com.epam.campus.java.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static <T> Set<T> findCommon(Collection<T> c_left, Collection<T> c_right) {
	Set<T> result = new HashSet<>(c_left);
	
	result.retainAll(c_right);
	
	return result;
    }
    
    public static <T> Set<T> union(Set<T> set_left, Set<T> set_right) {
	Set<T> result = new HashSet<>(set_left);
	
	result.addAll(set_right);
	
	return result;
    }
    
    public static <T> Set<T> difference(Set<T> setA, Set<T> setB) {
	Set<T> result = new HashSet<>(setA);
	
	result.removeAll(setB);
	
	return result;
    }
    
    public static <T> Set<T> intersection(Set<T> set_left, Set<T> set_right) {
	Set<T> result = new HashSet<>(set_left);

	result.retainAll(set_right);

	return result;
    }
}

