import java.util.Scanner;

public class J01008_Phan_tich_thua_so_ngto {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        for(int t = 1; t <= test; t++){
            int n = ip.nextInt();
            System.out.print("Test " + t + ": ");
            if(n == 0 || n == 1){
                System.out.print(n + "(" + 1 + ")");
            }
            else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        int dem = 0;
                        while(n % i == 0){
                            dem++;
                            n /= i;
                        }
                        System.out.print(i + "(" + dem + ") ");
                    }
                }
                if(n != 1) System.out.print(n + "(" + 1 + ")");
            }
            System.out.println();
        }
    }
}
