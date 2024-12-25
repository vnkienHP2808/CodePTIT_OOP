import java.util.Scanner;
import java.util.TreeSet;

public class J02024_DayConCoTongLe {
    public static int n;
    public static int[] a;
    public static int[] x;
    public static TreeSet<String> set = new TreeSet<>();

    public static void Try(int i){
        for(int j = 0; j <= 1; j++){
            x[i] = j;
            if(i == n-1){
                int sum = 0;
                for(int k = 0; k < n; k++){
                    if(x[k] == 1) sum += a[k];
                }
                if(sum % 2 == 1){
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
//BÀI NÀY DÙNG SORT LÀ SAI, PHẢI SẮP XẾP VÀ LÀM THEO KIỂU XÂU NHỊ PHÂN
    
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
