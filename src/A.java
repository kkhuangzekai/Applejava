public class A {
    static {
        System.out.println("static in class A第一次进入父类");
    }
//bigdecimal 精度高于float double
    public void say() {
        System.out.println("开饭了");
    }

    //    public A(){
//        System.out.println("class A父类类被调用");
//    }
    public static class java {
        static {
            System.out.println("hallo world");
        }
    }

    private String name;

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        String str = null;
        Integer itr = null;
        Double dou = null;
        Integer integer = (Integer) null;
        String string = (String) null;
        System.out.println("integer = " + integer);
        System.out.println("string = " + string);

        A kk = new A();  //对于类的打印方法
        kk.say();//不能直接用class 做动作，要创建新的子类去做动作
        //new A();
        //System.out.println(A);
        kk.setname("ok");
        System.out.println(kk.getname());
        java k = new java(); //静态变量直接new就可以执行动作了

    }
}
