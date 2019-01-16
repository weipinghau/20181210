package htmlTag;

import com.sun.deploy.util.StringUtils;
import jdk.nashorn.internal.ir.WhileNode;

public class TestStr {
    public static void main(String[] args) {
//        String htmlstr = "&nbsp;&nbsp;&nbsp;数风流&nbsp;人物&nbsp;&nbsp;&nbsp;";
        String htmlstr = "";
        System.out.println("最后输出:"+removeNbsp(htmlstr));
    }
    public static String removeNbsp(String htmlstr){
//        if(htmlstr != null){
            String reg = "&nbsp;";
            while(htmlstr.startsWith(reg)){
                String str = htmlstr.substring(0,6);
                if(reg.equals(str)){
                    htmlstr = htmlstr.substring(6,htmlstr.length());
                }
            }
            while(htmlstr.endsWith(reg)){
                String str = htmlstr.substring(htmlstr.length()-6,htmlstr.length());
                if(reg.equals(str)){
                    htmlstr = htmlstr.substring(0,htmlstr.length()-6);
                }
            }
//        }
        return htmlstr;
    }
}
