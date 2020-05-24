package Prog.gl.DIP;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class affiche implements Affichage {
	
	private static final Logger logger = LoggerFactory.getLogger("Affichage DIP");
	

	public void affichageMetierDebut() {
		logger.info("------------"+LocalDateTime.now() + "affichage start");
		
		
	}

	public void affichageMetierFin() {
		logger.info("------------"+LocalDateTime.now()+"affichage end");
		
	}
	

}
