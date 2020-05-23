/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？");
        System.out.println("请输入月数：");
        if(scan.hasNextInt()){
            n = scan.nextInt();
            int num = fun(n);
            System.out.println("第"+n+"个月的兔子总数为："+num);
        }else{
            System.out.println("请输入正确月数！");
        }
    }

    static int fun(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fun(n-1)+fun(n-2);
        }
    }
}
