public class interfaceplay {//接口拓展了类的功能，而拓展功能经常需要重写方法override
    interface USB {
        void read();

        void write();
    }

    static class YouPan implements USB {
        @Override
        public void read() {
            System.out.println("U盘正在通过USB功能读取数据");
        }

        @Override
        public void write() {
            System.out.println("U盘正在通过USB功能写入数据");
        }
    }

    static class JianPan implements USB {
        @Override
        public void read() {
            System.out.println("键盘正在通过USB功能读取数据");
        }

        @Override
        public void write() {
            System.out.println("键盘正在通过USB功能写入数据");
        }
    }


        public static void main(String[] args) {
            YouPan youPan = new YouPan();
            //调用U盘的read( )方法读取数据
            youPan.read();
            //调用U盘的write( )方法写入数据
            youPan.write();
            //生成一个实现可USB接口（标准）的键盘对象
            JianPan jianPan = new JianPan();
            //调用键盘的read( )方法读取数据
            jianPan.read();
            //调用键盘的write( )方法写入数据
            jianPan.write();


    }
}