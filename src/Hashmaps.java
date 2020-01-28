import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(1,"Hello");
        hmap.put(2,"Welcome");
        hmap.put(3,"Hola");
        hmap.put(4,"Hello");

        for(Integer x : hmap.keySet()){
            String value = hmap.get(x);
            System.out.println("Key = "+x+", Value = "+value);
        }

    }
}
