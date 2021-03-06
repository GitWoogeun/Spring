package ex05_autowired;

import java.io.FileWriter;

public class OutputerImpl implements Outputer{

	private String path;
	
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public void writeMessage(String msg) throws Exception {
		FileWriter f = new FileWriter(path);
		f.write(msg);
		f.close();
	}	
}
