package Model;

public class Persona extends PersonaOrShadow{
	private int stStat;
	private int maStat;
	private int enStat;
	private int agStat;
	private int luStat;
	private boolean isCharacterSpecific; // Untuk menentukan apakah personanya merupakan persona khusus karakter
	
	public int getStStat() {
		return stStat;
	}
	
	public void setStStat(int stStat) {
		this.stStat = stStat;
	}
	
	public int getMaStat() {
		return maStat;
	}
	
	public void setMaStat(int maStat) {
		this.maStat = maStat;
	}
	
	public int getEnStat() {
		return enStat;
	}
	
	public void setEnStat(int enStat) {
		this.enStat = enStat;
	}
	
	public int getAgStat() {
		return agStat;
	}
	
	public void setAgStat(int agStat) {
		this.agStat = agStat;
	}
	
	public int getLuStat() {
		return luStat;
	}
	
	public void setLuStat(int luStat) {
		this.luStat = luStat;
	}
	
	public boolean isCharacterSpecific() {
		return isCharacterSpecific;
	}
	
	public void setCharacterSpecific(boolean isCharacterSpecific) {
		this.isCharacterSpecific = isCharacterSpecific;
	}

	public Persona(String type, String name, String race, int level, int psyRes, int shotRes, int agiRes, int bufuRes, int zioRes, int garuRes,
			int psiRes, int freiRes, int kougaRes, int mudoRes, int stStat, int maStat, int enStat, int agStat,
			int luStat, boolean isCharacterSpecific) {
		super(type, name, race, level, psyRes, shotRes, agiRes, bufuRes, zioRes, garuRes, psiRes, freiRes, kougaRes, mudoRes);
		this.stStat = stStat;
		this.maStat = maStat;
		this.enStat = enStat;
		this.agStat = agStat;
		this.luStat = luStat;
		this.isCharacterSpecific = isCharacterSpecific;
	}

	@Override
	public void seeDetail(int numberCount) {
		System.out.printf("+ %-2d | Persona | %-30s | %-16s | %-4d | %-4s | %-4s | %-4s | %-4s | %-4s "
				+ "| %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-2d | %-2d | %-2d | %-2d | %-2d | %-17s +\n"
				, numberCount++, getName(), getRace(), getLevel(), getPsyRes().trim(), getShotRes().trim(), getAgiRes().trim(), getBufuRes().trim(), getZioRes().trim(), getGaruRes().trim(), getPsiRes().trim(), getFreiRes().trim(), getKougaRes().trim(), getMudoRes().trim(), "-", "-", getStStat(), getMaStat(), getEnStat(), getAgStat(), getLuStat(), "None");
	}
}
