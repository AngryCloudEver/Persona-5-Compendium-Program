package Model;

public class Shadow extends PersonaOrShadow{
	private int hp;
	private int mp;
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}

	public Shadow(String type, String name, String race, int level, int psyRes, int shotRes, int agiRes, int bufuRes, int zioRes, int garuRes,
			int psiRes, int freiRes, int kougaRes, int mudoRes, int hp, int mp) {
		super(type, name, race, level, psyRes, shotRes, agiRes, bufuRes, zioRes, garuRes, psiRes, freiRes, kougaRes, mudoRes);
		this.hp = hp;
		this.mp = mp;
	}

	@Override
	public void seeDetail(int numberCount) {
		System.out.printf("+ %-2d | Shadow  | %-30s | %-16s | %-4d | %-4s | %-4s | %-4s | %-4s | %-4s "
				+ "| %-4s | %-4s | %-4s | %-4s | %-4s | %-4d | %-4d | %-2s | %-2s | %-2s | %-2s | %-2s | %-17s +\n"
				, numberCount++, getName(), getRace(), getLevel(), getPsyRes().trim(), getShotRes().trim(), getAgiRes().trim(), getBufuRes().trim(), getZioRes().trim(), getGaruRes().trim(), getPsiRes().trim(), getFreiRes().trim(), getKougaRes().trim(), getMudoRes().trim(), getHp(), getMp(), "-", "-", "-", "-", "-", "None");
	}
}
