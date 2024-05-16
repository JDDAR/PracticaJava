package org.practica002;

public class Ciclos {

  public static void main(String[] args) {

    // Ejercicios Ciclos Controlados por contador

    /*
     * ********************************************************** 01
     * // IMPRIMIR LOS NUMEROS PARES DEL 2AL 20
     * 
     * for (int i = 2; i <= 20; i += 2) {
     * System.out.println(i);
     * }
     */
    /*
     * ************************************************************ 02
     * // CREAR UN CICLO QUE SUME LOS PRIMEROS 100 NUMEROS ENTEROS
     * int suma = 0; // --> Se inicializa la suma
     * for (int i = 1; i <= 100; i++) { // --> Ciclo de 1 a 100
     * suma += i; // --> Sumar i a suma en cada iteracion
     * }
     * System.out.println( " La suma de los primeros 100 numeros es: " + suma );
     */

    /************************************************************** 03
     * 
     * // GENERA UN CICLO QUE IMPRIMA LA TABLA DE MULTIPLICAR DEL 5
     * int numero = 5; // numero de tabla a utilizar
     * for (int i = 1; i <= 10; i++) { // Ciclo del 1 al 10
     * System.out.println(numero + " * " + i + " = " + (numero * i)); // imprimiendo
     * el ciclo con el resultado de la multiplicacion
     * }
     */

    /*************************************************************** 04
     * 
     * //ELABORAR UN CICLO QUE CALCULE EL FACTORIAL DE UN NUMERO DADO
     * 
     * int numero = 8;
     * int factorial = 1; // Se inicia el factorial en uno porque el uno no afecta
     * el resultado
     * 
     * for (int i = 1; i <= numero; i++) {
     * factorial *= i; // Multiplicar factorial por i en cada iteracion
     * }
     * System.out.println(" El factorial de " + numero + " es: " + factorial);
     */

    /********************************************************************** 05 
     // DISEÑAR UN CICLO QUE IMPRIMA UN TRIANGULO DE ASTERISCOS CON 5 FILAS
    
    int filas = 10; // numero de filas proporcionado
    
    for (int i = 1; i <= filas; i++) { // Ciclo para las filas
    
      for (int j = 1; j <= i; j++) { // Ciclo para imprimir asteriscos en cada fila
        System.out.print("*");
      }
      System.out.println(); // Cambia a la siguiente linea despues de cada fila s
    }
    */
    
    /* *********************************************************************** 06 
    
    // DISEÑAR UN CICLO QUE IMPRIMA UN TRIANGULO DE ASTERISCOS CON 10 FILAS DE 10 A 1
    
    //int filas = 10; // numeros de filas 
    
    for (int i = 10; i >= 1; i-- ) { // ciclo de las filas  
      
      for (int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println(); // Este espara hacer los saltos de linea por fila 
    }
    */
    
    // DISEÑAR UN CICLO QUE IMPRIMA UN TRIANGULO DE ASTERISCOS DEL 10 AL 1 PERO ALINEADO A LA IZQUIERDA 

    int filas = 10;
    
    for (int i = filas; i >= 1; i--) {

      for (int j = 1; j <= i; j++ ){
        System.out.print("*");
      }
      
      System.out.println();

    }



  }

}
