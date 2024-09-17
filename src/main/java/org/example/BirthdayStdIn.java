package org.example;

import java.util.ArrayList;

public class BirthdayStdIn {
    ArrayList<Integer> lista = new ArrayList<Integer>();

    public int pasarBinario(int n) {
        int unos = 0;

        if (n==1){
            unos = 1;
        }
        else{
            while (n / 2 != 1) {
                lista.add(n % 2);
                n = n / 2;
            }
            lista.add(1);
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == 1) {
                    unos++;
                }
                i++;
            }
        }
        return unos;

    }
}