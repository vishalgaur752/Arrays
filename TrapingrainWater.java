public class TrapingrainWater {
    public static int trapRainWater(int height[]) { // tc = O(n)
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trapedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trapedWater += waterLevel - height[i];
        }
        return trapedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapRainWater(height));
    }
}
