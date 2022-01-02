import java.util.Arrays;

public class Staticclass {
    public static void main(String[] args) {
        SubA subA1 = new SubA("111111");
        SubA subA2 = new SubA("222222");
        SubA subA3 = new SubA("333333");
        int b[]=new int[5];
        b[0]=1;
        b[2]=4;
        System.out.println(b[0]+b[1]+b[2]);
        for (int i = b.length-1; i >=0 ; i--) {
            System.out.println(b[i]);}
        System.out.println("因为没有变量i，所以该方法只能打印数组，不能对每个数组进行操作");
        for (int array:b){
            System.out.println(array);}
//2D matrix use{} as element   [1 2
//                               3 4
//                                4 5]
        int a[][]={{1,2},{3,4},{4,5}};
        System.out.println(a[0][1]);
        System.out.println(a.length); //行数=3
        System.out.println(a[0].length);//列数=2
        System.out.println(a[0]);//hashmap
        System.out.println(Arrays.toString(a[0]));//hashmap to string
    }
}


