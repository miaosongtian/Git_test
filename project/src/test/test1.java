package test;
/*
 *2.数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。
 */
public class test1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,5,5,5,6,7,8,9};
        int[] b = new int[8];
        int j = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] != 5){
                b[j] = a[i];
                j++;
            }
        }
        for(int i = 0;i < j;i++){
            System.out.print(b[i]+" ");
        }
    }
}