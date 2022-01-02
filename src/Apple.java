import java.util.Scanner;

public class Apple {
    private int num;
    private String color;
    public Apple(int num){
        this(num,"red");
    }

    public Apple(String color){
        this(1,color);
    }
    public Apple(int num, String color) {
        this.num = num;
        this.color = color;
        System.out.print(color+'\n');
        System.out.print(num);
        System.out.println("sout is good");
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("how many apple you want:");
            String name = scanner.nextLine();
            System.out.println("APPLE ACCOUNT:" + name);
            new Apple(30);
            int b = 0;  //把string转化为int  并且进行输入非数字时的错误避免
            try {

                b = Integer.valueOf(name).intValue();
                if (scanner.hasNextInt(b)) {

                    String type = (0 < b && b < 100) ? "less than 100" : "more than 100";
                    System.out.println(type);
                } else {
                    System.out.println("this is not int");
                }

            } catch (NumberFormatException e) {

                e.printStackTrace();
                System.out.println("please input int");

            }

        }}
