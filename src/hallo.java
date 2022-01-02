import kotlin.jvm.Throws;
import org.w3c.dom.ls.LSOutput;

class hallo {
    static class java{
        static void  shout(){
            System.out.println("i love java");
        }
    }

     @Override
     public String toString() {
         return "hallo{}";
     }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        hallo.number = number;
    }

    static int number=8;

     public static void main(String[] args) {
        java dog=new java();
        //java dog=new java;
        dog.shout();
         System.out.println(dog.toString());
        System.out.println("hallo java"+hallo.getNumber());
    }
}
/** 生成注释文档*/
/*生成注释段落
* 总是与Python的注释方法不同，和C相同*/