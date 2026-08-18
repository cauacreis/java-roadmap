package cauafelype.maratona.java.javacore.annotations.dominio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface InformacaoDev {
    String autor();
    String versao() default "1.0";
}
