public class AssigmentQuestions {
    public static boolean ques1(int nums[]) {
        for(int i=0; i<nums.length; i++) {
           for(int j = i+1; j<nums.length; j++) {
            if(nums[i] == nums[j]) {
                return true;
            }
           }
        }
        return false;
    }
    public static void main(String[] args) {
        // Question 1
        // int nums[] = { 1, 2, 3, 1 };
        // System.out.println(ques1(nums));

        //question 2
        
    }
}