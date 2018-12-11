import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("beginTime","2018-08-08");
        System.out.println(map.get("beginTi=me"));
    }

}
