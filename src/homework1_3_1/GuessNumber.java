
package homework1_3_1;

import java.util.Scanner;
public class GuessNumber{
    public static void main(String[] args){
        System.out.println("             猜字游戏       /n  请在0~1000之间猜数据 !");
        int m;
        m=(int)(Math.random()*100);//产生随机数

        Scanner sca=new Scanner(System.in);//

        for(int i=1;i<=7;i++){
            int a=sca.nextInt();
            if(a==m){
                System.out.println("恭喜你猜对了 !");
                System.out.println("您猜的次数为："+i);
            }else if(a>m){
                System.out.println("太大了，再小点 !");
                System.out.println("您猜的次数为："+i);
            }else if(a<m){
                System.out.println("太小了，再大点 !");
                System.out.println("您猜的次数为："+i);
            }
        }
        System.out.println("你太笨了，下次再来吧 !");
        System.out.println("正确答案是 ："+m);
        System.exit(0);//退出程序
    }
}