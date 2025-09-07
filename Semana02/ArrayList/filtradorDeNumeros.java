// Objetivo: Crie um programa que tenha uma ArrayList de números inteiros já preenchida. Em seguida, crie duas novas listas: uma que conterá apenas os números pares da lista original e outra que conterá apenas os números ímpares. No final, imprima as três listas.
// Lógica Principal:
// Crie a lista original e adicione alguns números (ex: 5, 8, 12, 1, 9, 4, 20).
// Crie duas outras ArrayLists vazias: pares e impares.
// Use um laço for-each para percorrer a lista original.
// Dentro do laço, para cada número, verifique se ele é par (numero % 2 == 0).
// Se for par, adicione-o à lista pares. Senão, adicione-o à lista impares.

import java.util.ArrayList;

public class filtradorDeNumeros {
    public static void main(String[] args) {
        // Lista original de numeros inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(12);
        numeros.add(1);
        numeros.add(9);
        numeros.add(4);
        numeros.add(20);
        // Listas para armazenar números pares e ímpares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        // Percorre a lista original e separa os números em pares e ímpares
        for (int numero : numeros){
            if (numero % 2 ==0){
                pares.add(numero);
            }else{
                impares.add(numero);
            }
        }
        // Imprime as três listas
        System.out.println("Lista Original: " + numeros);
        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
    }
}
