import java.util.Scanner;

public class J02025_DayConCoTongNgto {
    public static int n;
    public static int[] a;
    public static int[] x;
    public static boolean ngto(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void Try(int i){
        for(int j = 0; j <= 1; j++){
            x[i] = j;
            if(i == n-1){
                int sum = 0;
                for(int k = 0; k < n; k++){
                    if(x[k] == 1){
                        sum += a[k];
                    }
                }
                if(ngto(sum)){
                    for(int k = 0; k < n; k++){
                        if(x[k] == 1){
                            System.out.print(a[k] + " ");
                        }
                    }
                    System.out.println();
                }
            }
            if(i != n-1) Try(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            n = ip.nextInt();
            a = new int[n];
            x = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
            }
            for(int i = 0; i < n-1; i++){
                for(int j = i+1; j < n; j++){
                    if(a[i] < a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            Try(0);
        }
    }
}
