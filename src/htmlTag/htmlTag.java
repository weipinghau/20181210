package htmlTag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmlTag {
    static String reg = "<[a-zA-Z]+.*?>([\\s\\S]*?)</[a-zA-Z]*>";
    static String reg2 = "<[a-zA-Z]+.*?>";
    static String reg3= "/<[^>]+>/gim";
    public static void main(String[] args) {
//        String reg = "<[a-zA-Z]+.*?>([\s\S]*?)</[a-zA-Z]*>";
        String str = "<p></p><p>&nbsp;&nbsp;&nbsp;&nbsp;我们以Buffer类開始对java.nio包的浏览历程。"
                + "这些类是java.nio的构造基础。这个系列中。我们将尾随《java NIO》书籍一起深入研究缓冲区。"
                + "了解各种不同的类型，并学会如何使用。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;一个Buffer对象"
                + "是固定数量的数据容器。<p></p><p>其作用是一个存储器，或者分段运输区，在这里数据可被存储并在之后用于检索。</p><p>"
                + "</p><p>&nbsp;&nbsp;&nbsp;&nbsp;Buffer类的家谱：</p><p>&nbsp;&nbsp;&nbsp;&nbsp;"
                + "<img src='http://photo.jfq24.com/image/bigger/blog/server/upload/2014-07/user_2/13711406446068247.png'"
                + "title='2014-07-27_1527.png'></p><p>&nbsp;&nbsp;&nbsp;&nbsp;<strong>一，缓冲区基础</strong>"
                + "</p><p>&nbsp;&nbsp;&nbsp; 1.缓冲区的属性：</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "容量(capacity)：缓冲区可以容纳的数据元素的最大数量，这一容量是在缓冲区被创建时设置的，而且永远不能被改变</p>"
                + "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;上界(limit): 缓冲区的第一个不能被读或写的元素。"
                + "或者说。缓冲区中现存元素的计数。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位置(position): "
                + "下一个要被读或写的元素的索引，位置会自己主动由对应的get()和put()函数更新。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;标记(mark): 一个备忘位置，调用mark()来设定mark=position.调用reset()设定position=mark。"
                + "标记在设定前是没有定义的(undefied)。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这四个属性的关系例如以下：</p";
        /*Pattern p = Pattern.compile(reg, Pattern.MULTILINE);
        str = str.replace("&nbsp;", "");
        Matcher m = p.matcher(str);
        while(m.find()) {
            String data = m.group(1).trim();
            if(!"".equals(data)) {
                System.out.println(data);
            }
        }*/
        str =  str.replace(reg3,"魏平华");
        System.out.println(str);

    }
}
