import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.security.spec.NamedParameterSpec;

public class Main {
    public static void main(String[] args) {
        OOP oop=new OOP("Ivan","Ivanov");
        Class clas = oop.getClass();

        System.out.println("Constructor:");
        Constructor[] constructor = clas.getDeclaredConstructors();
        for (Constructor constructor1 : constructor) {
            System.out.println(constructor1.getName());
            Parameter[] parameters = constructor1.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }
        }

        System.out.println("Metods");
        Method[] method=clas.getDeclaredMethods();
        for (Method method1:method){
            System.out.println(method1.getName());
        }



    }
}
