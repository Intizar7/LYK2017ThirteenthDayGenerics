package tr.org.linux.kamp.file.oop;

public class ExecutableFile extends BineryFile implements Openable{

	
	protected String[] platform;
	protected byte[] contents;
	
	
	public ExecutableFile(String[] platform) {
		this.platform = platform;
	}
		
	@Override
	public void getCopy() {
		// TODO Auto-generated method stub
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void onClick() {
		// TODO Auto-generated method stub
		
	}

}
