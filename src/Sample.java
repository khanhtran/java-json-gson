import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


import com.google.gson.Gson;


public class Sample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		File packageFile  = new File("data.json");
		byte[] content = Files.readAllBytes(packageFile.toPath());		
		String gsonString = new String(content);
		
		Object[] arrayObj = gson.fromJson(gsonString, Object[].class);
		System.out.println(gsonString);
		
		
	}
}
