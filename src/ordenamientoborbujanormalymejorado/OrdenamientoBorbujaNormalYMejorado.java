/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientoborbujanormalymejorado;

import java.util.Arrays;

/**
 *
 * @author Jonat
 */
public class OrdenamientoBorbujaNormalYMejorado {

    //Implementación tradicional del método de burbuja
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    //Implementación optimizada con detección de intercambios
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboIntercambio;
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            // Si en esta pasada no hubo ningún intercambio, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        //Prueba 1: Arreglo totalmente desordenado
        int[] desordenado = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Prueba 1: Arreglo Desordenado");
        System.out.println("Estado inicial: " + Arrays.toString(desordenado));
        ordenamientoBurbuja(desordenado);
        System.out.println("Resultado final: " + Arrays.toString(desordenado));

        //Prueba 2: Arreglo parcialmente ordenado
        int[] parcialmenteOrdenado = {1, 2, 4, 3, 5, 6};
        System.out.println("\nPrueba 2: Arreglo Parcialmente Ordenado");
        System.out.println("Estado inicial: " + Arrays.toString(parcialmenteOrdenado));
        ordenamientoBurbujaMejorado(parcialmenteOrdenado);
        System.out.println("Resultado final: " + Arrays.toString(parcialmenteOrdenado));
    }  
}
