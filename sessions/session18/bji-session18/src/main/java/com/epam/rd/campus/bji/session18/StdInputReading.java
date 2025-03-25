package com.epam.rd.campus.bji.session18;

import java.io.InputStream;
import java.io.IOException;

public class StdInputReading {

    public static void main(String...args) {
	try {
	    int val;
	    while ((val = System.in.read()) != -1) {
		System.out.write((byte) val);
	    }
	} catch (IOException ioe) {
	    System.err.println("Reading exception: " +
			       ioe);
	}
    }
}
