import java.math.BigDecimal;
import java.util.Scanner;

public class readnumber {
    public static double max(double a,double b) {//重载方法max
        double result = 0;
        if (a == b) {
            System.out.println("same number");
            return 0;
        }
        if (a > b) {
            result = a;
            System.out.println("大数为" +result);
        } else {
            result = b;
            System.out.println("大数为" +result);
        }
        return result;//加了这句系统运行结果完全一样

    }
        public static int max(int a,int b) {
            int result = 0;
            if (a == b) {
                System.out.println("same number");
                return 0;
            }
            if (a > b) {
                result = a;
                System.out.println("大数为" +result);
            } else {
                result = b;
                System.out.println("大数为" +result);
            }
            return result;//加了这句系统运行结果完全一样
        }

    public static void main(String[] args) {
        int big=  max(20,30);
        //System.out.println(big);

        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出

        Scanner counter = new Scanner(System.in);  //计算总和
        double sum=0;
        double n=0;
        while(scanner.hasNextBigDecimal()){
            double x=scanner.nextDouble();
            n++;
            sum+=x;

        }
        System.out.println("总和为：" +sum);
        System.out.println("average is"+sum/n);

        scanner.close();
    }
}
