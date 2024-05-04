package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           adivinarNumero(1, 100, 5);
    }

    // Método para calcular las deducciones
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        // Implementar solución
        Random R = new Random();
        int valorAleatorio = R.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenidos a este juego de adivinar un numero");
        System.out.println("Introduce un numero por favor del 1 al 100");

        while (intentos < max_intentos) {
            int numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == valorAleatorio) {
                System.out.println("felicitaciones haz adivinado el numero y tus intentos fueron " + intentos);
                return;
            }

            if (numeroUsuario < valorAleatorio) {
                System.out.println("el numero aleatorio es mayor a " + numeroUsuario);
                System.out.println("intentalo de nuevo");
            } else {
                System.out.println("el numero aletorio es menor a " + numeroUsuario);
                System.out.println("intentalo de nuevo");

            }
       }
    System.out.println("fin del juego");
    System.out.println("Hoooo no perdiste el numero aleatorio era " + valorAleatorio);

    }
}

    
