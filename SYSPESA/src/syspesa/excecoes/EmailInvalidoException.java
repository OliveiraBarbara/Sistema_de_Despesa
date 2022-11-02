
package syspesa.excecoes;

/**
 *
 * @author barbara
 */

public class EmailInvalidoException extends InvalidoException{
    
    public EmailInvalidoException() {
        super("Email fora do padrão!");
    }
    
}
