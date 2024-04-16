package utils1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData1 {

	public static String path = ".\\testdata\\data.property1";
		Properties prop;
		
		public  ReadData1() throws IOException  {
			prop=new Properties();
			File file=new File(path);
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			}
		public String geturl() {
			return prop.getProperty("url");
		}
	
		public String getTitle() {
			return prop.getProperty("heading");
		}
		
		public String getdropdownoption() {
			return prop.getProperty("dropdownoptiontext");
		}
		
		public String geturl1() {
			return prop.getProperty("url1");
		}

		public String geturl2() {
			return prop.getProperty("url2");
		}
}
