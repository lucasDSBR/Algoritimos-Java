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
public class insertionSort {
    public insertionSort()
    {
        int x[] = new int[5];
        int i, j, eleito;
        Scanner entrada = new Scanner(System.in);
        //Carregando os números no vetor
        for(i = 0; i<= 4; i++)
        {
            System.out.println("Digite o "+(i+1)+"º numero: ");
            x[i] = entrada.nextInt();
        }
        for(i = 1; i<= 4; i++)
        {
            eleito = x[i];
            j = i - 1;
            while(j >= 0 && x[j] > eleito)
            {
                x[j+1] = x[j];
                j = j - 1;
            }
            x[j+1] = eleito;
        }
        for(i = 0; i<= 4; i++)
        {
            System.out.println((i+1)+"º número: "+x[i]);
        }
    }
}
