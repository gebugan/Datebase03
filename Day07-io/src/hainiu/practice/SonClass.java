package hainiu.practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-05 16:13
 */
public class SonClass extends SuperClass{


    @Override
    public int chouxiang() {
        return 0;
    }

    @Override
    public  void fiy(){
        System.out.println("子类的飞翔");
    };
    //子类无参构造方法
    public SonClass(){
        super(null);
        // System.out.println("子类无参构造方法");
    }

    //子类带参构造方法
    public SonClass(String str){
        super("解决带参");
        System.out.println(str);
    }

    public void call(String name){
        //super.setName("李四");
       // super.getName();
        System.out.println("给" + name + "打电话");
    }

}
