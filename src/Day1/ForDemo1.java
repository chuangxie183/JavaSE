package Day1;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random = (int)(Math.random()*100+1);
        int flag = 0;

        for (int i = 0; i <7 ; i++) {
            System.out.println("请猜一猜数的大小：");
            int number = scanner.nextInt();

            if(number>random);{
                flag++;
                System.out.println("太大了，再小一点！" );
            }
            if(number<random){
                flag++;
                System.out.println("太小了，再大一点！");
            }
            if(number==random){
                System.out.println("恭喜你猜对了！");
                break;
            }
            if(flag==7){
                System.out.println("你太笨了，下次再来吧");
            }

        }



    }
}
