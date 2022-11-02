package syspesa.excecoes;

/**
 *
 * @author barbara
 */

public class TelefoneInvalidoException extends InvalidoException {
    
    public TelefoneInvalidoException() {
        super("Telefone digitado fora do padrão!");
    }
    
}
