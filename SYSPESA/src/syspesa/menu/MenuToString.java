package syspesa.menu;

/**
 *
 * @author barbara
 */

public class MenuToString {
    
    public static String menuToString(Menu[] menu){
        String saida = "";
        int cont = 1;
        
        for(Menu menus: menu){
            saida += cont + " - " + menus.getItem()+ "\n";
            cont++;   
        }
        return saida;
    }
}


//Nesse método eu imprimo os menus no formato elegante de modo que consigo usar mais de uma vez com menus diferentes.