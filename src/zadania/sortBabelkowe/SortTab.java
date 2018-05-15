package zadania.sortBabelkowe;

public class SortTab {

	public static void main(String[] args) throws NullPointerException {
		int[] tabToSort={1,4,5,2,3,7,9};
		Sortable sort = new Sortable() {

			@Override
			public int[] sort(int[] tab) {
				boolean sorted = false;
				if (tab == null) {
					throw new NullPointerException();
				}
				else {
					while(!sorted){
						int counter =0;
						int tmp;
						for(int i=0;i<tab.length-1;i++){
							if (tab[i]>tab[i+1]){
								tmp=tab[i];
								tab[i]=tab[i+1];
								tab[i+1]=tmp;
								counter++;
															}
						}
						if( counter == 0){
							sorted = true;
						}
					}
					
				}
				return null;
			}
		};
		sort.sort(tabToSort);
		for (int i: tabToSort){
			System.out.println(i);
		}

	}

}
