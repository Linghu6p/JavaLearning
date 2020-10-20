package Day16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// Target 和 Retention的范围在书上p300 不予以列出
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Field_Method_Oarameter_Annotation {
    String describe();//定义没有默认值的String 成员
    Class type() default void.class;//定义一个有默认值的Class成员
}
