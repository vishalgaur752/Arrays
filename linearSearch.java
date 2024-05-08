public class linearSearch {
    public static int linearsearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSrch(String menu[] , String key) {
        for(int i = 0; i<menu.length; i++) {
            if(menu[i] == key ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int nums[] = { 2, 4, 6, 8, 10, 12, 12, 14, 16 };
        // int key = 10;
        // int index = linearsearch(nums, key);
        // if (index == -1) {
        //     System.out.println("index not found");
        // } else {
        //     System.out.println("key is at index : " + index);
        // }

        String menu[] = {"samose", "pani puri", "chole bhature", "raj kachori", "rabdi"};
        String key = "chole bhature";
        int index = linearSrch(menu, key);
        if(index == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index : " + index);
        }
    }
}
