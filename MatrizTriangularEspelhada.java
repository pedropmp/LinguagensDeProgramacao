/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = input.nextInt();
        
        String [][] matriz = new String [2*n][2*n];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if((j >= n) && (j-(n+1) < i) && (i < (n))){
                    matriz[i][j] = String.valueOf((i+1)-(j-(n)));
                } else if((j < n) && (i - j < n+1) && (i > n-1)){
                    matriz[i][j] = String.valueOf(j-(i-(n+1)));
                } else {
                    matriz[i][j] = " ";
                }
            }
        }
    
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" " + matriz[i][j] + " " );
            }
            System.out.println("");
        }
    }
}
