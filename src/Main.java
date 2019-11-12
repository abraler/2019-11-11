import java.util.Scanner;

public class Main {
    static int []a;
    static int b;
    static int n=40;
    static int countnum=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
           b=in.nextInt();
           a=new int[b+1];
            for (int i = 1; i <b+1 ; i++) {
                a[i]=in.nextInt();
            }
            count(n,b);
        }
    }

    private static void count(int n,int b) {
        if(n==0){
            countnum++;
            return;
        }
        if(n<0||n>0&&b<1){
            return;
        }
        count(n,b-1);
        count(n-a[b],b-1);
    }
}
