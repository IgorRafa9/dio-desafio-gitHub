package Encapsulamento;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligar;
	private boolean tocar;
	private int canal;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligar = true;
		this.tocar = false;
		this.canal=0;
	}
	

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigar() {
		return ligar;
	}

	private void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal+=canal;
	}

	private boolean getTocar() {
		return tocar;
	}

	private void setTocar(boolean tocar) {
		this.tocar = tocar;
	}


	@Override
	public void ligar() {
		this.setLigar(true);	
	}

	@Override
	public void desligar() {
		this.setLigar(false);
		for(int i=0;i<1;i++) {
			System.out.println("Desligando...");
		}
		System.out.println("Desligou");
	}
	
	@Override
	public void abrirMenu() {
		System.out.println("-----------MENU-------------");
		System.out.println("Está Ligado? "+this.ligar);
		System.out.println("Está tocando? "+this.getTocar());
		System.out.print("Volume: "+this.getVolume());
		for(int i = 0; i<=this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.println("");
	}
	
	@Override
	public void trocarCanal() {
		System.out.println("Mudando pro canal: "+this.getCanal());
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");		
	}

	@Override
	public void aumentarVol() {
		if(this.getLigar()==true) {
			this.setVolume(this.getVolume()+5);
		}else {
			System.out.println("Impossível diminuir volume");
		}
		
	}

	@Override
	public void diminuirVol() {
		if(this.getLigar()==true) {
			this.setVolume(this.getVolume()-5);
		}else {
			System.out.println("Impossível diminuir volume");
		}
	}
	
	@Override
	public void ligarMudo() {
		if(this.getLigar() && this.volume>0) {
			this.setVolume(0);
			System.out.println("MUTED");
		}else {
			System.out.println("Impossivel com a TV desligada");
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigar() && this.volume==0) {
			this.setVolume(50);
			System.out.println("UNMUTED");
		}else {
			System.out.println("Impossivel com a TV desligada");
		}
		
	}

	@Override
	public void play() {
		if(this.getLigar() && !(this.getTocar())) {
			this.setTocar(true);
		}else {
			System.out.println("Não consegui reproduzir");
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigar() && this.getTocar()) {
			this.setTocar(false);
		}else {
			System.out.println("Não consegui pausar");
		}
		
	}

	
}
