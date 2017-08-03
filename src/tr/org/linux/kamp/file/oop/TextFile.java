package tr.org.linux.kamp.file.oop;

public abstract class TextFile extends File implements Openable{
	
	protected String enCoding;
    protected long numChars;
    
    public String getEnCoding() {
		return enCoding;
	}

	public void setEnCoding(String enCoding) {
		this.enCoding = enCoding;
	}

	public long getNumChars() {
		return numChars;
	}

	public void setNumChars(long numChars) {
		this.numChars = numChars;
	}

	

}
