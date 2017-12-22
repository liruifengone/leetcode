class Solution {
    public int abs(int x){
        return x>0?x:(-x);
    }
    public int threeSumClosest(int[] nums, int target) {
        int num = abs(nums[0]+nums[1]+nums[2]-target);
        int returnOne = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<nums.length-2;i++){
            for(int j = i+1;j<nums.length-1;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(abs(nums[i]+nums[j]+nums[k]-target)<num){
                        num = abs(nums[i]+nums[j]+nums[k]-target);
                        returnOne = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return returnOne;
    }
}