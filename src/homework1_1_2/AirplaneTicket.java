package homework1_1_2;

import java.util.Scanner;

public class AirplaneTicket {


    public static void main(String[] args) {
        Scanner can=new Scanner(System.in);
        System.out.println("请输入订票日期：");
        float i = can.nextFloat();
        float p=100;
        if((i>=1.01 && i <=1.03)&&(i>=5.01&&i<=5.03)&&(i>=10.1&&i<=10.07)){
            System.out.println("价格为："+p);
        }

        System.out.println("价格为："+(p*0.8));

    }







}
