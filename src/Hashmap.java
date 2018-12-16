import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2,"DUBAI");
        map.put(3, "PARIS");
        map.put(4, "SYLHET");
        map.put(5, "DHAKA");
        for (Map.Entry<Integer, String> USA :map.entrySet()){
            System.out.println("Collection View Is -"+ USA.getKey()+ " : "+USA.getValue());
        }










    }




}
