package J05071_TinhCuocDTCoDinh1;

public class Information implements Comparable<Information>{
    private String thueBao, start, end;
    private City city;

    public Information(String thueBao, String start, String end, City city) {
        this.thueBao = thueBao;
        this.start = start;
        this.end = end;
        this.city = city;
    }

    public int soPhut(){
        int s = Integer.parseInt(start.substring(0, 2))*60 + Integer.parseInt(start.substring(3));
        int e = Integer.parseInt(end.substring(0, 2))*60 + Integer.parseInt(end.substring(3));
        if(city.getTen().equals("Noi mang"))
            return (int) Math.round((e-s)*1.0/3);
        return e-s;
    }

    public long thanhTien(){
       return  soPhut() * city.getGiaCuoc();
    }

    @Override
    public int compareTo(Information if2){
        return Long.compare(if2.thanhTien(), thanhTien());
    }

    @Override
    public String toString(){
        return thueBao + " " +  city.getTen() + " " + soPhut() + " " + thanhTien();
    }
}
