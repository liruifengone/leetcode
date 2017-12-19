class Solution {
    public int min(int x,int y){
        return x<y?x:y;
    }
    public boolean find132pattern(int[] nums) {
        if(nums.length>=3)
        {
            int minNum = nums[0];
            for(int i = 1;i<nums.length-1;i++){
                minNum = min(nums[i-1],minNum);
                for(int j = i+1;j<nums.length;j++)
                {
                     if(minNum<nums[j] && nums[i]>nums[j])
                     return  true;
                 }
            }
        }
        return false;
    }
}