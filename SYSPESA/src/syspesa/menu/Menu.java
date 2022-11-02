package syspesa.menu;

import syspesa.executar.Executa;

/**
 *
 * @author barbara
 */

public interface Menu {

    public abstract String getItem();
    public abstract Executa getAcao();
}

//Generalizo como as classe do menu tem que ser, tornando mais pratico