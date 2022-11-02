package syspesa.excecoes;

/**
 *
 * @author barbara
 */

public class NomeInvalidoException extends InvalidoException{
    
    public NomeInvalidoException() {
        super("Nome digitado com menos de dois caracteres!");
    }
    
}
