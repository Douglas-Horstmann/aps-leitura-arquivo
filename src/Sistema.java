import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Contato> contatos = new Vector<Contato>();
		
		try {
			
			// path file "C:\\Users\\HP avilion\\Documents\\_Codigos\\Java\\Faculdade\\workspace\\LeituraArquivoTexto\\src\\csv\\contatos.csv"
			String pathAbsolute = new File("").getAbsolutePath();
						
			Vector<String> linhas = Arquivo.Ler(pathAbsolute + "\\src\\csv\\contatos.csv");
									
			for(String l : linhas){
				String[] conteudo = l.split(",");
				contatos.add(new Contato(conteudo[0], conteudo[1]));
			}
			
			for(Contato c : contatos){
				System.out.println("Nome: " + c.getNome() + " E-mail: " + c.getEmail());
			}	
												
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}
