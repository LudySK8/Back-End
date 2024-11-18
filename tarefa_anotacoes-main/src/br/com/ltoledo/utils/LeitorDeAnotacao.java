package br.com.ltoledo.utils;

import br.com.ltoledo.annotations.Tabela;
import br.com.ltoledo.models.Usuario;

import java.lang.annotation.Annotation;

/**
 * @author ludmyla.toledo
 */
public class LeitorDeAnotacao {
    public static void main(String[] args) {
        Class<Usuario> classe = Usuario.class;
        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela anotacao = classe.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + anotacao.value());
        } else {
            System.out.println("A classe não está anotada com @Tabela");
        }
    }
}
