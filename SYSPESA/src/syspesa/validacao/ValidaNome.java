package syspesa.validacao;

import syspesa.excecoes.NomeInvalidoException;

/**
 *
 * @author barbara
 */

public class ValidaNome implements Validacao{

    @Override
    public void validaCampo(String nome) throws NomeInvalidoException {
        nome = nome.trim();
        if(!nome.matches("[A-Za-z]+")){
            throw new NomeInvalidoException();
        }
    }
    
}

//A partir das expressões regulares eu verifico se os nomes digitados tem ao menos 2 caracteres.