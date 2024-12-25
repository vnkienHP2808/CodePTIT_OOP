package J05015_DuaXeDap;

public class Candidate implements Comparable<Candidate>{
    private String hoTen, donVi, thoiGianDen;

    public Candidate(String hoTen, String donVi, String thoiGianDen) {
        this.hoTen = hoTen;
        this.donVi = donVi;
        this.thoiGianDen = thoiGianDen;
    }

    public String maTS(){
        String[] a = hoTen.split("\\s+");
        String[] b = donVi.split("\\s+");
        String ma = "";
        for(String s : b){
            ma += s.substring(0,1).toUpperCase();
        }
        for(String s : a){
            ma += s.substring(0,1).toUpperCase();
        }
        return ma;
    }

    public int vanToc(){
        int h = Integer.parseInt(thoiGianDen.substring(0,1));
        int m = Integer.parseInt(thoiGianDen.substring(2));
        double time = ((h-6) + m*1.0/60);
        return (int)Math.round(120 / time);
    }

    @Override
    public int compareTo(Candidate c2){
        return thoiGianDen.compareTo(c2.thoiGianDen);
    }

    @Override
    public String toString(){
        return maTS() + " " + hoTen + " " + donVi + " " + vanToc() + " Km/h";
    }
}
