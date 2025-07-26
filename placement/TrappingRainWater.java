package placement;
public class TrappingRainWater {
    public static int TrappedWater(int height[]){
        int n =height.length;
        //left max helper array that indicates leftmax of height for position
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //for right max helper array that indicates rightmax of height for position
        int rightMax[] =new int[height.length];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        //water level trapped
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water
            trappedWater+=waterLevel-height[i]; 
        }
        return trappedWater;
    }
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappedWater(height));

    }
    
}
