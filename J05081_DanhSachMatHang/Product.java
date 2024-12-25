package J05081_DanhSachMatHang;

public class Product {
    private String id;
    private String name;
    private String unit;
    private int buy;
    private int sell;
    private int stt;

    public Product(String id, String name, String unit, int buy, int sell, int stt) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public int profit(){
        return sell - buy;
    }

    public String toString(){
        return id + " " + name + " " + unit + " " + buy + " " + sell + " " + profit();
    }
}
