public class LargestNum {
    public static int largestNumber(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
            if(smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("largest value is : " + largestNumber(nums));
    }
}
