import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
//        Map<String,Object> map = new HashMap<>();
//        map.put("beginTime","2018-08-08");
//        System.out.println(map.get("beginTi=me"));

//        String models = "123,45,789";
//        String [] modelsArr = models.split(",");
//        List<Map<String,Object>> list = new ArrayList<>();
//        Map<String,Object> map1 = new HashMap<>();
//        for(int i=0;i<modelsArr.length;i++){
//            map1.put("modelId",modelsArr[i]);
//            list.add(map1);
//            System.out.println("rty:"+list);
//            System.out.println("rty78");
//        }
//        System.out.println(list);


        String planIds = "7879899999100489,6787999140086";
        String str = "99910086";
        System.out.println(planIds.indexOf(str) == -1);
    }

}
