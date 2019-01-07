import java.text.SimpleDateFormat;
import java.util.*;

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


       /* String planIds = "7879899999100489,6787999140086";
        String str = "99910086";
        System.out.println(planIds.indexOf(str) == -1);*/

        /*Calendar cal =  Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("YYYYYMMDDHHMMSS");
        cal.setTime(date);
        cal.add(Calendar.DATE,-2);
        System.out.println(cal.getTime());*/
        /*StaticF staticF = new StaticF();
        staticF.setName("123");
        System.out.println("wph:"+staticF.wph());*/
        System.out.println("123abc".indexOf("")==-1);
        System.out.println("123abc".indexOf("a"));
    }

}
class StaticF {
    static{
        System.out.println("静态块");
    }

    public StaticF() {
        System.out.println("无参构造器");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String wph(){
        try{
            int a = 1;
            int b = 1;
            double s = a/b;
            return "s   :"+Double.toString(s);
        }catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        return "name"+name;
    }

}
