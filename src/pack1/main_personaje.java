package pack1;

public class main_personaje {
	public static void main(String[] args) {
		Personaje pers1 = new Personaje(5, 100, 200);
		int cora = pers1.getCorazones();
		int ata = pers1.getAtaque();
		int def = pers1.getDefensa();
		System.out.println("Las estadisticas del personaje son: ");
		System.out.println("Coraznes: " + cora);
		System.out.println("Ataque: " + ata);
		System.out.println("defensa: " + def);
	}

}
