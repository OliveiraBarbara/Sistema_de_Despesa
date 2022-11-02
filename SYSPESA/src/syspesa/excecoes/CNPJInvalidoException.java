package syspesa.excecoes;

/**
 *
 * @author barbara
 */
public class CNPJInvalidoException extends InvalidoException{
    
    public CNPJInvalidoException() {
        super("CNPJ não foi digitado dentro do padrão!");
    }
}
