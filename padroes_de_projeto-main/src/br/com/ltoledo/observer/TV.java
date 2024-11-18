package br.com.ltoledo.observer;

/**
 * @author ludmyla.toledo
 */
public class TV implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via TV" + subject.toString());
    }
}
