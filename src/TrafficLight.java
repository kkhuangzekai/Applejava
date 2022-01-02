import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Led l1 = Led.RED;
        l1.setS1("红灯停");
        Led l2 = Led.GREED;
        l2.setS2("绿灯行");
        Led l3 = Led.YELLOW;
        l3.setS3("黄灯等一等");
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入灯光颜色（red/green/yellow）：");
            String a = s.nextLine();
            switch (a){
                case "red":
                    System.out.println(l1.getS1());
                    System.exit(0);
                    break;
                case "green":
                    System.out.println(l2.getS2());
                    System.exit(0);
                    break;
                case "yellow":
                    System.out.println(l3.getS3());
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的灯颜色");

            }
        }
    }

}


enum Led{
    RED, GREED, YELLOW;
    private String s1;
    private String s2;
    private String s3;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }
}
