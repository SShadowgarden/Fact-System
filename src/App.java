import javax.print.attribute.standard.PresentationDirection;

import co.edu.uptc.model.PersonaManager;
import co.edu.uptc.model.ProductosManager;
import co.edu.uptc.pojo.Persona;
import co.edu.uptc.pojo.Productos;
import co.edu.uptc.presenter.Presenter;
import co.edu.uptc.view.MainFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
/*PersonaManager pm = new PersonaManager();
pm.AddPersona(new Persona("CC", 000, "jovenzz", "causa", "av 20", "tunja"));
pm.AddPersona(new Persona("TI", 000, "viejozz", "causa", "av 20", "tunja"));
pm.AddPersona(new Persona("CC", 000, "joven", "causa", "av 20", "tunja"));

for (int i = 0; i < pm.getUptcList().size(); i++) {
    Persona aux = (Persona) pm.getUptcList().get(i);
    System.out.println( aux.getNames() + "estoy");
    }*/
    Presenter p = new Presenter();    
    
    }
}
