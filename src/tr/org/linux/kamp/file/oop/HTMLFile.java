package tr.org.linux.kamp.file.oop;

import java.util.List;

public class HTMLFile extends TextFile {
	
	protected ExecutableFile browserCompatibleWith;
	protected List<HTMLFile> linksTo;
	protected String htmlVersion;
	

	public ExecutableFile getBrowserCompatibleWith() {
		return browserCompatibleWith;
	}

	public void setBrowserCompatibleWith(ExecutableFile browserCompatibleWith) {
		this.browserCompatibleWith = browserCompatibleWith;
	}

	public List<HTMLFile> getLinksTo() {
		return linksTo;
	}

	public void setLinksTo(List<HTMLFile> linksTo) {
		this.linksTo = linksTo;
	}

	public String getHtmlVersion() {
		return htmlVersion;
	}

	public void setHtmlVersion(String htmlVersion) {
		this.htmlVersion = htmlVersion;
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
