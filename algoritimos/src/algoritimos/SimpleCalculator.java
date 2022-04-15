/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Maciel
 */
public class SimpleCalculator {
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        int repete = 0;
        do{
            System.out.print("\n '1' = DIVISÃO;\n '2' = SUBTRAÇÃO;\n '3' = SOMA;\n '4' MULTIPLICAÇÃO; '5' SAIR");
            System.out.println("\nQual operação deseja realizar ? ");
            String opcao = entrada.next();
            switch(opcao){
                case "1":
                        System.out.println("---------------- DIVISÃO ----------------");
                        System.out.println("Selecione o primeiro número(dividendo)");
                        n1 = entrada.nextInt();
                        System.out.println("Selecione o segundo número(divisor)");
                        n2 = entrada.nextInt();
                        /*
                            Saber se o usuário deseja modificar algum número
                        */
                        System.out.println("Deseja modificar um numero fornecido ?");
                        System.out.println("1 = SIM; 0 = NÃO;");
                        int modifiRep = entrada.nextInt();
                        if(modifiRep == 1){
                            System.out.println("Qual número deseja modificar ?");
                            System.out.println("1 = Primeiro: "+n1);
                            System.out.println("2 = Segundo: "+n2);
                            int opNum = entrada.nextInt();
                            System.out.println("Qual o novo numero ?");
                            int newNum = entrada.nextInt();
                            if(opNum == 1){
                                n1 = newNum;
                            }else{
                                n2 = newNum;
                            }
                            System.out.println("O resultado da DIVISÃO é:");
                            System.out.println(n1/n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }else{
                            System.out.println("O resultado da DIVISÃO é:");
                            System.out.println(n1/n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }
                    break;
                case "2":
                        System.out.println("---------------- SUBTRAÇÃO ----------------");
                        System.out.println("Selecione o primeiro número(minuendo)");
                        n1 = entrada.nextInt();
                        System.out.println("Selecione o segundo número(subtraendo)");
                        n2 = entrada.nextInt();
                        /*
                            Saber se o usuário deseja modificar algum número
                        */
                        System.out.println("Deseja modificar um numero fornecido ?");
                        System.out.println("1 = SIM; 0 = NÃO;");
                        int modifiRep1 = entrada.nextInt();
                        if(modifiRep1 == 1){
                            System.out.println("Qual número deseja modificar ?");
                            System.out.println("1 = Primeiro: "+n1);
                            System.out.println("2 = Segundo: "+n2);
                            int opNum = entrada.nextInt();
                            System.out.println("Qual o novo numero ?");
                            int newNum = entrada.nextInt();
                            if(opNum == 1){
                                n1 = newNum;
                            }else{
                                n2 = newNum;
                            }
                            System.out.println("O resultado da SUBTRAÇÃO é:");
                            System.out.println(n1 - n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }else{
                            System.out.println("O resultado da SUBTRAÇÃO é:");
                            System.out.println(n1 - n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }
                    break;
                case "3":
                        System.out.println("---------------- SOMA ----------------");
                        System.out.println("Selecione o primeiro número");
                        n1 = entrada.nextInt();
                        System.out.println("Selecione o segundo número");
                        n2 = entrada.nextInt();
                        /*
                            Saber se o usuário deseja modificar algum número
                        */
                        System.out.println("Deseja modificar um numero fornecido ?");
                        System.out.println("1 = SIM; 0 = NÃO;");
                        int modifiRep2 = entrada.nextInt();
                        if(modifiRep2 == 1){
                            System.out.println("Qual número deseja modificar ?");
                            System.out.println("1 = Primeiro: "+n1);
                            System.out.println("2 = Segundo: "+n2);
                            int opNum = entrada.nextInt();
                            System.out.println("Qual o novo numero ?");
                            int newNum = entrada.nextInt();
                            if(opNum == 1){
                                n1 = newNum;
                            }else{
                                n2 = newNum;
                            }
                            System.out.println("O resultado da SOMA é:");
                            System.out.println(n1 + n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }else{
                            System.out.println("O resultado da SOMA é:");
                            System.out.println(n1 + n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }
                    break;
                case "4":
                        System.out.println("---------------- MULTIPLICAÇÃO ----------------");
                        System.out.println("Selecione o primeiro número");
                        n1 = entrada.nextInt();
                        System.out.println("Selecione o segundo número");
                        n2 = entrada.nextInt();
                        /*
                            Saber se o usuário deseja modificar algum número
                        */
                        System.out.println("Deseja modificar um numero fornecido ?");
                        System.out.println("1 = SIM; 0 = NÃO;");
                        int modifiRep3 = entrada.nextInt();
                        if(modifiRep3 == 1){
                            System.out.println("Qual número deseja modificar ?");
                            System.out.println("1 = Primeiro: "+n1);
                            System.out.println("2 = Segundo: "+n2);
                            int opNum = entrada.nextInt();
                            System.out.println("Qual o novo numero ?");
                            int newNum = entrada.nextInt();
                            if(opNum == 1){
                                n1 = newNum;
                            }else{
                                n2 = newNum;
                            }
                            System.out.println("O resultado da MULTIPLICAÇÃO é:");
                            System.out.println(n1*n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }else{
                            System.out.println("O resultado da MULTIPLICAÇÃO é:");
                            System.out.println(n1*n2);
                            System.out.println("\n\nDeseja realizar outra operação ?");
                            System.out.println("1 = SIM; 0 = NÃO;");
                            int opcao2 = entrada.nextInt();
                            if(opcao2 == 1){
                                repete = 1;
                            }else {
                                repete = 0;
                            }
                        }
                    break;
                case "5":
                    repete = 0;
                default:
                    System.out.println("A opção escolhida não se encontra presente nas informadas.");
            }
        }while (repete != 0);
        
    }
}
