package com.epam.campus;

import java.util.Properties;
import java.util.Enumeration;

public class ListProperties {

    public static void main(String...args) {
	Properties props = System.getProperties();

	for (Enumeration<?> e = props.propertyNames();
	     e.hasMoreElements();) {
	    if (e.nextElement() instanceof String key) {
		System.out.printf("%s=%s%n", key, props.get(key));
	    }
	}
    }
}
