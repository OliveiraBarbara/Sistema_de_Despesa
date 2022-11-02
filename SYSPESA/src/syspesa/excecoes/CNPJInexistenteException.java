/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syspesa.excecoes;

/**
 *
 * @author barbara
 */

public class CNPJInexistenteException extends InvalidoException{
    
    public CNPJInexistenteException() {
       super("CNPJ não existe ou não é cadastrado para esta dispesa!!!!");
    }
    
}
