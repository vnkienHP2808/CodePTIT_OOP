import java.util.Scanner;

public class J01010_Cat_doi {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String s = ip.nextLine();
            boolean check = true;
            long result = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0') result = result*10;
                else if(s.charAt(i) == '1') result = result * 10 + 1;
                else if(s.charAt(i) == '8') result = result * 10;
                else if(s.charAt(i) == '9') result = result * 10;
                else{
                    check = false;
                    break;
                }
            }
            if(!check || result == 0) System.out.println("INVALID");
            else System.out.println(result);
        }
    }
}
