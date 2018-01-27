package arrays;

public class ArraysTasks {
    public static void main(String[] args) {

        int [] nums = new  int[] {5, 8, 1, 85, 17, 3, 29};
        System.out.println(getMax(nums));
        System.out.println(getMin(nums));
        System.out.println(getSum(nums));
        //bubbleSort(nums);
        System.out.println(getIndexOfMin(nums));
        System.out.println(getIndexOfMax(nums));
        bubbleSort(false,nums);



    }

    private static int getMax(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    private static int getMin(int[] nums){
        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    private static int getSum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static void printArray (int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    private static void bubbleSort(boolean b, int[] nums){
        if (b == true) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j + 1] < nums[j]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j + 1] > nums[j]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }
        printArray(nums);
    }




    public static int getIndexOfMin (int [] nums) {
        int minIndex = 0;
        int min = nums[minIndex];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getIndexOfMax (int [] nums) {
        int maxIndex = 0;
        int max = nums[maxIndex];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }


}
