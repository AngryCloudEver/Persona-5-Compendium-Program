import java.util.Scanner;

public class Util {
	static Scanner scan = new Scanner(System.in);
	
	// Membaut tampilan menu yang akan terus dipanggil
	public static void printMenu() {
		System.out.println("PERSONA 5 PERSONA/SHADOW LIST");
		enter();
		pembatas1();
		System.out.printf("+ %-25s +\n", "Menu List");
		pembatas1();
		System.out.printf("+ %-25s +\n", "1. Add New Persona/Shadow");
		System.out.printf("+ %-25s +\n", "2. View All Characters");
		System.out.printf("+ %-25s +\n", "3. View Persona/Shadow");
		System.out.printf("+ %-25s +\n", "4. Delete Persona/Shadow");
		System.out.printf("+ %-25s +\n", "5. Close Program");
		pembatas1();
	}
	
	// Pembatas jenis 1
	public static void pembatas1() {
		System.out.println("=============================");
	}
	
	// Pembatas dengan inputan sendiri
	public static void pembatasCustom(int jumlah) {
		for(int i = 0; i < jumlah; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	// Mempercepat proses koding untuk enter
	public static void enter() {
		System.out.println();
	}
	
	// Mempermudah proses scan integer
	public static int scanInt() {
		int hasilInput = scan.nextInt();
		scan.nextLine();
		return hasilInput;
	}
}
