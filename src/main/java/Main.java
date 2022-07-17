

public class Main {
    private static int steps;

    public static void main(String[] args){
        // binary search = Search algorithm that finds the position
        //       of a target value within a sorted array.
        //       Half of the array is eliminated during each "step"

        //      complexity: O (log n)

        int array[] = new int[1000000];
        int target = 42254;

        for(int i=0; i<array.length; i++){
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index + " in " + steps + " steps.");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;


        while(low <= high){
            steps++;
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println(value);

            if (value < target) {
                low = middle + 1;
            }
            else if (value > target) {
                high = middle -1;
            }
            else return middle; //target found
        }
        return -1; // target not found
    }


}
