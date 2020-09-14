package homework1_1_3;

import java.util.Scanner;

public class soilder {
    public static void main(String[] args) {


        Scanner sex = new Scanner(System.in);
        System.out.println("请输入性别：");
        String a = sex.next();

        Scanner age = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int b = age.nextInt();

        Scanner height = new Scanner(System.in);
        System.out.println("请输入身高：");
        int c = height.nextInt();


         if( a.equals("man")){
            if( b > 20 && b < 26){
                if(c>=170)
                    System.out.println("符合");
                else System.out.println("不符合");
            }
             System.out.println("不符合");
        }

  if( a.equals("woman")){

    if (b > 20 && b < 22){
    if(c>=162)
        System.out.println("符合");
    else System.out.println("不符合");
         }

     System.out.println("不符合");
    }
else
    System.out.println("输入错误");

}
}