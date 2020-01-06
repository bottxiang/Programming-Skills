package gc;


public class Demo01 {
    public static void main(String[] args) {
        /*JVM的启动是多线程的吗？【面试题】*/

        System.out.println("AAAAA");
        System.out.println("BBBBB");
        System.out.println("CCCCC");
        System.out.println("DDDDD");

        //打印线程名称
        System.out.println(Thread.currentThread());//主线程

        for(int i = 0;i<2;i++){
            new Student();
            System.gc();//启动垃圾回收
        }
    }
}
class Student{
    //被垃圾回收器回收时，会调用
    //对象从内存释放时，会调用
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("student 被回收了...");
        //打印线程名称
        System.out.println(Thread.currentThread());//子线程
    }
}
