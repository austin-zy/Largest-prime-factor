/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.prime.factor;

/**
 *
 * @author Austin
 */
public class LargestPrimeFactor {

    /**
     * @param args the command line arguments
     * 

        The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number 600851475143 ?

     */
    public static void main(String[] args) {
        // TODO code application logic here
        long j;
        j = 600851475143L;
        for (int i =2;i<=j/2;i++){
            if(j%i==0){
                boolean isPrime=true;
                for(int a=2;a<=i/2;a++){
                    if(i%a==0){
                        isPrime=false;
                        break;
                        
                    }
                    
                }
                if(isPrime){
                    System.out.print(i+", ");
                }
            }
        }
    }
    
}
