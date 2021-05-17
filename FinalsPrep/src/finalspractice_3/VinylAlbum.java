package finalspractice_3;

public class VinylAlbum extends MediaItem {

	public enum RPM {THIRTY_THREE, FOURTY_FIVE, SEVENTY_EIGHT};
	
	RPM speed;
	
	public VinylAlbum(String band, String album, RPM rpm) {
		super(band, album);
		speed = rpm;
	}

	public RPM getSpeed() {
		return speed;
	}

	public void setSpeed(RPM speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Band: " + getNameOfBand() + ";  Album: " + getNameOfAlbum() + ";  Speed: " + speed + ";  Rating: " + getRating();
	}


}
