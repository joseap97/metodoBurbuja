/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosordenamiento;
//Importar librería para poder obtener datos por consola

import java.util.Scanner;

/**
 *
 * @author Jose Ayala
 */
public class MetodosOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación de escaner para la obtención de datos por consola
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables
        //arreglo = Vector para poder obtener varios datos en una misma variable
        //n_elementos = para que el usuario por consola elija cuántos elementos tendrá el vector
        //aux = para guardar un dato al momento de ordenar
        int arreglo[], n_elementos, aux;
        //Mensaje a mostrar por consola 
        System.out.println("Ingrese la cantidad de números a ordenar");
        //se útiliza variable n_elementos junto a escaler para 
        n_elementos = entrada.nextInt();
        //se le asigna a la variable-vector arreglo el tamaño que digite el usuario en variable n_elementos
        arreglo = new int[n_elementos];
        //Creación de ciclo para poder hacer la solicitud de todos los datos, según el largo digitado por el usuario
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("\nDigite un número");
            arreglo[i] = entrada.nextInt();
        }

        /*
        METODO BURBUJA
        Para poder usarse requiere de dos ciclo for (anidados)
        Uno estará haciendo el conteo de cuántos datos son
        El otro estará realizando el ordenamiento 
        El segundo estará condicionado con "if", para poder realizar ordenamiento
         */
//Primer for se dará cuenta las vueltas qué deberá dar (se utiliza -1 ya que el ciclo inicia desde 0, no requiere dar el número total de vueltas para poder ordenar)
        for (int a = 0; a < (arreglo.length - 1); a++) {
            //segundo for estará realizando ordenamiento
            //si numeroActual > numeroSiguiente = cambio (mover valor actual hacía valor siguiente)
            for (int e = 0; e < (arreglo.length - 1); e++) {
                //Condición para ordenar
                //Se útiliza "variable" del segundo for dado a que será la que de vueltas dentro del arreglo y podrá aplicar condición para ordenar
                if (arreglo[e] > arreglo[e + 1]) {
                    //La variable se útiliza para guardar el dato que actualmente se encuentra en la posición del vector
                    //aux = numeroActual
                    aux = arreglo[e];
                    //La posición del vector se le suma una posición, en caso de que se cumpla la condición para que adopte la posición que le corresponde
                    //numeroActual se le agrega posición del número siguiente
                    arreglo[e] = arreglo[e + 1];
                    //Finalmente a la posición del vector se le suma una posición y se almacena en la variable aux para continuar con el ciclo si se cumple la condición
                    //numeroSiguiente igual al numeroActual (estaba dentro de aux)
                    arreglo[e + 1] = aux;

                }

            }
        }
        System.out.print("Arreglo ordenado de forma creciente");
        //ciclo for para realizar impresión del arreglo ordenado de forma creciente
        for (int o = 0; o < arreglo.length; o++) {
            System.out.print(arreglo[o] + " - ");
        }
        System.out.println("\n");
        System.out.print("Arreglo ordenado de forma decreciente");
        //ciclo for para realizar impresión del arreglo ordena de forma decreciente
        //Dado a que es decreciente se inicia desde el largo del vector (se útiliza (-1)porque si son 5 elementos al iniciar desde 0, llega hasta 4 )
        //Hasta la última posición
        for (int u = (arreglo.length-1); u >=0 ; u--) {
            System.out.print(arreglo[u] + " - ");
        }
        System.out.println("\n");

    }

}
