package finalspractice_2;

public class Mummy extends Artifact implements Cursed {

	private String nameOfPerson;
	private boolean isCursed;
	private boolean magicSealActivated;
	

//	public Mummy() {	
//		super("there");
//		nameOfPerson = "unknown";
//		isCursed = false;
//		magicSealActivated = false;
//	}

	public Mummy(String nameOfPerson, boolean isCursed, boolean magicProtection, String nameOfArtifact,
			String descrption, String fromYear) {

		super(nameOfArtifact);
		this.nameOfPerson = nameOfPerson;
		this.isCursed = isCursed;
		this.magicSealActivated = magicProtection;
// setNameOfArtifact(nameOfArtifact);
		setDescription(descrption);
		setWhatYear(fromYear);
		
	}

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public boolean isCursed() {
		return isCursed;
	}

	public void setCursed(boolean isCursed) {
		this.isCursed = isCursed;
	}

	public boolean isMagicSealActivated() {
		return magicSealActivated;
	}

	public void setMagicSealActivated(boolean magicSealActivated) {
		this.magicSealActivated = magicSealActivated;
	}

// -------------------
	
	@Override
	public void applyMagicSeal() {
		magicSealActivated = true;
	}

	@Override
	public boolean checkMagicSeal() {
		return magicSealActivated;
	}

	@Override
	public boolean getIsCursed() {
		return isCursed;
	}

	@Override
	public void setIsCursed(boolean x) {
		isCursed = x;
	}
}
