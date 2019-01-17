import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "aj,ks,df,ha,hs,df,ja,hl,sf,dh,l";
        String[] strArr = str.split(",");
        System.out.println(Arrays.toString(strArr));
        String strStr = String.join(" ",strArr);
        System.out.println(strStr);
    }
}
