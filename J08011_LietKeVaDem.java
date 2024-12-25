import java.util.*;

public class J08011_LietKeVaDem {
    public static boolean check(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        while(ip.hasNextLine()){
            String[] a = ip.nextLine().trim().split("\\s+");
            for(String s : a){
                if(check(s)) map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        for(String s : map.keySet()){
            arr.add(s);
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        for(String s : arr){
            System.out.println(s + " " + map.get(s));
        }
    }
}
