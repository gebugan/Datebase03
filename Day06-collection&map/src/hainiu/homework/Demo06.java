package hainiu.homework;

import java.util.HashMap;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-03 22:15
 */
public class Demo06 {
    public static void main(String[] args) {
        String str = "java world java javase    big big data data data java hello world hello";
        String[] arr = str.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }

        //遍历
        map.forEach((k, v) -> System.out.println("单词" + k + "出现了" + v + "次"));

    }
}
