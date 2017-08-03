package tr.org.linux.kamp.file.oop;

public class DataFile extends BineryFile{

	protected String compressionFormat;
	protected ExecutableFile opensWith;
	protected boolean[] bits;
	
	public String getCompressionFormat() {
		return compressionFormat;
	}
	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}
	public ExecutableFile getOpensWith() {
		return opensWith;
	}
	public void setOpensWith(ExecutableFile opensWith) {
		this.opensWith = opensWith;
	}
	public boolean[] getBits() {
		return bits;
	}
	public void setBits(boolean[] bits) {
		this.bits = bits;
	}
	
	public void getCopy() {
		
	}
	@Override
	void onClick() {
		// TODO Auto-generated method stub
		
	}

}
