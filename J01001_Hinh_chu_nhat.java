import java.util.Scanner;

public class J01001_Hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt(), y = ip.nextInt();
        if(x <= 0 || y <= 0) System.out.println(0);
        else{
            System.out.print(2*(x + y) + " " + x * y);
        }
    }
}
