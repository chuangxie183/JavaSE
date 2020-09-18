package Day1;

import java.util.Scanner;

public class IfDemo3 {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入性别:");
            String sex = scanner.next();


            System.out.println("请输入年龄:");
            int age = scanner.nextInt();


            System.out.println("请输入身高:");
            double height = scanner.nextDouble();


            if(sex.equals("男")){

                if(age>=20 && age<=26){

                    if(height>=170){

                        System.out.println("可以入伍");
                    }else{

                        System.out.println("不能入伍");
                    }
                }else{

                    System.out.println("不能入伍");
                }
            }else if(sex.equals("Ů")){

                if(age>=20 && age<=22){

                    if(height>=162){

                        System.out.println("可以入伍");
                    }else{

                        System.out.println("不可以入伍");
                    }
                }else{

                    System.out.println("不能入伍");
                }
            }
        }
    }

