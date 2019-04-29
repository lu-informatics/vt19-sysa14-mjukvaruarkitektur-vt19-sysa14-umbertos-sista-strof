package FacadeISProject;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Facade
 */
@Stateless
@LocalBean
public class Facade implements FacadeRemote, FacadeLocal {

    /**
     * Default constructor. 
     */
    public Facade() {
        // TODO Auto-generated constructor stub
    }

}
