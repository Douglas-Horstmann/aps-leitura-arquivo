import java.io.IOException;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {

	private static BufferedReader inputStream = null;
	private static Vector<String> linhas = new Vector<String>();
	
	public static Vector<String> Ler(String path) throws IOException{
		
		try
		{
			inputStream = new BufferedReader(new FileReader(path));
			String l;
			
			while((l = inputStream.readLine()) != null){
				linhas.add(l);
				//System.out.println(l);
			}			
			return linhas;						
		}
		finally
		{
			if(inputStream != null){
				inputStream.close();
			}			
		}		
	}
	
}
