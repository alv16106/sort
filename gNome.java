import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class gNome{
	public static void main(String[] args){
		generador gen = new generador();
		gen.rad();
		gnomeSort(gen.tomar());
	}

	static void gnomeSort(int[] elArray){
		
		
		
		for (int x = 1; x<elArray.length;){
			if(elArray[x-1]<= elArray[x]){
				++x;
			}else{
				int valorTemporal = elArray[x];
				elArray[x] = elArray[x-1];
				elArray[x-1]=valorTemporal;
				--x;
				if(x==0){
					x=1;
			}
			
		}
	}
		for(int z=0;z<elArray.length;z++){
			System.out.println(elArray[z]);
		}
	}

}