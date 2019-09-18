package pack1;

public class Personaje {
	  private int corazones;
	  private int ataques ;
	  private int defensas;
	  
	  //gets an sets
	  public int getCorazones() {
	        return corazones;
	  }
	  public void setCorazones(int corazon) {
	        corazones = corazon;
	  }

	  public int getAtaque() {
		     return ataques;
		  }
	  public void setAtaque(int ataque) {
	        ataques = ataque;
	  }
	  
	  public int getDefensa() {
		     return defensas;
		  }
	  public void setDefensa(int defensa) {
	        defensas = defensa;
	  }
	  public Personaje(int corazon, int ataque, int defensa){
		  corazones =  corazon;
		  ataques = ataque;
		  defensas = defensa;
		  
	  }

	        
}
