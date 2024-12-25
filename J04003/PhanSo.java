package J04003;

public class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long UCLN(long tu, long mau){
        while(tu * mau != 0){
            if(tu > mau) tu %= mau;
            else mau %= tu;
        }
        return tu + mau;
    }
    public PhanSo Solve(){
        long mauchung = UCLN(this.tu, this.mau);
        long newTu = this.tu/mauchung;
        long newMau = this.mau/mauchung;
        return new PhanSo(newTu, newMau);
    }
    public String toString(){
        return this.tu + "/" + this.mau;
    }
}
