package Day1;

import java.util.Scanner;

public class IfDemo2 {



        public static void main(String[] args){

            Scanner sca = new Scanner(System.in);


            System.out.println("请输入订票日期");
            double date = sca.nextDouble();


            System.out.println("请输入票价原价");
            double money = sca.nextDouble();


            if((date>=1.01&&date<=1.03) || (date>=5.01&&date<=5.03) ||(date>=10.01&&date<=10.07)){

                System.out.println("票价是"+money);
            }else{

                System.out.println("票价是"+0.8*money);
            }
        }

    }
