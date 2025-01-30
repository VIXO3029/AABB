/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.victormanuel.arraymanager;

/**
 *
 * @author vrodriguez
 */
import java.util.ArrayList; 
import java.util.Collections;   
import java.util.Scanner;

public class ArrayManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int option;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Agregar un número");
            System.out.println("2. Eliminar un número");
            System.out.println("3. Mostrar todos los números");
            System.out.println("4. Ordenar los números");
            System.out.println("5. Calcular el sumatorio");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1: // Agregar un número
                    System.out.print("Ingresa el número que deseas agregar: ");
                    int numToAdd = scanner.nextInt();
                    numbers.add(numToAdd);
                    System.out.println("Número agregado.");
                    break;

                case 2: // Eliminar un número
                    System.out.print("Ingresa el número que deseas eliminar: ");
                    int numToRemove = scanner.nextInt();
                    if (numbers.remove((Integer) numToRemove)) {
                        System.out.println("Número eliminado.");
                    } else {
                        System.out.println("El número no se encuentra en el array.");
                    }
                    break;

                case 3: // Mostrar todos los números
                    System.out.println("Números en el array: " + numbers);
                    break;

                case 4: // Ordenar los números
                    Collections.sort(numbers);
                    System.out.println("Números ordenados: " + numbers);
                    break;

                case 5: // Calcular el sumatorio
                    int sum = 0;
                    for (int number : numbers) {
                        sum += number;
                    }
                    System.out.println("El sumatorio de los números es: " + sum);
                    break;
                    
                
                case 6: // Salir
                   ;
                    break;    

                case 7: // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                    
                

         

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}
