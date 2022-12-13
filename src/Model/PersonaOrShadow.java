package Model;

public abstract class PersonaOrShadow {
	private String type;
	private String name;
	private String race;
	private int level;
	private int psyRes;
	private int shotRes;
	private int agiRes;
	private int bufuRes;
	private int zioRes;
	private int garuRes;
	private int psiRes;
	private int freiRes;
	private int kougaRes;
	private int mudoRes;
	
	// SETTER GETTER VARIABLE
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getAgiRes() {
		String returnedValue = "-";
		
		switch(agiRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setAgiRes(int agiRes) {
		this.agiRes = agiRes;
	}
	
	public String getBufuRes() {
		String returnedValue = "-";
		
		switch(bufuRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setBufuRes(int bufuRes) {
		this.bufuRes = bufuRes;
	}
	
	public String getZioRes() {
		String returnedValue = "-";
		
		switch(zioRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setZioRes(int zioRes) {
		this.zioRes = zioRes;
	}
	
	public String getGaruRes() {
		String returnedValue = "-";
		
		switch(garuRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setGaruRes(int garuRes) {
		this.garuRes = garuRes;
	}
	
	public String getPsiRes() {
		String returnedValue = "-";
		
		switch(psiRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setPsiRes(int psiRes) {
		this.psiRes = psiRes;
	}
	
	public String getFreiRes() {
		String returnedValue = "-";
		
		switch(freiRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setFreiRes(int freiRes) {
		this.freiRes = freiRes;
	}
	
	public String getKougaRes() {
		String returnedValue = "-";
		
		switch(kougaRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setKougaRes(int kougaRes) {
		this.kougaRes = kougaRes;
	}
	
	public String getMudoRes() {
		String returnedValue = "-";
		
		switch(mudoRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}
	
	public void setMudoRes(int mudoRes) {
		this.mudoRes = mudoRes;
	}
	
	public abstract void seeDetail(int numberCount);
	
	// Constructor
	public PersonaOrShadow(String type, String name, String race, int level, int psyRes, int shotRes, int agiRes, int bufuRes, int zioRes,
			int garuRes, int psiRes, int freiRes, int kougaRes, int mudoRes) {
		this.type = type;
		this.name = name;
		this.race = race;
		this.level = level;
		this.psyRes = psyRes;
		this.shotRes = shotRes;
		this.agiRes = agiRes;
		this.bufuRes = bufuRes;
		this.zioRes = zioRes;
		this.garuRes = garuRes;
		this.psiRes = psiRes;
		this.freiRes = freiRes;
		this.kougaRes = kougaRes;
		this.mudoRes = mudoRes;
	}

	public String getPsyRes() {
		String returnedValue = "-";
		
		switch(psyRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}

	public void setPsyRes(int psyRes) {
		this.psyRes = psyRes;
	}

	public String getShotRes() {
		String returnedValue = "-";
		
		switch(shotRes) {
			case 0:{				
				returnedValue = "-";
				break;
			}
			case 1:{
				returnedValue = "Wk";
				break;
			}
			case 2:{
				returnedValue = "Rs";
				break;
			}
			case 3:{
				returnedValue = "Rp";
				break;
			}
			case 4:{
				returnedValue = "Ab";
				break;
			}
			case 5:{
				returnedValue = "Nu";
				break;
			}
		}
		
		return returnedValue;
	}

	public void setShotRes(int shotRes) {
		this.shotRes = shotRes;
	}
}
