package com.exerciciLletres;

import java.util.*;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {

        List<Character> arrayNom = new ArrayList<>();
        arrayNom.add('S');
        arrayNom.add('I');
        arrayNom.add('L');
        arrayNom.add('V');
        arrayNom.add('I');
        arrayNom.add('A');


        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arrayNom.size(); i++) {
            int occurrences = frequency(arrayNom, arrayNom.get(i));
            map.put(arrayNom.get(i),occurrences);
        }

        System.out.println(map);

    }

}
