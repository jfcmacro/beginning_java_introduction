package com.epam.campus;

import java.util.Properties;
import java.util.Objects;

public class ShowProperty {

    public static void main(String...args) {
	Properties props = System.getProperties();

	String value = props.getProperty("com.epam.campus.author");
	if (Objects.nonNull(value)) {
	    System.out.printf("%s%n", value);
	}

	String id = props.getProperty("com.epam.campus.id", "1234");
	System.out.printf("%s%n", id);
    }
}
