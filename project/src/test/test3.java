package test;
/*
 * 字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印
 */
public class test3 {
    public static void main(String[] args) {
        String str1 = "1,2,3,4,5,6,7";
        String[] str2 = str1.split(",");
        for(int i = 0;i < str2.length;i++){
            System.out.print(str2[i]+" ");
        }
        System.out.println();
    }
}
