package anotacao;

import java.lang.annotation.*;

/**
 * @author ludmyla.toledo
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
