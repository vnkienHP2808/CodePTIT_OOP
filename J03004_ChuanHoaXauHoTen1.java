import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen1 {
    public static String chuanHoaXauHoTen1(String s) {
        if(s.length() == 1) return s.toUpperCase();
        else return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String  s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for(String i : a){
                System.out.print(chuanHoaXauHoTen1(i) + " ");
            }
            System.out.println();
        }
    }
}
