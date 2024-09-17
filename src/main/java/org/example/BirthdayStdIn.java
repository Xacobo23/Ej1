package org.example;

import java.util.ArrayList;

public class BirthdayStdIn {
    ArrayList<Integer> lista = new ArrayList<>();

    public int pasarBinario(int n) {
        int unos = 0;

        while (n > 0) {
            lista.add(n % 2);
            n = n / 2;
        }
        for (int uno : lista) {
            if (uno == 1) {
                unos++;
            }
        }
        return unos;

    }
}