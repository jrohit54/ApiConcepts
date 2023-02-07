package ApiConcepts.ApiConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	
	 static Properties prop;

	    public void setup() throws IOException {

	        prop=new Properties();
	        FileInputStream fileInputStream=new FileInputStream("src/main/resources/config");
	        prop.load(fileInputStream);

}
}