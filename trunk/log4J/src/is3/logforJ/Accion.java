package is3.logforJ;

import org.apache.log4j.Logger;


public class Accion {
	  
	  static Logger logger = Logger.getLogger(Accion.class);
	  
	  public static void realizar() {
		  logger.debug("Estoy en la clase accion");	
		  logger.fatal("es");
	  }
}
