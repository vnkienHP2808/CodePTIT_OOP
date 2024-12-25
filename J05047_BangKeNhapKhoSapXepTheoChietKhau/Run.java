package J05047_BangKeNhapKhoSapXepTheoChietKhau;

import java.util.*;

public class Run {
    public static String getMa(String s){
        String[] a = s.split("\\s+");
        return a[0].substring(0,1).toUpperCase() + a[1].substring(0,1).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            String tenSP = ip.nextLine();
            int soLuong = ip.nextInt();
            int donGia = ip.nextInt();

            String tmp = getMa(tenSP);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            arr.add(new Product(String.format(tmp + "%02d", map.get(tmp)), tenSP, soLuong, donGia));
        }
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o2.tienChietKhau(), o1.tienChietKhau());
            }
        });
        for(Product pro : arr){
            System.out.println(pro.toString());
        }
    }
}
