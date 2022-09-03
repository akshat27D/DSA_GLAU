public static int TrappedRainWater(int height[]){
        int n = height.length;
        int left[] = new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        int right[] = new int[height.length];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        int trappedwater =0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(left[i],right[i]);
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
    }
