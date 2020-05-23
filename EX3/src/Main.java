/*
求任意范围内（100-999）的所有水仙花数
所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************求任意范围内（100-999）的所有水仙花数*****************");
        Scanner scan = new Scanner(System.in);
        int begain = 100;
        int last = 999;
        System.out.println("请输入开始和结尾数(100-999)：");
        if(scan.hasNextInt()){
            begain = scan.nextInt();
            last = scan.nextInt();
            System.out.println(begain+"到"+last+"范围内的水仙花数有：");
            for(int n=begain;n<=last;n++){
                if (isLotos(n)){
                    System.out.print(n+"\t");
                }
            }
        }else{
            System.out.println("请输入正确的数");
        }
    }

    private static boolean isLotos(int n){
        boolean flag = false;
        int c = (n%100)%10;
        int b = ((n-c)%100)/10;
        int a = (n-c-10*b)/100;
        if(n == a*a*a+b*b*b+c*c*c){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
