import java.util.HashMap;
import java.util.Map;

public class basics {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("akash", 20);
        mp.put("yash", 16);
        mp.put("lav", 17);
        mp.put("rishika", 19);
        mp.put("harry", 18);
        
        System.out.println(mp.get("yash"));
        System.out.println(mp.get("rahul")); // null
        
        mp.put("akash", 21);
        mp.remove("akash");
        mp.remove("riya");
        
        System.out.println(mp.containsKey("akash"));
        System.out.println(mp.containsKey("yash"));
        
        mp.putIfAbsent("yashika", 30);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
}