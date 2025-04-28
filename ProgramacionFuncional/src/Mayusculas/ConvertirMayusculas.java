/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mayusculas;

import java.util.List;

import java.util.stream.Collectors;

/*
    Dada una lista de palabras:

List<String> palabras = List.of("java", "python", "c", "ruby");
Objetivo: Crear una nueva lista con todas las palabras en mayúsculas.

Operaciones: map, collect.
*/
public class ConvertirMayusculas {
    List<String> palabras = List.of("java", "python", "c", "ruby");
    
    List<String> Mayus= palabras.stream()
            .map(String::toUpperCase) //convertir cada palabra
            .collect(Collectors.toList()); //Recolectar en una lista
    public static void main(String[] args) {
        ConvertirMayusculas app = new ConvertirMayusculas();
        System.out.println("Palabras en mayusculas: " + app.Mayus);
    }
}
