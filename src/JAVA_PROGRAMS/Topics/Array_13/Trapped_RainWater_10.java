package JAVA_PROGRAMS.Topics.Array_13;

public class Trapped_RainWater_10 {
    public static int trappedRainWater(int[] height){
        int n = height.length;
        int[] maxOfLeft = new int[n];
        maxOfLeft[0] = height[0];
        for (int i = 1; i<n; i++){
            maxOfLeft[i] = Math.max(height[i], maxOfLeft[i-1]);
        }

        int[] maxOfRight = new  int[n];
        maxOfRight[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--){
            maxOfRight[i] = Math.max(height[i], maxOfRight[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++){
            int waterLevel = Math.min(maxOfLeft[i], maxOfRight[i]);
            trappedWater += waterLevel - height[i];
        }
        return  trappedWater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
