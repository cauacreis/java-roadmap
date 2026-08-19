package cauafelype.maratona.java.javacore.annotations.desafio.dominio;

import java.lang.reflect.Field;

public class ValidadorDeObjetos {
    public static void validar(Object objeto) throws IdadeMinimaException, IllegalAccessException {
        Class classe = objeto.getClass();
        Field[] variaveis = classe.getDeclaredFields();

        for (Field variavel : variaveis) {
            if (variavel.isAnnotationPresent(IdadeMinima.class)) {
                IdadeMinima regra = variavel.getAnnotation(IdadeMinima.class);
                int idadeExigida = regra.valor();

                variavel.setAccessible(true);

                int idadeDoCliente = (int) variavel.get(objeto);

                if  (idadeExigida > idadeDoCliente) {
                    throw new RuntimeException("🚨 BARRADO! A variável '" + variavel.getName() +
                            "' exige no mínimo " + idadeExigida + " anos. O cliente tem " + idadeDoCliente + ".");
                    }
                }
            }
        }
    }