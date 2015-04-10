/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package faktorial;

import java.util.Scanner;

/**
 *
 * @author Syifa Ariandini
 */
public class Faktorial {
    private int ang1;
    public Faktorial(){
        
    }
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("input angka :");
        int inp = input.nextInt();
        int b=1;
        if(inp>0){
            for(int i=1;i<inp;i++)
            b=b+(inp-i);
            b=b+inp;
        }
        else
            b=1;
        System.out.println("output : "+b);
        
        
    }
    
}
