package br.com.ltoledo.forewhile;

/**
 * @author ludmyla.toledo
 */
public class ExemploPPT2 {

    public static void main(String args[]) {
        for (int contador = 1; contador <= 1000; contador ++) {
            System.out.println("Esta é a repetição nr: " +contador);
            if (contador == 10)
                break;

//              if (contador == 10) {
//                  break;
//              }
        }
    }
}
