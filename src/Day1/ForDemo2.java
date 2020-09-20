package Day1;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args){

        int n=0;
        int r=0;
        int s=0;
        int p=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(r=1;r<=n;r++){
            for(p=1;p<=n-r;p++){
                System.out.print(" ");
            }
            for(s=1;s<=2*r-1;s++){
                System.out.print("*");
                char ch = (char)(64+r);
//                System.out.print(ch);
            }

            System.out.print("\n");
        }
    }
}
