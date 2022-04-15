/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos;
import java.util.*;
/**
 *
 * @author lucas
 */
public class bubbleSortMelhorado2 {
    public bubbleSortMelhorado2()
    {
        int x[] = new int[5];
        int n, i, aux, troca;
        Scanner entrada = new Scanner(System.in);
        for(i=0; i<=4; i++)
        {
            System.out.println("Digite o "+(i+1)+"º numero: ");
            x[i] = entrada.nextInt();
        }
        n = 1;
        troca = 1;
        while(n <= 5 && troca == 1)
        {
            troca = 0;
            for(i=0; i<=3; i++)
            {
                if(x[i] < x[i+1])
                {
                    troca = 1;
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }// fim do for
            n = n + 1;
        }// fim do while
        for(i = 0; i<= 4;i++)
        {
            System.out.println((i+1)+"º número: "+x[i]);
        }
    }
}
