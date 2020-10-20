package Day16;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main_01 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Example_01 example = new Example_01("10", "20", "30");
        Class<? extends Example_01> exampleC = example.getClass();//获取所有构造方法
        Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {

            Constructor<?> constructor = declaredConstructors[i];
            System.out.println("查看是否允许带有可变数量的参数: " + constructor.isVarArgs());


            System.out.println("该构造方法的入口参数类型依次为：");
            Class[] parameterTypes = constructor.getParameterTypes(); //获取所有参数类型
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println("" + parameterTypes[j]);
            }

            System.out.println("该构造方法可能抛出的异常为: ");
            Class[] exceptionTypes = constructor.getExceptionTypes();
            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println("" + exceptionTypes[j]);
            }
            System.out.println();


            Example_01 example2 = null;


            while (example2 == null) {
                try {
                    if (i == 2)
                        example2 = (Example_01) constructor.newInstance();//采用无参数构造对象
                    else if (i == 1)
                        example2 = (Example_01) constructor.newInstance("7", 5);//采用具有两个参数的方式构造对象
                    else {
                        //Object[] parameters = new Object[]{new String[]{"100,200,300"}};//任意数量参数
                        example2 = (Example_01) constructor.newInstance("200","100","300");
                    }
                } catch (Exception e) {
                    System.out.println("在创建对象时抛出异常，下面抛出setAccessible()方法");
                    constructor.setAccessible(true); //设置为允许访问
                }
            }

            if (example2 != null) {
                example2.print();
                System.out.println();
            }


        }
    }
}
