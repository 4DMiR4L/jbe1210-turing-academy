package az.turingacademy.module03.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Cat mycat = new Cat("nigga", 31);
        Field[] catfields = mycat.getClass().getDeclaredFields();

        for (Field field : catfields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(mycat, "whiteNigga");
            }
        }
        System.out.println(mycat.getName());

        System.out.println();

        Method[] methods = mycat.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);
                method.invoke(mycat);
            }
        }

        for (Method method : methods) {
            if (method.getName().equals("message")) {
                method.setAccessible(true);
                method.invoke(mycat);
            }
        }
        for (Method method : methods) {
            if (method.getName().equals("mesage2_0")) {
                method.setAccessible(true);
                method.invoke(mycat);
            }
        }
    }
}
