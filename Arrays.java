public class Arrays {
    public static boolean ReapetedArr(int n[]) {
        for (int i = 1; i < n.length-1; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 5, 5};
        System.out.println(ReapetedArr(n));
    }
}
