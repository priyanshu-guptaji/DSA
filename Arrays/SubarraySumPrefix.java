public class SubarraySumPrefix {
    public static void Sum(int numbers[]){
        int prefix[] = new int[numbers.length];
       
        for(int i =0 ; i<numbers.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];
       }

       for(int i =0 ; i<numbers.length ; i++){
        int start = i;
            for(int j =i ; j<numbers.length ; j++){
                int end = j;
                
            }
       }
    }
    public static void main(String args[]){

    }
}
