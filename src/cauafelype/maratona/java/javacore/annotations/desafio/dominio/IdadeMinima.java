package cauafelype.maratona.java.javacore.annotations.desafio.dominio;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // anotação que ocorre em variaveis, diferente de TYPE que roda na classe
public @interface IdadeMinima {
    int valor();
}
