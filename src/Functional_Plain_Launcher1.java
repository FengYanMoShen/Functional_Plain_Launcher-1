import javax.swing.*;
import java.util.Scanner;


public class Functional_Plain_Launcher1{
    public static String ID = "Functional_Plain_Launcher1";
    public static String version = "0.0.2";
    public static String main_author = "FengYanMoShen";
    public static String other_author = "";
    public static void author(){
        System.out.println("main_author:" + main_author + "\nother_author:" + other_author);
    }
    public static void information(){
        System.out.println("ID:" + ID + "\nversion:" + version);
        author();
    }

    //抽取随机数字
    public static void destiny() {
        int randomNum =(int) (Math.random() * 100); // 生成0~100之间的随机数
        int outputNum = switch (randomNum / 10) {
            case 0 -> 5;
            case 1 -> 15;
            case 2 -> 25;
            case 3 -> 35;
            case 4 -> 45;
            case 5 -> 55;
            case 6 -> 65;
            case 7 -> 75;
            case 8 -> 85;
            case 9 -> 95;
            default -> 100;
        }; // 用于存储要输出的数字

        System.out.println("随机数是：" + (randomNum % 2 == 0 ? randomNum : randomNum + 1));
        System.out.println(outputNum);
    }


    //创建窗口类
    public static void window(){
        //创建窗口
        JFrame L = new JFrame();
        //窗口标题
        L.setTitle(ID);
        //窗口大小
        L.setSize(800,610);
        //居中
        L.setLocationRelativeTo(null);
        //窗口可见
        L.setVisible(true);
        //随关随停
        L.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void square(int radix, int sexponential)/*平方*/{
        System.out.println("警告：该square方法无法计算(x(x<0))^0的值");
        double final_number = 1.0;

        if (radix == 0 && sexponential == 0) {
            System.out.println("没有意义");
        } else if (radix == 0) {
            System.out.println(0);
        } else if (radix > 0 && sexponential < 0) {
            while(sexponential < 0) {
                final_number *= radix;
                sexponential++;
            }
            final_number *= (1.0/final_number);
            System.out.println(final_number);
        } else if (radix > 0 && sexponential > 0) {
            while(sexponential > 0) {
                final_number *= radix;
                sexponential--;
            }
            System.out.println((int)final_number);
        } else if(radix > 0) {
            System.out.println(1);
        } else if(sexponential > 0) {
            radix = -radix;
            while(sexponential > 0) {
                final_number *= radix;
                sexponential--;
            }
            final_number = -final_number;
            System.out.println((int)final_number);
        } else if(sexponential < 0) {
            radix = -radix;
            while(sexponential < 0) {
                final_number *= radix;
                sexponential++;
            }
            final_number *= -(1.0/final_number);
            System.out.println(final_number);
        } else{
            System.out.println(1);
        }
    }

    public static void main (String[] args) {
        //创建窗口类对象
        Functional_Plain_Launcher1.window();
        Functional_Plain_Launcher1.information();

        Scanner input_1 = new Scanner(System.in);
        Scanner input_2 = new Scanner(System.in);
        Scanner input_3 = new Scanner(System.in);
        System.out.println("请输入字符串（nextLine）：");
        int str1 = input_1.nextInt();
        int str2 = input_2.nextInt();
        int str3 = input_3.nextInt();
        System.out.println(str1);
        System.out.println(str2);

        while (str3 !=0){
            square(str1,str2);
            str3 = 0;
        }
    }
}
