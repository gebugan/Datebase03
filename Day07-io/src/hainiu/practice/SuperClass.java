package hainiu.practice;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-05 16:12
 */
public abstract class  SuperClass {

    private String name;
    private int age;

    public abstract int chouxiang();

    public  void fiy(){
        System.out.println("父类的飞翔");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("我是父类的名字 " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    //父类无参构造方法
//    public SuperClass(){
//       // System.out.println("父类无参构造方法");
//    }

    //父类带参构造方法
    public SuperClass(String str){
        System.out.println(str);
    }





}
