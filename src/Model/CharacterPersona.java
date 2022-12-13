package Model;

import Interface.IsCharacterSpecified;

public class CharacterPersona extends Persona implements IsCharacterSpecified{
	private String characterName;
	private String awakenedPersonaName;

	public CharacterPersona(String type, String name, String race, int level, int psyRes, int shotRes, int agiRes, int bufuRes, int zioRes,
			int garuRes, int psiRes, int freiRes, int kougaRes, int mudoRes, int stStat, int maStat, int enStat,
			int agStat, int luStat, boolean isCharacterSpecific, String characterName, String awakenedPersonaName) {
		super(type, name, race, level, psyRes, shotRes, agiRes, bufuRes, zioRes, garuRes, psiRes, freiRes, kougaRes, mudoRes, stStat,
				maStat, enStat, agStat, luStat, isCharacterSpecific);
		this.characterName = characterName;
		this.awakenedPersonaName = awakenedPersonaName;
	}

	@Override
	public String getCharacterName() {
		return characterName;
	}

	@Override
	public String getAwakenedPersonaName() {
		return awakenedPersonaName;
	}
	
	@Override
	public void seeDetail(int numberCount) {
		System.out.printf("+ %-2d | Persona | %-30s | %-16s | %-4d | %-4s | %-4s | %-4s | %-4s | %-4s "
				+ "| %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-2d | %-2d | %-2d | %-2d | %-2d | %-17s +\n"
				, numberCount++, getName(), getRace(), getLevel(), getPsyRes().trim(), getShotRes().trim(), getAgiRes().trim(), getBufuRes().trim(), getZioRes().trim(), getGaruRes().trim(), getPsiRes().trim(), getFreiRes().trim(), getKougaRes().trim(), getMudoRes().trim(), "-", "-", getStStat(), getMaStat(), getEnStat(), getAgStat(), getLuStat(), getCharacterName());
	}
}
