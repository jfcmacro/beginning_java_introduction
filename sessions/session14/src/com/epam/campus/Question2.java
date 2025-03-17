package com.epam.campus;

import java.util.List;
import java.util.ArrayList;

public class Question2 {
    public static void append(List list) {
        list.add("abc*");
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        append(intList);
        intList.add(2);
        System.out.print(intList);
    }
}
