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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[] datosArreglo = new double[3];
        double valor_numerico;
        for (int fila = 0; fila < datos.length; fila++) {
            valor_numerico = 0;
            for (int columna = 0; columna < datos[fila].length; columna++) {
                datosArreglo[columna] = datos[fila][columna];
                valor_numerico = suma(datosArreglo, datosArreglo.length);
            }
            System.out.println(valor_numerico);
        }
    }

    public static double suma(double[] a, int b) {
        if (b == 1) {
            return a[0];
        } else {
            return a[b - 1] + suma(a, b - 1);
        }
    }
    
}
