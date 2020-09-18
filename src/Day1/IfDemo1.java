package Day1;

import java.util.Scanner;

public class IfDemo1 {

    public static class IfDemo {


        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("请输入第一个数字:");
            int a = scan.nextInt();

            System.out.println("请输入第二个数字:");
            int b = scan.nextInt();

            System.out.println("请输入运算符号:");
            String str = scan.next();

            if(str.equals("+")){
                System.out.println("a+b = "+(a+b));
            }else if(str.equals("-")){
                System.out.println("a-b = "+(a-b));
            }else if(str.equals("*")){
                System.out.println("a*b = "+(a*b));
            }else if(str.equals("/")){
                System.out.println("a/b = "+(a/b));
            }else if(str.equals("%")){
                System.out.println("a%b = "+(a%b));
            }
        }
    }


}
