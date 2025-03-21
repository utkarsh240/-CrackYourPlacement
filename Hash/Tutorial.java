import java.util.*;

public class Tutorial {
    static void hashmethod(){
        Map<String, Integer> mp = new HashMap<>();

        mp.put("akash",22);
        mp.put("yash",16);
        mp.put("utk", 22);
        mp.put("nishant", 44);

        System.out.println(mp.get("akash"));
        mp.put("akash", 24);

        // mp.remove("akash");
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(String key: mp.keySet()){
            System.out.printf("age of %s is %d\n ", key, mp.get(key));
        }
    }
    public static void main(String[] args) {
    hashmethod();
    }
    
}
