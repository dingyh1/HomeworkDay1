package homework1_2_1;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int a = grade.nextInt();
        switch(a/10){
            case 10 :case 9:
                System.out.println("成绩为A");
                break;
            case 8:
                System.out.println("成绩为B");
                break;
            case 7:
                System.out.println("成绩为C");
                break;
            default:
                System.out.println("成绩不合格");
                break;



        }

    }

}
