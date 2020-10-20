package Day16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
// 用于构造方法
@Retention(RetentionPolicy.RUNTIME)
//在运行时加载 Annotation 到 JVM中
public @interface Constructor_Annotation {
    String value() default "默认构造方法";//定义一个有默认值的String 成员
}
