/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiltrarYContar;

import java.util.List;

/*
Dada una lista de números:

List<Integer> numeros = List.of(3, 7, 12, 5, 20, 8);
Objetivo: Contar cuántos números son mayores que 10.

Operaciones: filter, count.
*/
public class FiltrarYContar {
    List<Integer> numeros = List.of(3, 7, 12, 5, 20, 8);
    
    long numMayor= numeros.stream()
            .filter(n -> n >10)
            .count();
    
    public static void main(String[] args) {
        FiltrarYContar filtycont = new FiltrarYContar();
        System.out.println("Cantidad de numeros mayores de 10: "+filtycont.numMayor);
    }

}
