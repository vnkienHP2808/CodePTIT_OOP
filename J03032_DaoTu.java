import java.util.Scanner;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String[] s = ip.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++){
                for(int j = s[i].length()-1; j >= 0; j--){
                    System.out.print(s[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
