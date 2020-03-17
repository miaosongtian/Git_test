package test;

public class test5 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[10];
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            c[cnt] = a[i];
            cnt++;
        }
        for (int i = 0; i < b.length; i++) {
            c[cnt] = b[i];
            cnt++;
        }
        for (int i = 1; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];//中间变量
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        for(int i = 0;i < c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
