package htmlTag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HtmlUtil {
    private static final String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // 定义script的正则表达式
    private static final String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // 定义style的正则表达式
    private static final String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式
    private static final String regEx_space = "\\s*|\t|\r|\n";//定义空格回车换行符
    /**
     * @param htmlStr
     * @return
     * 删除Html标签
     */
    public static String delHTMLTag(String htmlStr) {
        Pattern p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
        Matcher m_script = p_script.matcher(htmlStr);
        htmlStr = m_script.replaceAll(""); // 过滤script标签
        Pattern p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
        Matcher m_style = p_style.matcher(htmlStr);
        htmlStr = m_style.replaceAll(""); // 过滤style标签
        Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
        Matcher m_html = p_html.matcher(htmlStr);
        htmlStr = m_html.replaceAll(""); // 过滤html标签
        Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);
        Matcher m_space = p_space.matcher(htmlStr);
        htmlStr = m_space.replaceAll(""); // 过滤空格回车标签
        return htmlStr.trim(); // 返回文本字符串
    }
    public static String getTextFromHtml(String htmlStr){
//        System.out.println(htmlStr);
        htmlStr = delHTMLTag(htmlStr);
        htmlStr = htmlStr.replaceAll(" ", "");
//        System.out.println(htmlStr.indexOf("。")+1);
//        htmlStr = htmlStr.substring(0, htmlStr.indexOf("。")+1);
        return htmlStr;
    }
    public static void main(String[] args) {
//        String str = "<div style='text-align:center;'> 整治“四风”  清弊除垢<br/><span style='font-size:14px;'> </span><span style='font-size:18px;'>公司召开党的群众路线教育实践活动动员大会</span><br/></div>";
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
                + "标记在设定前是没有定义的(undefied)。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;这四个属性的关系例如以下：</p>";
        str = str.replaceAll("&nbsp;","");
        System.out.println("str::"+getTextFromHtml(str));
       /* 我们以Buffer类開始对java.nio包的浏览历程。
        这些类是java.nio的构造基础。这个系列中。
        我们将尾随《javaNIO》书籍一起深入研究缓冲区。
        了解各种不同的类型，并学会如何使用。
        一个Buffer对象是固定数量的数据容器。
        其作用是一个存储器，或者分段运输区，在这里数据可被存储并在之后用于检索。
        Buffer类的家谱：一，缓冲区基础1.
        缓冲区的属性：容量(capacity)：缓冲区可以容纳的数据元素的最大数量，这一容量是在缓冲区被创建时设置的，而且永远不能被改变上界(limit):缓冲区的第一个不能被读或写的元素。或者说。缓冲区中现存元素的计数。
        位置(position):下一个要被读或写的元素的索引，位置会自己主动由对应的get()和put()函数更新。标记(mark):一个备忘位置，调用mark()来设定mark=position.调用reset()设定position=mark。标记在设定前是没有定义的(undefied)。这四个属性的关系例如以下*/
    }
}
