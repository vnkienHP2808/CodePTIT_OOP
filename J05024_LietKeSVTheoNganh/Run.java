package J05024_LietKeSVTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
   public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       ArrayList<Student> arr = new ArrayList<>();
       int n = ip.nextInt();
       ip.nextLine();
       for(int i = 0; i < n; i++){
           arr.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
       }
       int q = ip.nextInt();
       ip.nextLine();
       while(q-- > 0){
           String str= ip.nextLine();
           System.out.println("DANH SACH SINH VIEN KHOA " + str.toUpperCase() + ":");
           if(str.equals("Ke toan"))
           for(Student stu : arr){
               if(true) System.out.println(stu.toString());
           }
       }
   }
}
