import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;




    @Retention(RetentionPolicy.RUNTIME)
    public @interface Anot{
      boolean isTrue()default true;
      int i()default 1;
    }


