import java.util.Scanner;
import Ventanas.Principal;
import Ventanas.Ajustes;
import Ventanas.Puntuaciones;

public class Aplicacion {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ventana a mostrar");
		System.out.println("1. Ventana Principal");
		System.out.println("2. Ventana Ajustes");
		System.out.println("3. Ventana Puntuaciones");
		int seleccion = entrada.nextInt();
		
		switch (seleccion){
		case 1:
			//Ventana Principal
			Principal ventanaPrincipal = new Principal();
			ventanaPrincipal.setVisible(true);
			break;
		case 2:
			//Ventana Ajustes
			Ajustes ventanaAjustes = new Ajustes();
			ventanaAjustes.setVisible(true);
			break;
		case 3:
			//Ventana Puntuaciones
			Puntuaciones ventanaPuntuaciones = new Puntuaciones();
			ventanaPuntuaciones.setVisible(true);
			break;
		}
		
	}
}
