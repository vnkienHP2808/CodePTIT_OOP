package J07045_LoaiPhong;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyHieu, tenP, donGia,phiPV;

    public LoaiPhong(String line) {
        String[] data = line.trim().split("\\s+");
        this.kyHieu = data[0];
        this.tenP = data[1];
        this.donGia = data[2];
        this.phiPV = data[3];
    }

    @Override
    public int compareTo(LoaiPhong o2){
        return tenP.compareTo(o2.tenP);
    }

    @Override
    public String toString(){
        return kyHieu + " " + tenP + " " + donGia + " " + phiPV;
    }
}
