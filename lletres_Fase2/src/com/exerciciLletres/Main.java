package com.exerciciLletres;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        List<Character> arrayNom = new ArrayList<>();
        arrayNom.add('S');
        arrayNom.add('I');
        arrayNom.add('L');
        arrayNom.add('5');
        arrayNom.add('I');
        arrayNom.add('A');



        for (int i = 0; i < arrayNom.size(); i++) {
            char lletra = arrayNom.get(i);

            if (lletra == 'A' ||
                lletra == 'E' ||
                lletra == 'I' ||
                lletra == 'O' ||
                lletra == 'U'
            ) {
                System.out.println(lletra + " és una vocal");

            } else if(
                    lletra == '0' ||
                    lletra == '1' ||
                    lletra == '2' ||
                    lletra == '3' ||
                    lletra == '4' ||
                    lletra == '5' ||
                    lletra == '6' ||
                    lletra == '7' ||
                    lletra == '8' ||
                    lletra == '9'
            ) {
                System.out.println(lletra + " Els noms de persones no contenen números!");

            } else {
                System.out.println(lletra + " és una consonant");
            }
        }
    }

}
