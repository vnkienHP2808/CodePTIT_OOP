import java.util.Scanner;

public class J02022_SoXaCach {
    public static int n;
    public static int[] a = new int[15];
    public static int[] vs = new int[15];
    public static void output(){
        boolean check = true;
        for(int i = 1; i < n; i++){
            if(Math.abs(a[i] - a[i+1]) == 1){
                check = false;
                break;
            }
        }
        if(check){
            for(int i = 1; i <= n; i++) System.out.print(a[i]);
            System.out.println();
        }
    }

    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(vs[j] == 0){
                a[i] = j;
                vs[j] = 1;
                if(i == n) output();
                else Try(i+1);
                vs[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            n = ip.nextInt();
            Try(1);
            System.out.println();
        }
    }
}
