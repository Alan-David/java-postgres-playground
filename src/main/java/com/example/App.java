package com.example;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {

        1. O código abaixo contém um erro ao complilar, corrija o erro e explique a solução.
    
        byte identificador = 128;
        System.out.println("O seu identificador é: " + identificador);
        
        * Resposta
        1. O tipo byte armazena números na faixa de -127 até 127, logo o tipo deve ser substituido 
        por um inteiro para atribuir o valor 128.  
        
        int identificador = 128;
        System.out.println("O seu identificador é: " + identificador);
        */

        /*2. O código abaixo contém um erro ao exibir a informação, corrija o erro e explique a solução.
        
        int dividas = 2000;
        byte valor = (byte)dividas;
        System.out.println("O seu saldo devedor é: " + valor);

        //Resposta
        Ao tentar converter um tipo para outro menor, a variável extrapola o seu limite e retorna o 
        valor incorretamente. Converta para um tipo de mesmo tamanho ou maior.

        int dividas = 2000;
        float valor = dividas;
        System.out.println("O seu saldo devedor é: " + valor);
        */

        /* 3. Davi resolveu comprar um lache e sabe que o valor final foi de R$ 10,30. Ele pagou com
        uma cédula de 10 reais e com algumas moedas que tinha no bolso, totalizando o valor total.
        Exiba na tela o valor inicial pago por davi e some a esse valor os R$0,30 restantes realizando 
        a conversão de tipos.
         
        //Resposta
        
        int valor1 = 10;
        float valor2 = 0.30f;
        float soma = (float)valor1 + valor2;
        System.out.println("Valor inicial: "+valor1);
        System.out.println("Valor final: "+soma);
        */


    }
}