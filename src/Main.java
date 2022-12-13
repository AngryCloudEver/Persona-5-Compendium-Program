import java.util.ArrayList;
import java.util.Scanner;

import Model.Race;
import Model.Shadow;
import Model.Character;
import Model.CharacterPersona;
import Model.Persona;
import Model.PersonaOrShadow;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0; // Untuk penampung pilihan menu user
		
		// Variable-Variable untuk menampung inputan insert user sementara
		String type, name, race, owner, awakening;
		int level, hp, mp, st, ma, en, ag, lu, phys, shot, agi, bufu, zio, garu, psi, frei, kouga, mudo, isCharaSpecified, remove;
		
		// Membuat object dari macam-macam race
		ArrayList<Race> races = new ArrayList<Race>();
		races.add(new Race("Fool"));races.add(new Race("Magician"));races.add(new Race("Priestess"));
		races.add(new Race("Empress"));races.add(new Race("Emperor"));races.add(new Race("Hierophant"));
		races.add(new Race("Lovers"));races.add(new Race("Chariot"));races.add(new Race("Justice"));
		races.add(new Race("Hermit"));races.add(new Race("Fotune"));races.add(new Race("Strength"));
		races.add(new Race("Hanged"));races.add(new Race("Death"));races.add(new Race("Temperance"));
		races.add(new Race("Devil"));races.add(new Race("Tower"));races.add(new Race("Star"));
		races.add(new Race("Sun"));races.add(new Race("Moon"));races.add(new Race("Judgement"));
		
		// Membuat object dari karakter utama Persona 5 (selain Joker)
		ArrayList<Character> characters = new ArrayList<Character>();
		characters.add(new Character("Morgana"));characters.add(new Character("Ryuji Sakamoto"));
		characters.add(new Character("Ann Takamaki"));characters.add(new Character("Yusuke Kitagawa"));
		characters.add(new Character("Makoto Nijima"));characters.add(new Character("Futaba Sakura"));
		characters.add(new Character("Haru Okumura"));characters.add(new Character("Goro Akechi"));
		
		// Membaut array persona/shadow list
		ArrayList<PersonaOrShadow> personaShadows = new ArrayList<PersonaOrShadow>();
		
		// Looping selama belum close program
		do {
			Util.printMenu(); // Print Menu
			
			// Looping untuk validasi inputan menu user
			do {				
				System.out.print("Pilih Menu > ");
				menu = Util.scanInt(); // Scan inputan menu user
			} while (menu < 1 || menu > 5);
			
			Util.enter();
			
			// Switch case untuk pilihan user
			switch(menu) {
				case 1:{
					// Looping untuk validasi tipe
					do {
						System.out.print("What do you want to add [Persona|Shadow] ? ");
						type = scan.nextLine();
					} while (!type.equals("Persona") && !type.equals("Shadow"));
					
					// Looping untuk validasi nama
					do {
						System.out.print("Enter persona/shadow name: ");
						name = scan.nextLine();
					} while (name.isEmpty());
					
					// Looping untuk validasi race
					boolean containRace = false;
					
					do {
						System.out.printf("Enter persona/shadow race [Fool, Magician, Priestess, Empress, Emperor, Hierophant, Lovers,\n Chariot, Justice, Hermit, Fotune, Strength, Hanged, Death,\n Temperance, Devil, Tower, Star, Moon, Sun, Judgement]: ");
						race = scan.nextLine();
						
						
						// Cek apakah racenya valid dari list race
						for (Race eachRace : races) {
							if(eachRace.getName().equals(race)) {
								containRace = true;
							}
						}
					} while(!containRace);
					
					// Looping untuk validasi level
					do {
						System.out.print("Enter persona/shadow base level [1-99]: ");
						level = Util.scanInt();
					} while (level < 1 || level > 99);
					
					// Looping validasi element resistance physical
					do {
						System.out.print("Enter persona/shadow resistance againts physical [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						phys = Util.scanInt();
					} while (phys < 0 || phys > 5);
					
					// Looping validasi element resistance shooting
					do {
						System.out.print("Enter persona/shadow resistance againts shooting [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						shot = Util.scanInt();
					} while (shot < 0 || shot > 5);
					
					// Looping validasi element resistance fire
					do {
						System.out.print("Enter persona/shadow resistance againts fire [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						agi = Util.scanInt();
					} while (agi < 0 || agi > 5);
					
					// Looping validasi element resistance ice
					do {
						System.out.print("Enter persona/shadow resistance againts ice [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						bufu = Util.scanInt();
					} while (bufu < 0 || bufu > 5);
					
					// Looping validasi element resistance electric
					do {
						System.out.print("Enter persona/shadow resistance againts electric [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						zio = Util.scanInt();
					} while (zio < 0 || zio > 5);
					
					// Looping validasi element resistance wind
					do {
						System.out.print("Enter persona/shadow resistance againts wind [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						garu = Util.scanInt();
					} while (garu < 0 || garu > 5);
					
					// Looping validasi element resistance psychokinesis
					do {
						System.out.print("Enter persona/shadow resistance againts psychokinesis [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						psi = Util.scanInt();
					} while (psi < 0 || psi > 5);

					// Looping validasi element resistance nuclear
					do {
						System.out.print("Enter persona/shadow resistance againts nuclear [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						frei = Util.scanInt();
					} while (frei < 0 || frei > 5);
					
					// Looping validasi element resistance light
					do {
						System.out.print("Enter persona/shadow resistance againts light [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						kouga = Util.scanInt();
					} while (kouga < 0 || kouga > 5);
					
					// Looping validasi element resistance dark
					do {
						System.out.print("Enter persona/shadow resistance againts dark [0 = none|1 = weak|2=resists|3=repel|4=absorb|5=nullify]: ");
						mudo = Util.scanInt();
					} while (mudo < 0 || mudo > 5);
					
					if(type.equals("Persona")) {
						// Looping validasi strength
						do {
							System.out.print("Enter persona base strength [1-99]: ");
							st = Util.scanInt();
						} while (st < 1 || st > 99);
						
						// Looping validasi magic
						do {
							System.out.print("Enter persona base magic [1-99]: ");
							ma = Util.scanInt();
						} while (ma < 1 || ma > 99);
						
						// Looping validasi energy
						do {
							System.out.print("Enter persona base energy [1-99]: ");
							en = Util.scanInt();
						} while (en < 1 || en > 99);
						
						// Looping validasi agility
						do {
							System.out.print("Enter persona base agility [1-99]: ");
							ag = Util.scanInt();
						} while (ag < 1 || ag > 99);
						
						// Looping validasi luck
						do {
							System.out.print("Enter persona base luck [1-99]: ");
							lu = Util.scanInt();
						} while (lu < 1 || lu > 99);
						
						// Looping validasi apakah personanya character specified
						do {
							System.out.print("Is the persona character specified [0: NO |1: YES]? ");
							isCharaSpecified = Util.scanInt();
						} while (isCharaSpecified < 0 || isCharaSpecified > 1);
						
						if(isCharaSpecified == 1) {		
							// Validasi nama character pemilik persona
							boolean containChara = false;
							Character tempChara;
							do {
								System.out.print("Enter persona owner [Morgana|Ryuji Sakamoto|Ann Takamaki|Yusuke Kitagawa|Makoto Nijima|Futaba Sakura|Haru Okumura|Goro Akechi]: ");
								owner = scan.nextLine();
								
								// Cek apakah characternya valid dari list character dan characternya belum ada persona terasign
								for (Character eachChara : characters) {
									if(eachChara.getName().equals(owner) && eachChara.getAssignedPersona() == null) {
										containChara = true;
									}
									else if(eachChara.getName().equals(owner) && eachChara.getAssignedPersona() != null) {
										System.out.printf("%s already has persona assigned!\n", owner);
										break;
									}
								}
							} while (!containChara);
							
							// Validasi nama persona setelah awakening
							do {
								System.out.print("Enter persona awakening name: ");
								awakening = scan.nextLine().trim();
							} while (awakening.isEmpty());
							
							// Buat Persona Character Specified Baru
							personaShadows.add(new CharacterPersona(type, name, race, level, phys, shot, agi, bufu, zio, garu, psi, frei, kouga, mudo, st, ma, en, agi, lu, true, owner, awakening));
							
							// Update Persona Character
							for (Character eachChara : characters) {
								if(eachChara.getName().equals(owner)) {
									eachChara.setAssignedPersona(new CharacterPersona(type, name, race, level, phys, shot, agi, bufu, zio, garu, psi, frei, kouga, mudo, st, ma, en, agi, lu, true, owner, awakening));
								}
							}
						}
						else {
							// Buat Persona Non Character Specified Baru
							personaShadows.add(new Persona(type, name, race, level, phys, shot, agi, bufu, zio, garu, psi, frei, kouga, mudo, st, ma, en, agi, lu, false));
						}
					}
					else {
						// Looping validasi HP
						do {
							System.out.print("Enter shadow HP [1-5000]: ");
							hp = Util.scanInt();
						} while (hp < 1 || hp > 5000);
						
						// Looping validasi MP
						do {
							System.out.print("Enter shadow MP [1-1000]: ");
							mp = Util.scanInt();
						} while (mp < 1 || mp > 1000);
						
						// Buat Shadow Baru
						personaShadows.add(new Shadow(type, name, race, level, phys, shot, agi, bufu, zio, garu, psi, frei, kouga, mudo, hp, mp));
					}
					
					System.out.println("Persona/Shadow Successfully Created!");
					Util.enter();
					break;
				}
				case 2:{
					// Tampilkan List Character Serta personanya
					Util.pembatasCustom(74);
					System.out.println("+ No | Character Name      | Persona Name        | Awakened Persona Name +");
					Util.pembatasCustom(74);
					
					int numberCount = 1;
					for (Character chara : characters) {
						if(chara.getAssignedPersona() != null) {							
							System.out.printf("+ %-2d | %-19s | %-19s | %-21s +\n", numberCount++, chara.getName(), chara.getAssignedPersona().getName(), chara.getAssignedPersona().getAwakenedPersonaName());
						}
						else {
							System.out.printf("+ %-2d | %-19s | %-19s | %-21s +\n", numberCount++, chara.getName(), "No Persona Assigned", "No Persona Assigned");
						}
					}
					
					Util.pembatasCustom(74);
					Util.enter();
					
					break;
				}
				case 3:{
					// Tampilkan List Persona dan Shadow
					int numberCount = 1;
					
					Util.pembatasCustom(204);
					System.out.println("+    |         |                                |                  |      |                             RESISTANCES                             |               STATS                  |                   +");
					System.out.println("+ No | Type    | Persona Name                   | Race             | Base |_____________________________________________________________________|______________________________________| Owner             +");
					System.out.println("+    |         |                                |                  | Lvl  | Phys | Shot | Fire | Ice  | Elec | Wind | Psic | Nucl | Lght | Dark | HP   | MP   | St | Ma | En | Ag | Lu |                   +");
					Util.pembatasCustom(204);
					
					// Check Class Persona yang Dipakai Lalu Print
					for (PersonaOrShadow personaOrShadow : personaShadows) {
						if(personaOrShadow instanceof CharacterPersona) {
							((CharacterPersona)personaOrShadow).seeDetail(numberCount);
						}
						else if(personaOrShadow instanceof Persona) {
							((Persona)personaOrShadow).seeDetail(numberCount);
						}
						else {
							((Shadow)personaOrShadow).seeDetail(numberCount);
						}
						numberCount++;
					}
					Util.pembatasCustom(204);
					Util.enter();
					break;
				}
				case 4:{
					// Tampilkan List Persona dan Shadow
					int numberCount = 1;
					
					Util.pembatasCustom(204);
					System.out.println("+    |         |                                |                  |      |                             RESISTANCES                             |               STATS                  |                   +");
					System.out.println("+ No | Type    | Persona Name                   | Race             | Base |_____________________________________________________________________|______________________________________| Owner             +");
					System.out.println("+    |         |                                |                  | Lvl  | Phys | Shot | Fire | Ice  | Elec | Wind | Psic | Nucl | Lght | Dark | HP   | MP   | St | Ma | En | Ag | Lu |                   +");
					Util.pembatasCustom(204);
					
					// Check Class Persona yang Dipakai Lalu Print
					for (PersonaOrShadow personaOrShadow : personaShadows) {
						if(personaOrShadow instanceof CharacterPersona) {
							((CharacterPersona)personaOrShadow).seeDetail(numberCount);
						}
						else if(personaOrShadow instanceof Persona) {
							((Persona)personaOrShadow).seeDetail(numberCount);
						}
						else {
							((Shadow)personaOrShadow).seeDetail(numberCount);
						}
						numberCount++;
					}
					Util.pembatasCustom(204);
					Util.enter();
					
					// Validasi nomor persona/shadow yang mau dihapus
					do {						
						System.out.printf("Select persona/shadow to remove [1-%d]: ", personaShadows.size());
						remove = Util.scanInt();
					} while (remove < 1 || remove > personaShadows.size());
					
					// Check apakah yang dihapus merupakan character specific
					if(personaShadows.get(remove-1) instanceof CharacterPersona) {
						for (Character eachChara : characters) {
							if(eachChara.getName().equals(((CharacterPersona)personaShadows.get(remove-1)).getCharacterName())) {
								eachChara.setAssignedPersona(null);
							}
						}
					}
					
					personaShadows.remove(remove-1);
					System.out.println("Persona/Shadow deleted successfully!");
					Util.enter();
					break;
				}
			}
			
		} while (menu != 5);
	}

}
