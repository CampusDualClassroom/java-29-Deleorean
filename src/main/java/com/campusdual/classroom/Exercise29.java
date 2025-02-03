package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
       int dividendo = 3;
       int divisor = 0;
        try {
            int resultado = dividendo/divisor;

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
        finally{
            System.out.println("Programa acabado");
        }

    }
}
