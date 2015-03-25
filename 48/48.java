import java.util.*;
import java.lang.Math;

public class solve {
	public static void main(String[] args){
		double result = 0;
		for(int i = 1; i<=1000; i++)
			result += (pow(i,i) % 10000000000);
		System.out.println(result);
	}
}