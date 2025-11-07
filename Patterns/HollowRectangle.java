public class HollowRectangle{
	public static void main(String args[]){
		int totRows = 5;
		int totcols = 5;
		for(int i = 1 ; i<= totRows ; i++){
			for(int j = 1 ; j <=totcols; j++){
				if(i==1|| i==totRows || j==1|| j==totcols){
					System.out.print("*");
				}

				else{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		
	}
}

// Output:-
// *****
// *   *
// *   *
// *   *
// *****