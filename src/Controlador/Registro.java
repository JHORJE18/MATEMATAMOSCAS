package Controlador;

public class Registro {
	
	public boolean nombreValido(String nombre){
		boolean valido = false;
		
		//Comprobamos tamaño
		if (limite(5, nombre, 20)){
			valido = true;
		}
		System.out.println("Nombre " + nombre + " es " + valido);
		return valido;
	}
	
	public boolean apedilloValido(String apedillo){
		boolean valido = false;
		
		//Comprobamos tamaño
		if (limite(6, apedillo, 20)){
			//Tiene que tener un espacio en blanco
			if (apedillo.indexOf(' ') != -1){
				valido = true;
			}
		}
		System.out.println("El Apedillo " + apedillo + " es " + valido);
		return valido;
	}
	
	public boolean contrasenaValida(String pass){
		boolean valido = false;
		
		//Comprobamos tamaño
		if (limite(6, pass, 20)){
			//No puede tener espacios en blanco ni caracteres delicados
			if (pass.indexOf(' ') == -1 && pass.indexOf('@') == -1 && pass.indexOf('#') == -1){
				valido = true;
			}
		}
		System.out.println("La contraseña " + pass + " es " + valido);
		return valido;
	}
	
	public boolean limite(int limitMIN, String palabra, int limitMAX){
		boolean valido = false;
		
		if (palabra.length() >= limitMIN && palabra.length() <= limitMAX){
			valido = true;
		}
		return valido;
	}

}
