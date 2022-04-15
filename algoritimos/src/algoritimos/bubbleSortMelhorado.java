/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Imports

package algoritimos;
import java.util.*;
/**
 *
 * @author Lucas da Silva Maciel
 */
public class bubbleSortMelhorado {
    public bubbleSortMelhorado()
    {
        int x[] = new int[5];
        int j, i, aux;
        Scanner entrada = new Scanner(System.in);
        //Carregando itens no vetor 
        for(i = 0; i<=4; i++)
        {
            System.out.println("Digite o"+(i+1)+"º numero");
            x[i] = entrada.nextInt();
        }
        //Ordenando de forma crescente
        for(j = 1; j <= 4; j++)
        {
            for(i = 4; i >= j; i--)
            {
                if(x[i] < x[i-1])
                {
                    aux = x[i];
                    x[i] = x[i-1];
                    x[i-1] = aux;
                }
            }
        }
        //Mostrando o vetor ordenado
        for(i = 0; i <= 4; i++)
        {
            System.out.println((i+1)+"º número: "+x[i]);
        }
    }
}
