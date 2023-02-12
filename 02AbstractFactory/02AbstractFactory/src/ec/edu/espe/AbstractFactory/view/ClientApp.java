package ec.edu.espe.AbstractFactory.view;

import ec.edu.espe.AbstractFactory.model.Button;
import ec.edu.espe.AbstractFactory.model.GUIFactory;
import ec.edu.espe.AbstractFactory.model.Menu;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class ClientApp {

    public static void main(String[] args) {
        GUIFactory gUIFactory = GUIFactory.getFactory("Windows");

        Button buttonA = gUIFactory.createButton();
        buttonA.caption = "Press";

        buttonA.paint();

        Menu menuA = gUIFactory.createMenu();
        menuA.caption = "Show";

        menuA.paint();

    }

}
