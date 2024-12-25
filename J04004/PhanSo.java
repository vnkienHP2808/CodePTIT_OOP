package J04004;

public class PhanSo {
    private  long tu;
    private  long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long Ucln(long a, long b){
        while(a * b != 0){
            if(a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }

    public long Bcnn(long a, long b){
        return a*b/Ucln(a, b);
    }

    public PhanSo RutGon(){
        long mauChung = Ucln(this.tu, this.mau);
        long newTu = this.tu / mauChung;
        long newMau = this.mau / mauChung;
        return new PhanSo(newTu, newMau);
    }
    public PhanSo Calculator(PhanSo p2){
        long mauChung = Bcnn(this.mau, p2.mau);
        long newTu = (mauChung / this.mau)*this.tu + (mauChung / p2.mau)*p2.tu;
        return new PhanSo(newTu, mauChung).RutGon();
    }
    public String toString(){
        return this.tu + "/" + this.mau;
    }
}
