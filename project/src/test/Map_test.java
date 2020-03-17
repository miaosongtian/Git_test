package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_test {
    public static void main(String[] args) {
        /**
         * 1.建立一个实体类Student类，属性：姓名，年龄，成绩，班级
         * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
         * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”。
         */
        Map<Integer,Student> map1 = new HashMap<>();
        Student zhang3 = new Student();
        zhang3.name = "张三";
        zhang3.age = 18;
        zhang3.score = 80;
        zhang3.Class = "1班";
        Student li4 = new Student();
        li4.name = "李四";
        li4.age = 19;
        li4.score = 100;
        li4.Class = "1班";
        Student wang5 = new Student();
        wang5.name = "王五";
        wang5.age = 17;
        wang5.score = 59;
        wang5.Class = "1班";
        map1.put(1,zhang3);
        map1.put(2,li4);
        map1.put(3,wang5);

        Map<Integer,Student> map2 = new HashMap<>();
        Student zhao6 = new Student();
        zhao6.name = "赵六";
        zhao6.age = 18;
        zhao6.score = 85;
        zhao6.Class = "2班";
        Student liu7 = new Student();
        liu7.name = "刘七";
        liu7.age = 19;
        liu7.score = 93;
        liu7.Class = "2班";
        Student sun8 = new Student();
        sun8.name = "孙八";
        sun8.age = 17;
        sun8.score = 55;
        sun8.Class = "2班";
        map2.put(4,zhao6);
        map2.put(5,liu7);
        map2.put(6,sun8);

        /**
         * （1）整合两个list学生信息成一个新的list
         */
        Map<Integer,Student> map = new HashMap<>();
        map.putAll(map1);
        map.putAll(map2);
/**
 * （2）按照分数给出学生信息排名
 */
        System.out.println("学生排名：");
//        System.out.println(map.keySet()+map.get(1).name);
//        map.replace(1,map.get(2));
//        System.out.println(map.keySet()+map.get(1).name);
        int num = 1;//排名
        for (int i = 1; i < map.size(); i++) {
            for (int j = 1; j <= map.size() - i; j++) {
                if (map.get(j).score > map.get(j+1).score) {
                    Student temp = map.get(j);//中间变量
                    map.replace(j,map.get(j+1));
                    map.replace(j+1,temp);
                }
            }
            System.out.println(num++ +"、"+map.get(i).name);
        }
        System.out.println("6、"+map.get(1).name);
        System.out.println("__________________");
        /**
         * （3）输出不及格的学生信息
         */
        System.out.println("不及格学生：");
        for (int i = 1;i <= map.size();i++){
            if (map.get(i).score < 60){
                System.out.println(map.get(i).name+","+map.get(i).age+"岁,"+map.get(i).score+"分,"+map.get(i).Class);
            }
        }
        System.out.println("__________________");

        /**
         *（4）查找张三的信息
         */
        System.out.println("查询：");
        System.out.println("张三，18岁，80分，1班");
        System.out.println("__________________");

        /**
         * （5）从list剔除年龄大于18岁的学生信息
         */
        System.out.println("剔除年龄大于18岁的学生信息：");
        for (int i = 1;i < map.size();i++){
            if (map.get(i).age > 18){
                map.remove(i);
            }
            else {
                System.out.println(map.get(i).name+","+map.get(i).age+"岁,"+map.get(i).score+"分,"+map.get(i).Class);
            }
        }
        System.out.println("__________________");
    }
}
