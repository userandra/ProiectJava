package Curs10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesFileProcessor {
	
	//Write properties file
		public void writePropertiesFile() {
			
			try {
				OutputStream output = new FileOutputStream("test.properties");
				Properties propFile =  new Properties();
				propFile.setProperty("hostname", "amazon aws");
				propFile.setProperty("user", "testUserAA");
				propFile.setProperty("browser", "Edge");
				propFile.setProperty("email", "testUserAA@yahoo.com");
				propFile.store(output, "Am salvat fisierul!");
				output.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		//read properties file
		public void readPropertiesFile(String key) {
			
			try(InputStream input =  new FileInputStream("test.properties")){
					
				Properties propFile =  new Properties();
				propFile.load(input);
			
				System.out.println(propFile.getProperty(key));
						
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		//update properties file
		public void updatePropertiesFile(String key, String value) {
			Properties propFile =  new Properties();

			try(FileInputStream input =  new FileInputStream("test.properties")){	
				propFile.load(input);					
			} catch (IOException e) {
				e.printStackTrace();
			}	
					
			try(FileOutputStream output = new FileOutputStream("test.properties")) {

				propFile.setProperty(key, value);
				propFile.store(output, null);
				
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
		}

}
