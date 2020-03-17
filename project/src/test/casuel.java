package test;

import java.util.ArrayList;
import java.util.List;

public class casuel {
    public static void main(String[] args) {
        /**
         * 1.建立一个实体类Student类，属性：姓名，年龄，成绩，班级
         * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
         * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”。
         */
        List<Student> list1 = new ArrayList<>();
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
        list1.add(zhang3);
        list1.add(li4);
        list1.add(wang5);

        List<Student> list2 = new ArrayList<>();
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
        list2.add(zhao6);
        list2.add(liu7);
        list2.add(sun8);

        /**
         * （1）整合两个list学生信息成一个新的list
         */
        List<Student> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
/**
 * （2）按照分数给出学生信息排名
 */
        System.out.println("学生排名：");
            int num = 1;//排名
            for (int i = 1; i < list.size(); i++) {
                for (int j = 0; j < list.size() - i; j++) {
                    if (list.get(j).score > list.get(j+1).score) {
                        Student temp = list.get(j);//中间变量
                        list.set(j,list.get(j+1));
                        list.set(j+1,temp);
                    }
                }
                System.out.println(num++ +"、"+list.get(list.size()-i).name);
            }
            System.out.println("6、"+list.get(0).name);
        System.out.println("__________________");
        /**
         * （3）输出不及格的学生信息
         */
        System.out.println("不及格学生：");
        for (int i = 0;i < list.size();i++){
            if (list.get(i).score < 60){
                System.out.println(list.get(i).name+","+list.get(i).age+"岁,"+list.get(i).score+"分,"+list.get(i).Class);
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
        for (int i = 0;i < list.size();i++){
            if (list.get(i).age > 18){
                list.remove(i);
            }
            else {
                System.out.println(list.get(i).name+","+list.get(i).age+"岁,"+list.get(i).score+"分,"+list.get(i).Class);
            }
        }
        System.out.println("__________________");
    }
}
