package org.practica002;

public class TablaMultiplicacion {
  public static void main(String[] args) {
    // Crear un programa que imprima una tabla de multiplicaar utilizando los ciclo vistos en clase 
    int numero = 5;

    System.out.println("\nTabla de multiplicacion del numero : " + numero + "\n");
    System.out.println("Utilizando ciclo FOR : ");
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
    
    System.out.println("\nUtilizando cliclo WHILE");
    int numero1 = 1;
    while (numero1 <= 10) {
      System.out.println(numero + " x " + numero1 + " = " + (numero * numero1));
      numero1++;
    }


  }

}
