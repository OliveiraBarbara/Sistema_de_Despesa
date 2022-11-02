package syspesa.validacao;

import syspesa.excecoes.InvalidoException;

/**
 *
 * @author barbara
 */

public interface Validacao {
    
     public void validaCampo(String campo) throws InvalidoException;
}


//A partir dessa interface, eu crio todas as classes de validação, onde eu trato as exceções necessárias de cada atributo, a partir das expressões regulares