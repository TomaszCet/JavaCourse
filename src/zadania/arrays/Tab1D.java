package zadania.arrays;

public class Tab1D {

	public static void main(String[] args) {
		double tab1[] = {3,-6,6};
		double tab2[] = {12,-1,9};
		double sum1=0;
		double sum2=0;
		for (int i=0; i<tab1.length; i++){
			sum1+=tab1[i];
		}
		for (int i=0; i<tab2.length; i++){
			sum2+=tab2[i];
		}
		double sum=sum1+sum2;
		System.out.println(sum);
	}

}
