/*
判断任意范围内（1——...）的素数，并输出所有素数。
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************用来求任意范围内（1——...）的素数个数，然后打印出来***************");
        Scanner scan = new Scanner(System.in);
        int count = 0;//用来计数
        int begin = 1;//范围开始数
        int last = 1;//范围结束数
        System.out.println("请输入开始和结尾的数：");
        if(scan.hasNextInt()) {
            begin = scan.nextInt();
            last = scan.nextInt();
            for (int n = begin; n <= last; n++) {
                if (isPrime(n)) {
                    count++;
                    System.out.print(n + "\t");
                    if(count%10==0)
                        System.out.println();
                }
            }
        }else{
            System.out.println("请输入正确的数(1——...)");
        }
        System.out.println();
        System.out.println(begin+"-"+last+"之间一共有"+count+"个素数");
    }

    private static boolean isPrime(int n){
        boolean flag = false;
        if(n==1){
            flag = false;
        }else{
            if(n==2||n==3)//对于1，2，3要单独拿出来，因为sqrt(1)、sqrt(2)、sqrt(3)<2，for循环的判定不能执行
                flag = true;
            for(int m=2;m<=Math.sqrt(n);m++){
                if((n%m)==0){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
        }
        return flag;
    }
}
