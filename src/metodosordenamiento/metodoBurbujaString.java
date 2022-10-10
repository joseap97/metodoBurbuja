/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosordenamiento;

import java.util.Scanner;

/**
 *
 * @author Jose Ayala
 */
public class metodoBurbujaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación de escaner para la obtención de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Creación de variables
        String nombres[], aux;
        int n_elem;
        System.out.println("Ingrese la número de nombres a ordenar");
        //Se solicita por consola valor de la variable
        n_elem = entrada.nextInt();
          //se le asigna a la variable-vector arreglo el tamaño que digite el usuario en variable n_elem
        nombres = new String[n_elem];
//Creación de ciclo para poder hacer la solicitud de todos los datos, según el largo digitado por el usuario
        for (int a = 0; a < nombres.length; a++) {
            System.out.println("Digite un nombre");
            nombres[a] = entrada.next();
        }
        System.out.println("");
        System.out.println("Nombres como usted digito: ");
        for (int e = 0; e < nombres.length; e++) {
            System.out.print(nombres[e] + " ");
        }
        /*
        METODO BURBUJA
        Para poder usarse requiere de dos ciclo for (anidados)
        Uno estará haciendo el conteo de cuántos datos son
        El otro estará realizando el ordenamiento 
        El segundo estará condicionado con "if", para poder realizar ordenamiento
         */
//Primer for se dará cuenta las vueltas qué deberá dar (se utiliza -1 ya que el ciclo inicia desde 0, no requiere dar el número total de vueltas para poder ordenar)
        for (int i = 0; i < nombres.length - 1; i++) {
            //segundo for estará realizando ordenamiento
            //si numeroActual > numeroSiguiente = cambio (mover valor actual hacía valor siguiente)
            for (int o = 0; o < nombres.length - 1; o++) {
                //Condición para ordenar
                //Se útiliza "variable" del segundo for dado a que será la que de vueltas dentro del arreglo y podrá aplicar condición para ordenar
                //metodo "compareTo" sirve para comprar tipo String
                if (nombres[o].compareTo(nombres[o + 1]) > 0) {
                    //La variable se útiliza para guardar el dato que actualmente se encuentra en la posición del vector
                    //aux = numeroActual
                    aux = nombres[o];
                    //La posición del vector se le suma una posición, en caso de que se cumpla la condición para que adopte la posición que le corresponde
                    //numeroActual se le agrega posición del número siguiente
                    nombres[o] = nombres[o + 1];
                    //Finalmente a la posición del vector se le suma una posición y se almacena en la variable aux para continuar con el ciclo si se cumple la condición
                    //numeroSiguiente igual al numeroActual (estaba dentro de aux)
                    nombres[o + 1] = aux;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Nombres ordenados afabeticamente: ");
        //ciclo for para realizar impresión del arreglo ordenado de forma creciente
        for (int u = 0; u < nombres.length; u++) {
            System.out.print(nombres[u] + "\t");
        }
        System.out.println("\n");
        System.out.println("Nombres ordenados invertidos: ");
        //ciclo for para realizar impresión del arreglo ordena de forma decreciente
        //Dado a que es decreciente se inicia desde el largo del vector (se útiliza (-1)porque si son 5 elementos al iniciar desde 0, llega hasta 4 )
        //Hasta la última posición
        for (int b = nombres.length - 1; b >= 0; b--) {
            System.out.print(nombres[b] + "\t");
        }

    }
}
