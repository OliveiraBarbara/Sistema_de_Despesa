package syspesa.validacao;

import syspesa.excecoes.CNPJInvalidoException;

/**
 *
 * @author barbara
 */

public class ValidaCNPJ implements Validacao {

    @Override
    public void validaCampo(String cnpj) throws CNPJInvalidoException {
        cnpj = cnpj.trim();
        if (!cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}")) {
            throw new CNPJInvalidoException();
        }
    }
}

//A partir das expressões regulares eu verifico se o CNPJ segue o padrão: ##.###.###/####-##.