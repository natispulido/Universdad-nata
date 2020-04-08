/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advinando.la.palabra;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nata
 */
public class AdvinandoLaPalabra {

    static Scanner sc = new Scanner(System.in);
    static String x[] = new String[10];
    static String y[] = new String[10];

    public static void main(String[] args) {
        int ale = 0;
        ale = seleccionarpalabra(x);
        buscarletra(x, ale);
    }

    public static int seleccionarpalabra(String x[]) {
        x[0] = "Int";
        x[1] = "Double";
        x[2] = "Matrices";
        x[3] = "Array";
        x[4] = "Algoritmo";
        x[5] = ".lenght";
        x[6] = "While";
        x[7] = "Do-While";
        x[8] = "For";
        x[9] = "Java";
        int aleatorio = (int) Math.floor(Math.random() * x.length);
        y[0] = "Tipo de variable entera";
        y[1] = "Tipo de variable decimal";
        y[2] = "Arreglo bidimensional";
        y[3] = "Almacenador continuo de elementos del mismo tipo";
        y[4] = "Secuencia de pasos para dar solución a un problema";
        y[5] = "Sirve para determinar el tamaño de un arreglo";
        y[6] = "Un ciclo repetitivo basado en los resultados de una expresión lógica";
        y[7] = "Ciclo contrario a un ciclo while, hace y luego valida";
        y[8] = "Ciclo definido, su principal variable es i la cual aumenta según su condición";
        y[9] = "Lenguaje de programación accesible y orientado a objetos";
        System.out.println("Por favor comienza a adivinar las letras de la palabra a continuación");
        return aleatorio;

    }

    public static void buscarletra(String x[], int aleatorio) {
        boolean letraInc = false;
        char[] xd = x[aleatorio].toCharArray();
        char[] adivinax = new char[xd.length];
        int oportunidades = 0;
        while (oportunidades <= 10) {
            char letra = sc.next().charAt(0);
            for (int i = 0; i < xd.length; i++) {
                //System.out.println(xd[i] + " -> " + i);
                if (letra == xd[i] && (adivinax[i] == '_' || adivinax[i] == '\u0000')) {
                    adivinax[i] = letra;
                    letraInc = true;
                } else if (adivinax[i] == '\u0000') {
                    adivinax[i] = '_';

                }

            }
            if (letraInc == false) {
                System.out.println("Letra incorrecta, vuelve a intentarlo");
            } else {
                letraInc = false;
            }
            //System.out.println(adivinax);
            oportunidades++;
            if (Arrays.equals(xd, adivinax)) {
                System.out.println("Has ganado, la palabra era " + x[aleatorio] + " Definida como: " + y[aleatorio]);
                System.exit(0);
            }

        }
        System.out.println("Has perdido, la palabra era: " + x[aleatorio] + " Definida como: " + y[aleatorio]);
    }//cierra metodo buscarletra
}
