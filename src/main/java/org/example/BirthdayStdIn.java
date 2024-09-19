package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayStdIn {
    ArrayList<Integer> lista = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        BirthdayStdIn bb = new BirthdayStdIn();
        System.out.print(bb.pasarBinario(edad));
    }
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