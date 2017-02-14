

public class quickSorts {
	
	public static void main(String[] args){
		generador gen = new generador();
		
		long start = System.currentTimeMillis();
		
		QuickSort(gen.tomar(), 0, gen.tomar().length - 1);
	    long end = System.currentTimeMillis();
	    System.out.println(end-start+"ms");
	}
	
	
	public static void QuickSort(int[] arreglo, int left, int right){
		int x = partition(arreglo, left, right);
		
		if(left< x-1)
			QuickSort(arreglo, left, x-1);
		if(x < right)
			QuickSort(arreglo, x, right);
			
	}

	public static int partition(int[] arreglo, int left, int right){
		int x = arreglo[(left+right)/2];
		while(left<=right){
			while(arreglo[left]<x) left++;
			while(arreglo[right]>x)right--;
			
			if(left<=right){
				int y = arreglo[left];
				arreglo[left] = arreglo[right];
				arreglo[right] = y;
				
				left++;
				right--;
			}
	 	}
		return left;
	}


}
