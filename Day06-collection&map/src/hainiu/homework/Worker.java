package hainiu.homework;

import java.util.Objects;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-03 21:27
 */
public class Worker implements Comparable<Worker>{
    private String name;
    private int age;
    private int salary;

    public Worker() {
    }

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age &&
                salary == worker.salary &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
           新元素添加到集合时，与存在的元素进行比较
               根据compareTo方法的返回值
               如果返回正数，新元素比较大，往后放
               如果返回负数，新元素比较小，往前放
               如果返回0，重复，不添加
        */
    @Override
    public int compareTo(Worker o) {
        //按照对象的薪资进行排序
        int result = o.salary - this.salary;
        //薪资相同时，判断年龄
        if (result == 0){
            result = this.age - o.getAge();
        }
        //次要判断条件:，按照姓名的字母顺序排序
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        return result;
    }
}
