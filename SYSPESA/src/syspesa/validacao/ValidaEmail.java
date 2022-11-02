package syspesa.validacao;

import syspesa.excecoes.EmailInvalidoException;


/**
 *
 * @author barbara
 */

public class ValidaEmail implements Validacao {

    @Override
    public void validaCampo(String email) throws EmailInvalidoException{
        email = email.trim();
        if (!email.matches("[0-9a-z_][0-9a-z_.]*@[0-9a-z_][0-9a-z_.]*(\\.[a-z]{2,3}){1,2}")) {
            throw new EmailInvalidoException();
        }
    }

}

//A partir das expressões regulares eu verifico se o email segue o padrão comum.