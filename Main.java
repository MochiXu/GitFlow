import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        //输入处理
        Scanner scanner=new Scanner(System.in);
        //读取首行两个int参数
        int N= scanner.nextInt();
        int m= scanner.nextInt();
        scanner.nextLine();
        //循环读取第二行数组
        int[]nums=new int[N];
        for (int i=0;i<N;i++){
            nums[i]=scanner.nextInt();
        }
        //结果处理
        int ans=0;
        for (int num:nums){
            if (num==m)ans++;
        }
        //输出结果
        System.out.println(ans+9);
        //init版本
        //macOS change1
    }
}
