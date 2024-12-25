import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {
    public static String chuanHoaXauHoTen2(String s) {
        if(s.length() == 1) return s.toUpperCase();
        else return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }

    public static String chuanHoa(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String  s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for(int i = 1; i < a.length; i++){
                System.out.print(chuanHoaXauHoTen2(a[i]));
                if(i != a.length - 1) System.out.print(" ");
            }
            System.out.print(", " + chuanHoa(a[0]));
            System.out.println();
        }
    }
}

