import javax.swing.*;


public class Functional_Plain_Launcher1 {
    public static String ID = "Functional_Plain_Launcher1";
    public static String version = "0.0.2";
    public static String main_author = "FengYanMoShen";
    public static String other_author = "FengYanMoShen";
    public static void author(){
        System.out.println("main_author:" + main_author);
        System.out.println("other_author:" + other_author);
    }
    public static void information(){
        System.out.println("ID:" + ID);
        System.out.println("version:" + version);
        author();
    }

    //抽取随机数字
    public static void destiny(){
        int a = (int) (Math.random()*100);


        int min = 0; // 定义随机数的最小值
        int max = 100; // 定义随机数的最大值
        // 产生一个0~100的数
        int s = min + (int) (Math.random() * (max - min));
        if (s % 2 == 0) {
            //如果是偶数就输出
            System.out.println("随机数是：" + s);
        }else{
            //如果是奇数就加1后输出
            System.out.println("随机数是：" + (s + 1));
        }

        if (a == 0) {
            System.out.println("运气万中无一，出门彩票中亿");
        }else if(0<=s && 10>s){
            System.out.println("5");
        }else if(10<=s && 20>s){
            System.out.println("15");
        }else if(20<=s && 30>s){
            System.out.println("25");
        }else if(30<=s && 40>s){
            System.out.println("35");
        }else if(40<=s && 50>s){
            System.out.println("45");
        }else if(50<=s && 60>s){
            System.out.println("55");
        }else if(60<=s && 70>s){
            System.out.println("65");
        }else if(70<=s && 80>s){
            System.out.println("75");
        }else if(80<=s && 90>s){
            System.out.println("85");
        }else{/*(90<=s && 100>s)*/
            System.out.println("95");
        }
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

    public static void main (String[] args) {
        //创建窗口类对象
        Functional_Plain_Launcher1.window();
        Functional_Plain_Launcher1.information();
        for(int b = 0;b<=100;b+=1){
            System.out.println("\n");
            System.out.println(b);
            destiny();
        }






    }
}
