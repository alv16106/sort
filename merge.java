import java.math.*;
import java.util.*;
public class merge {
	public static void main(String[] args){
		generador gen = new generador();
		gen.rad();
		int lista[]= gen.tomar();
		Integer lista2[]= new Integer[lista.length];
		int x=0;
		while (x<lista.length){
			lista2[x]=lista[x];
			System.out.println(lista[x]);
			System.out.println(lista2[x]);
			x++;
		}
		long start = System.currentTimeMillis();
		mergeSort(lista2);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(lista2));
		System.out.println(end-start + "ms");
	}
	
	
	public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = Math.round((left + right) / 2);
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd){
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];
        }

        while(left <= leftEnd){    // Copy rest of first half
            tmp[k++] = a[left++];
        }

        while(right <= rightEnd){  // Copy rest of right half
            tmp[k++] = a[right++];
        }

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

}
