package hainiu.practice;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @program: Text
 * @description:
 * @author: 小戈
 * @create: 2023-04-04 21:57
 */
public class Demo09 {
    public static void main(String[] args) {
        /**
         * //        Properties类表示一组持久的属性。
         * //        Properties可以保存到流中或从流中加载。
         * //        属性列表中的每个键及其对应的值都是一个字符串。
         */

        Properties ppt = new Properties();
        
        ppt.setProperty("name","Tom");
        ppt.setProperty("sfsfs","5854f");
        ppt.setProperty("age","22");

        //遍历
        ppt.forEach((k,v) ->System.out.println(k + "=" +v));

        Enumeration<?>pptName = ppt.propertyNames();
        while (pptName.hasMoreElements()){
            String key = (String) pptName.nextElement();
            String value = ppt.getProperty(key);
            System.out.println(key + "=" +value);
        }
    }
}
