package window;


public class Ventana {

	private final int maxres_alto = 25;
	private final int maxres_ancho = 80;
	
	String titulo;
	private int alto;
	private int ancho;
	private int posx;
	private int posy;
	private char[][] texto;
	
	public Ventana() {
		// TODO Auto-generated constructor stub
	}

	public Ventana(String titulo, int alto, int ancho, int posx, int posy) {

		this.titulo = titulo;
		this.alto = alto;
		this.ancho = ancho;
		this.posx = posx;
		this.posy = posy;
		this.texto = new char[this.alto][this.ancho];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public char[][] getTexto() {
		return texto;
	}

	public void setTexto(char[][] texto) {
		this.texto = texto;
	}
	
	
	/*
	 * Métodos propios de una ventana
	 * 
	 */
	public void resize(int alto, int ancho) {
		// TODO implementar método
	}
	public void maximize(int alto, int ancho) {
		// TODO implementar método
	}
	public void minimize(int alto, int ancho) {
		// TODO implementar método
	}
	public void move(int alto, int ancho) {
		// TODO implementar método
	}
	
	public void show() {
		// TODO implementar método
	}
	
	public void hide() {
		// TODO implementar método
	}
	
	public void refresh() {
		// TODO implementar método
	}
	
	public void printAt(int posx, int posy,String text) {
		// TODO implementar método
	}
	
	
}
