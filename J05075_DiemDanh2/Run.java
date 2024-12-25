package J05075_DiemDanh2;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static int tinhDiem(String diemDanh){
        int diemCC = 10;
        for(int i = 0; i < diemDanh.length(); i++){
            char c = diemDanh.charAt(i);
            if(c == 'm') diemCC--;
            else if(c == 'v') diemCC -= 2;
        }
        if(diemCC < 0) return 0;
        return diemCC;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            students.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }

        for(int i = 1; i <= n; i++){
            String maSV = ip.next();
            String diemDanh = ip.next();

            for(Student student : students){
                if(maSV.equals(student.getMaSV())){
                    student.setDiemCC(tinhDiem(diemDanh));
                    break;
                }
            }
        }
        String input = ip.next();
        for(Student student : students){
            if(student.getLopSV().equals(input)) System.out.println(student);
        }
    }
}

