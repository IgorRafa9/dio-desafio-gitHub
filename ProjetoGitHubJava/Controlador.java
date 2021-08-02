package Encapsulamento;

public interface Controlador {
	
	//Métodos Abstratos
	public abstract void ligar();
	public abstract void desligar();
	public abstract void trocarCanal();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void aumentarVol();
	public abstract void diminuirVol();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
}
