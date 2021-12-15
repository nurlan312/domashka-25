package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set5 = new HashSet<>();
        set5.add(1);
        set5.add(2);
        set5.add(3);
        System.out.println(set5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(set2);

        Set<Integer> set3 = new HashSet<>(set5);
        set5.removeAll(set2);
        set2.removeAll(set3);

        Set<Integer> set4 = new HashSet<>(set5);
        set4.addAll(set2);


        System.out.println(symmetricDifference(set2, set4));

    }
    public static Set<Integer> symmetricDifference(Set<Integer> set, Set<Integer> set1) {

        return set1;
    }
}
