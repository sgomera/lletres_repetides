package com.exerciciLletres;

import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creació llista de Nom
        List<Character> arrayNom = new ArrayList<>();
        arrayNom.add('S');
        arrayNom.add('I');
        arrayNom.add('L');
        arrayNom.add('V');
        arrayNom.add('I');
        arrayNom.add('A');

        //Creació llista de Cognom
        List<Character> arrayCognom = new ArrayList<>();
        arrayCognom.add('G');
        arrayCognom.add('O');
        arrayCognom.add('M');
        arrayCognom.add('E');
        arrayCognom.add('R');
        arrayCognom.add('A');

        //Llista nom complert
        List<Character> arrayFullName = new ArrayList<>();

        for (int i = 0; i < arrayNom.size(); i++) {
           arrayFullName.add(arrayNom.get(i));
        }

        arrayFullName.add(' ');

        for (int i = 0; i < arrayCognom.size(); i++) {
            arrayFullName.add(arrayCognom.get(i));
        }

        System.out.println(arrayFullName);

    }
}
