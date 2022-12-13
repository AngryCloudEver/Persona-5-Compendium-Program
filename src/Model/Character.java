package Model;

public class Character {
	String name;
	CharacterPersona assignedPersona;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character(String name) {
		super();
		this.name = name;
	}

	public CharacterPersona getAssignedPersona() {
		return assignedPersona;
	}

	public void setAssignedPersona(CharacterPersona assignedPersona) {
		this.assignedPersona = assignedPersona;
	}
}
