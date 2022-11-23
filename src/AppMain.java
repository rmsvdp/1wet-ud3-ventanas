import window.Ventana;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventana postit = new Ventana("win",5,5,0,0);
		//postit.show();
		postit.printTexto("contenido dentro");
		postit.show();
		postit.resize(10, 9);
		
		postit.maximize();
		
		System.out.println("\n Aplicación terminada.");
	}

}
