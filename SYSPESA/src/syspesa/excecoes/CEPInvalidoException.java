package syspesa.excecoes;

/**
 *
 * @author barbara
 */

public class CEPInvalidoException extends InvalidoException {
    
    public CEPInvalidoException() {
        super("CEP digitado fora do padrão!");
    }
    
}
