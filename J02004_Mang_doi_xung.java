import java.util.Scanner;

public class J02004_Mang_doi_xung {
    public static boolean doiXung(int[] a, int n){
        int l = 0, r = n-1;
        while(l < r){
            if(a[l] != a[r]) return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
            }
            if(doiXung(a, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
