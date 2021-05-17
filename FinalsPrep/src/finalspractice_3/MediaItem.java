package finalspractice_3;

public abstract class MediaItem {

	private String nameOfAlbum;
	private String nameOfBand;
	private int rating;
	
	public MediaItem(String band, String album) {
		nameOfAlbum = album;
		nameOfBand = band;
		rating = 0;
	}
	
	public String getNameOfAlbum() {
		return nameOfAlbum;
	}

	public void setNameOfAlbum(String nameOfAlbum) {
		this.nameOfAlbum = nameOfAlbum;
	}

	public String getNameOfBand() {
		return nameOfBand;
	}

	public void setNameOfBand(String nameOfBand) {
		this.nameOfBand = nameOfBand;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public abstract String toString();
	
}
