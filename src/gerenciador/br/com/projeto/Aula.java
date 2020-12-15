package gerenciador.br.com.projeto;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getTempo() {
		return tempo;
	}
	
	public String toString() {
		return "["+this.titulo+" , minutos "+this.tempo+"]";
	}

	@Override
	public int compareTo(Aula aula2) {
		
		return this.titulo.compareTo(aula2.getTitulo());
	}
	
}
