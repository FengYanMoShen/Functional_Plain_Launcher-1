import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

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
    public static void window() {
        //创建窗口
        JFrame frame = new JFrame();
        //窗口标题
        frame.setTitle(ID);
        //窗口大小
        frame.setSize(800,610);
        //居中
        frame.setLocationRelativeTo(null);
        //窗口可见
        frame.setVisible(true);
        //随关随停
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


        // 创建一个面板
        JPanel panel = new JPanel(new BorderLayout());

        // 创建一个标签
        JLabel label = new JLabel("欢迎使用 Java 窗口");
        panel.add(label, BorderLayout.CENTER);

        // 创建一个按钮
        JButton button = new JButton("点击我");
        panel.add(button, BorderLayout.NORTH);

        // 将面板添加到窗口中
        frame.add(panel);

    }

    public static void main (String[] args) {
        //创建窗口类对象
        Functional_Plain_Launcher1.window();
        Functional_Plain_Launcher1.information();
        destiny();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串（nextLine）：");
        String str = input.nextLine();
        System.out.println("请输入指数：");
        int exponent = input.nextInt();
        System.out.println("请输入循环次数：");
        int loopCount = input.nextInt();
        double result = Math.pow(Double.parseDouble(str), exponent);
        for (int i = 0; i < loopCount; i++) {
            result = Math.pow(result, exponent);
        }
        System.out.println(result);
    }
}