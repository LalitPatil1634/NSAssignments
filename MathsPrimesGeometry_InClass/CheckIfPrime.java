package Assignments.MathsPrimesGeometry_InClass;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T= input.nextInt();
        for(int i=0;i<T;i++){
            int N= input.nextInt();
            int flag=0;
            if(N%2==0 && N>2){
                System.out.println("No");
            }
            else{
                for (int j=3;j<=Math.ceil(Math.sqrt(N));j=j+2){
                    if(N%j==0){
                        System.out.println("No");
                        flag =1;
                        break;
                    }
                }
                if(flag==0) System.out.println("Yes");
            }

        }
    }
}
