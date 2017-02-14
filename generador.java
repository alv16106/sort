import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class generador {
	public static void main(String[] args){
		rad();
	}
		public static void rad(){
			Random random = new Random();
			try{
				int s;
				FileWriter fw = new FileWriter("Blanco.txt");
				BufferedWriter escritor= new BufferedWriter(fw);
				for(int i=0;i<3000;i++){
					s=random.nextInt(1000);
					escritor.write(s+"\n");
				}
				escritor.close();
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		public static int[] tomar(){
			int[] nuevo=new int[3000];
			try{
				FileReader fr = new FileReader("Blanco.txt");
				BufferedReader escritor= new BufferedReader(fr);
				int i =0;
				String linea;
				while (((linea=escritor.readLine())!=null)&& i<3000 ){
					nuevo[i]=Integer.parseInt(linea);
					i++;
				}
				escritor.close();
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			return nuevo;
		}
		
	
}
