package J05005_DanhSachDoiTuongSV3;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        List<Student> arr = new ArrayList<>();
        for(int i = 1; i <= test; i++){
            ip.nextLine();
            Student stu = new Student(ip.nextLine().trim(), ip.next(), ip.next(), ip.nextDouble());
            String id = "B20DCCN" + String.format("%03d", i);
            stu.setId(id);
            arr.add(stu);
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.getGpa()*100) - (int)(o1.getGpa()*100);
            }
        });
        for(Student stu : arr){
            System.out.println(stu.toString());
        }
    }
}
