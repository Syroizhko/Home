import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException  {

        Phone phone =new Phone("black",4);
        Main main = new Main();
        main.Annote(phone,phone.getClass());


    }
    public void Annote(Object o,Class c) throws IOException, IllegalAccessException {
        Writer writer = new FileWriter("src/Catalog.txt");
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            Annotation[] annotations = f.getDeclaredAnnotations();
            System.out.println(annotations.length);
            boolean annotationPresent = f.isAnnotationPresent(Anot.class);
            if (annotationPresent) {
                String str = f.get(o).toString();
                writer.write(str+" ");

            }

        }
        writer.flush();
        writer.close();
    }
}
