/*
将一个正整数分解质因数
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("****************将一个正整数分解质因数*****************");
        System.out.println("请输入一个正整数：");
        Scanner scan = new Scanner(System.in);

        int count = 0;//用于统计分解的质数数目
        int[] ns = new int[100];//用于存储分解的质数

        if(scan.hasNextInt()){
            int num = scan.nextInt();//输入要分解的正整数num
            int input  =num;
            for(int i =2;i<=num;i++){//for循环，让正整数依次与2到它本身进行取余操作，取余为0说明可以分解成这个质因数
                if(num%i==0){
                    ns[count] = i;//记下这个质因数
                    num = num/i;//除以这个质因数再赋值给num
                    count++;//计数加一
                    i--;//这里i--是因为，循环结束后i要加1，但是也存在num还可以被这个质因数分解的情况，比如80=2*2*2*2*5
                }
            }

            if(count==1){
                System.out.println("这个数是质数！");
            }else{
                System.out.print(input+"可分解为："+ns[0]);
                for(int k=1;k<count;k++){
                    System.out.print("*"+ns[k]);
                }
            }
        }else{
            System.out.println("请输入正确的数！");
        }
    }
}
