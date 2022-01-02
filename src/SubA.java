public class SubA extends A {
    static {
        System.out.println("static in class SubA第一次继承时父类和子类都要调用一次");
    }

    public SubA() {
        super();
        System.out.println("class SubA子类被调用");
    }

    public SubA(String sa) {
        System.out.println("class SubA 输出字符串" + sa);
    }
}


