package syspesa.excecoes;

/**
 *
 * @author barbara
 */

public class DataInvalidoException extends InvalidoException{
    
    public DataInvalidoException() {
        super("Data digitada fora do padrão!");
    }
    
}
