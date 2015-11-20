package hw_primefactor5630213026;

import java.util.Scanner;

/**
 *
 * @author Kwanrudee
 */
public class HW_PrimeFactor5630213026 {

    int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :  ");
        int num = sc.nextInt();

        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                System.out.print(i + " x ");
                
           if (num == 1){
               System.out.println(" ");
           }     
                
                num = num / i;
            } else {
                i++;
            }
        }
        
        
    }
}
