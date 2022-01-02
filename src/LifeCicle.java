public class LifeCicle {
    // 静态属性
    private static String staticField = getStaticField();

    //静态方法块
    static {
        System.out.println(staticField);
        System.out.println("这是一个\n例子输出多个内容，在MAIN统一调\t用\t\t\t\t\t ");
    }

    // 普通属性
    private String field = getField();

    //普通方法块
    {
        System.out.println(field);
    }

    //຅构造函数
    public LifeCicle() {
        System.out.println("nihao ");
    }

    public static String getStaticField() {
        String statiFiled = "Static Field Initial";
        return statiFiled;
    }

    public static String getField() {
        String filed = "Field Initial\t";
        return filed;
    }

    // 用来运行的主函数
    public static void main(String[] argc) {
        LifeCicle kk=new LifeCicle();
        //new LifeCicle();
        System.out.println(new LifeCicle());
    }
}

