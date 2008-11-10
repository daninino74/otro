package is3.logforJ;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Demo {

	   static Logger logger = Logger.getLogger(Demo.class);
	   
	   public static void main(String[] args) {
	 
		 //Carga la configuracion del XML
		 DOMConfigurator.configure("ConfLog.xml"); 
	     
		 logger.info("Esto es una demo de log4j");
		 Casa casa = new Casa();
		 logger.error("hacer esto un domingo de tarde");
		 casa.llave();
		 Accion.realizar();     
		 logger.info("Fin de la demo");		 
		 
	   }
}

	
