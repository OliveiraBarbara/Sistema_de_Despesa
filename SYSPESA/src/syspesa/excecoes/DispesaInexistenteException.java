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

public class DispesaInexistenteException extends InvalidoException {
    
    public DispesaInexistenteException() {
        super("Dispesa não Existe");
    }
    
}
