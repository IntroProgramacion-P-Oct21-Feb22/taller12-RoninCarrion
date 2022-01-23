/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            System.out.println(arreglo[0]);
            return arreglo[0];
        } else {
            System.out.println(arreglo[tamanio-1]);
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
            // En cada iteración suma los elementos del arreglo desde el final
            // al inicio, acumulando los valores, finalmente cuando la iteración
            // acumula la cantidad de 7 que es la suma de 1 + 4 + 2, entra al 
            // primero condicional en donde ya llega a la posición 0 porque la
            // variable tamanio en cada iteración disminuía en 1. En la última 
            // iteración entra al primer condicional, sumando la posición 0 del
            // arreglo, dando así el resultado de 17.
        }
    }
}
