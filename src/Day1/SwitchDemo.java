package Day1;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){
        System.out.println("请输入成绩：");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        switch(score/10){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("不合格");
                break;


        }
    }
}
