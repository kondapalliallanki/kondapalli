package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	
	 public static String path = ".//testdata//data.property";
	Properties prop;
	
	public  ReadData() throws IOException  {
		prop=new Properties();
		File file=new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		}
	
	public String geturl() {
		return prop.getProperty("url");
	}
	
	public String getusername() {
		return prop.getProperty("username");
	}
	
	public String getpassword() {
		return prop.getProperty("password");
		}
	
	public String getfirstname() {
		return prop.getProperty("firstname");
		}
	
	public String getlastname() {
		return prop.getProperty("lastname");
	}
	
	public String getpostalcode() {
		return prop.getProperty("postalcode");
	}
	
	public String getexpected_mess() {
		return prop.getProperty("expected_mess");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

