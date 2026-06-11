class SecondLargest {

    public static int getSecondLargest(int numbers[]) {
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                secondLargest = largest;
                largest = numbers[i];    
            } else if (secondLargest < numbers[i] && numbers[i] != largest) {
                secondLargest = numbers[i]; 
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        System.out.println("Second Largest number is: " + getSecondLargest(numbers));
    }
}