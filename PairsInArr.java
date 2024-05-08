public class PairsInArr {
    public static void printPairs(int nums[]) {
        int totalpairs = 0;
        for(int i = 0; i<nums.length; i++) {
            int curr = nums[i];
            for(int j = i+1; j< nums.length; j++) {
                System.out.print( "(" +  curr + ", " + nums[j] + ") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println(totalpairs);
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12};
        printPairs(nums);
    }
}
