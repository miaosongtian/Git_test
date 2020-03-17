package test;

/**
 * 4.计算Hello World! 中出现了几次l。
 */
public class test4 {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        int cnt = 0;
        for(int i = 0;i < str1.length();i++){
            if(str1.charAt(i) == 'l'){
                cnt++;
            }
        }
        System.out.println("其中“l”出现次数为："+cnt);
    }
}
