package finalspractice_3;

public class CassetteTape extends MediaItem {

	public enum CassetteSize {C30, C60, C90, C120};
	
	CassetteSize size;
	
	public CassetteTape(String album, String band, CassetteSize cLen) {
		super(album, band);
		size = cLen;
	}

	public CassetteSize getCassetteSize() {
		return size;
	}

	public void setCassetteSize(CassetteSize cassetteSize) {
		this.size = cassetteSize;
	}

	@Override
	public String toString() {
		return "Band: " + getNameOfBand() + ";  Album: " + getNameOfAlbum() + ";  CassetteSize: " + size + ";  Rating: " + getRating();
	}
}
