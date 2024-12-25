import java.util.Scanner;

public class J01003_Giai_phuong_trinh_bac_1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt(), b = ip.nextInt();
        if (a == 0) {
            if(b == 0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else{
            System.out.printf("%.2f",(float)-b/a);
        }
    }
}
