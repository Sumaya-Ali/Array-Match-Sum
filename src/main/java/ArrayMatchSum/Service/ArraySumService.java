package ArrayMatchSum.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Service;

import ArrayMatchSum.Model.ArraySum;

@Service
public class ArraySumService {

	public int[] ifPairExistWithGivenSumSorting(ArraySum arraySum){
		
		ArrayList<Integer> Originalarr = arraySum.getArr();
		ArrayList<Integer> Sortedarr = new ArrayList<Integer>(Originalarr);
		
		int sum = arraySum.getSum();
		
		if (Sortedarr.size() ==0) {
			return null;
		}
		
		Collections.sort(Sortedarr);
	int start =0;
	int end = Sortedarr.size() - 1;
	
	while(start <= end) {
		int s = Sortedarr.get(start) + Sortedarr.get(end);
		if(s == sum) {
		   int OriginalStart = Originalarr.indexOf(Sortedarr.get((start)));
		   int OriginalEnd = Originalarr.indexOf(Sortedarr.get((end)));
		   
			return new int[]{ OriginalStart,OriginalEnd };
		}else if(s > sum) {
			end--;
		}else {
			start++;
		}
	}
	return null;	
	}
}
