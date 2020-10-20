package Day16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect_Annotation_Test {
    public static void main(String[] args) {
        Record record = new Record();
        Class recordC = record.getClass();
        Constructor[] declaredConstructors = recordC.getDeclaredConstructors();//获取所有构造方法
        for (int i = 0; i < declaredConstructors.length; ++i) {
            Constructor constructor = declaredConstructors[i];
            if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
                //获取指定类型的的注释
                Constructor_Annotation ca = (Constructor_Annotation) constructor.getAnnotation(Constructor_Annotation.class);
                //获取注释信息
                System.out.println(ca.value());
            }
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            //获取参数的注释
            for (int j = 0; j < parameterAnnotations.length; ++j) {
                int length = parameterAnnotations[j].length;
                if (length == 0)
                    System.out.println("    未添加Annotation参数");
                else {
                    for (int k = 0; k < length; ++k) {
                        Field_Method_Oarameter_Annotation pa =
                                (Field_Method_Oarameter_Annotation) parameterAnnotations[j][k];
                        System.out.print("   " + pa.describe());
                        System.out.println("    " + pa.type());
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }

        Field[] declaredFields = recordC.getDeclaredFields();//获取所有字段
        for (int i = 0; i < declaredFields.length; ++i) {
            Field field = declaredFields[i];
            // 查看是否有指定类型的注释
            if (field.isAnnotationPresent(Field_Method_Oarameter_Annotation.class)) {
                //获取指定类型的注释
                Field_Method_Oarameter_Annotation fa = field.getAnnotation(Field_Method_Oarameter_Annotation.class);
                System.out.print("    " + fa.describe());
                System.out.println("    " + fa.type());
            }
        }

        Method[] methods = recordC.getMethods();
        for (int i = 0; i < methods.length; ++i) {
            Method method = methods[i];
            if (method.isAnnotationPresent(Field_Method_Oarameter_Annotation.class)) {
                Field_Method_Oarameter_Annotation ma = method.getAnnotation(Field_Method_Oarameter_Annotation.class);
                System.out.println(ma.describe());
                System.out.println(ma.type());
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            for (int j = 0; j < parameterAnnotations.length; ++j) {
                int length = parameterAnnotations[j].length;
                if (length == 0)
                    System.out.println(" 未添加Annotation的参数");
                else {
                    for (int k = 0; k < length; ++k) {
                        Field_Method_Oarameter_Annotation pa =
                                (Field_Method_Oarameter_Annotation) parameterAnnotations[j][k];
                        System.out.print("   " + pa.describe());
                        System.out.println("    " + pa.type());
                    }
                }
            }

        }
    }
}
