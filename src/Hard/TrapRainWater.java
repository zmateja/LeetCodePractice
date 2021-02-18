package Hard;
//Problem #42 on Leetcode

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TrapRainWater {
    public static void main(String[] args) {
        TrapRainWater test = new TrapRainWater();
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int output = test.trap(heights);
        System.out.println(output);
    }
    public int trap(int[] height){
       int trappedwater = 0;
       int size = height.length;
       if (size==0)
           return 0;
       int[] lMax = new int[size];
       int[] rMax = new int[size];
       lMax[0] = height[0];
       rMax[size-1] = height[size-1];
       for(int i = 1; i < size; i++){
           lMax[i] = Math.max(height[i],lMax[i-1]);
       }
       for(int i = size - 2; i >=0; i--){
           rMax[i] = Math.max(height[i],rMax[i+1]);
       }
       for(int i = 0; i < size; i ++){
           trappedwater += Math.min(rMax[i], lMax[i]) - height[i];
       }
       return trappedwater;
    }
}
