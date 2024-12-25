package J05009_TimThuKhoaKyThi;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Student> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            in.nextLine();
            list.add(new Student(i, in.nextLine(), in.next(), in.nextDouble(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getDiemTong() != o2.getDiemTong())
                    return (int)(o2.getDiemTong()*10) - (int)(o1.getDiemTong()*10);
                return o1.getId() - o2.getId();
            }
        });
        double x = list.get(0).getDiemTong();
        for(Student stu : list){
            if(stu.getDiemTong() == x) System.out.println(stu.toString());
            else break;
        }
    }
}
