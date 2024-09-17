package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        BirthdayStdIn bb = new BirthdayStdIn();
        System.out.print(bb.pasarBinario(edad));
    }
}