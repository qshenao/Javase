package apidoc;
import java.lang.String;
/**
 * 文档注释，可以在类上，方法上，常量上使用。是功能级注释
 * 文档注释可以使用javadoc命令生成文档手册
 * 在类上使用时用于说明当前的整体功能和设计
 *
 * @author DELL
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.8
 * */
public class ApiDocDemo {
    /**
     * 问候语
     * */
    public static final String INFO="hello";
    /**
     * 为给定的用户添加问候语并将其返回
     * @param name 给定的用户名
     * @return 含有问候语的字符串
     * */
    public static String sayHello(String name) {
        return "hello:"+name;

    }
}
