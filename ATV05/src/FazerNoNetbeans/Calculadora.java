/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FazerNoNetbeans;

import java.util.Scanner;

/**
 *
 * @author rixc
 */
public class Calculadora {

    public static void Operadores() {
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        float v1, v2;

        System.out.println("Digite o primeiro valor: ");
        v1 = ler.nextFloat();

        System.out.println("Digite o segundo valor: ");
        v2 = ler.nextFloat();

        Operadores op = new Operadores();

        System.out.println("Resultado da adição: " + op.adicao(v1, v2));
        System.out.println("Resultado da subtração: " + op.subtracao(v1, v2));
        System.out.println("Resultado da multiplicação: " + op.multiplicacao(v1, v2));
        System.out.println("Resultado da divisão: " + op.divisao(v1, v2));
        System.out.println("Resultado da comparação com 10: " + op.men10(v1, v2));
    }

    public static void main(String[] args) {
        Operadores();
    }
}
