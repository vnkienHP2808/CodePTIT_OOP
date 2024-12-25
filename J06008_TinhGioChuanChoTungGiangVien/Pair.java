package J06008_TinhGioChuanChoTungGiangVien;

public class Pair <T, S>{
    private T first;
    private S second;

    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}

