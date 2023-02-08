package com.onowdev.rawlabs.collectionset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TugasArrayMerge {

    public static void main(String[] args) {

        String[] nama1 = {"Kazuya", "Jin", "Lee"};
        String[] nama2 = {"Kazuya", "Feng"};

        NavigableSet<String> namasAll = new TreeSet<>();
        namasAll.addAll(list.of(nama1));
        namasAll.addAll(list.of(nama2));

        NavigableSet<String> namasAllDesc = namasAll.descendingSet();
        System.out.println(namasAll);
        System.out.println(namasAllDesc);
    }
    
}
