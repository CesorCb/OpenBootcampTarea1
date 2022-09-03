package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumaTresNumeros(10, 2, 20));

        Coche coche = new Coche();
        coche.incrementarPuertas();
        System.out.println(coche.numeroPuertas);

    }

    public static int sumaTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int numeroPuertas = 4;

    public void incrementarPuertas() {
        this.numeroPuertas++;
    }
}
