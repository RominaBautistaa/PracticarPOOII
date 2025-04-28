/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumPares;

//Filtrar numeros pares con progamacion funcional

//stream()=>cuando quieres procesar colecciones. in tener que escribir bucles (for, while) manualmente. 

import java.util.List;
import java.util.stream.Collectors;

public class NumPares {
    List<Integer> numeros=List.of(1,2,3,4,5,6,7,8,9,10); //se crea lista de numeros
    List<Integer> pares= numeros.stream()
            .filter(n-> n % 2== 0)
            .collect(Collectors.toList()); // vuelve a convertir el flujo en una lista.
    
    
    public static void main(String[] args) {
        NumPares numPares = new NumPares(); // Crea objeto de NumPares
        System.out.println("Numeros pares: " + numPares.pares); // Imprime los pares
    }
}
/*POO TRADICIONAL
List<Integer> pares = new ArrayList<>();
for (Integer numero : numeros) {
    if (numero % 2 == 0) {
        pares.add(numero);
    }
}
*/