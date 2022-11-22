package window;


public class Ventana {

	private final int maxres_alto = 25;
	private final int maxres_ancho = 80;
	private final char fill_char = '*';
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

		int tam = titulo.length();
		this.alto = alto;
		this.ancho = ancho;
		this.titulo = titulo;
		if (tam>this.ancho) {
			this.titulo = this.titulo.substring(0,this.ancho-1);
		} else {
			for (int i= tam;i<ancho;i++) {
				this.titulo = this.titulo + "-";
			}
		}

		this.posx = posx;
		this.posy = posy;
		this.texto = new char[this.alto][this.ancho];
		this.limpiarTexto();
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
		

			
		
		System.out.println(this.titulo);
		for(int fi=0;fi<this.alto;fi++) {
			for (int co=0;co<this.ancho;co++) {		
			System.out.print(this.texto[fi][co]);
			}//end co
			System.out.println();
		} // end fi
	}
	
	public void hide() {
		// TODO implementar método
		for(int fi=0;fi<this.maxres_alto;fi++) {
			System.out.println();
		}
	}
	
	public void refresh() {
		// TODO implementar método
		printTexto(this.texto.toString());
		this.show();
	}
	
	/**
	 * Limpia el área de texto de la ventana, 
	 * rellenando con espacios
	 */
	private void limpiarTexto() {
		for(int fi=0;fi<this.alto;fi++) {
			for (int co=0;co<this.ancho;co++) {
				this.texto[fi][co] = this.fill_char;
			}//end co
		} // end fi
	}// end limpiarTexto	
	
	public void printAt(int posx, int posy,String text) {
	}
	
	/**
	 * imprime siempre desde la posición 0,0.
	 * Texto más largo que el área (anchoxalto), se recortan
	 * @param text Texto a mostrar en la ventana
	 */
	public void printTexto(String text) {
		// 
		int j = text.length();
		int buffer = this.ancho*this.alto;
		int fi,co;
		if (j>buffer) j = buffer; // recortar texto
		for (int cursor=0;cursor<j;cursor++) {
			
			fi = cursor / this.ancho;
			co = cursor % this.ancho;
			System.out.println("Cur ["+ text.charAt(cursor) +"]: "+ cursor + " fi: "+fi +" co: "+co);
			this.texto[fi][co] = text.charAt(cursor);
			
		}//end buffer
		
	}
	
	
}
