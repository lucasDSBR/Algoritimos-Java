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
public class bubbleSort {
    public bubbleSort()
    {
        int x[] = new int[5];
        int n, i, aux;
        Scanner entrada = new Scanner(System.in);
        for(i=0; i <=4; i++){
            System.out.println("Digite o"+(i+1)+"º numero: ");
            x[i] = entrada.nextInt();
        }
        for(n=1; n<= 5; n++){
            for(i=0; i<=3; i++){
                if(x[i] > x[i+1]){
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
        }
        for(i=0; i<=4; i++){
            System.out.println((i+1)+"º numero: "+x[i]);
        }
    }


}
