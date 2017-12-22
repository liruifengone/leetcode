int threeSumClosest(int* nums, int numsSize, int target) {
        int num = abs(nums[0]+nums[1]+nums[2]-target);
        int returnOne = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<numsSize-2;i++){
            for(int j = i+1;j<numsSize-1;j++){
                for(int k = j+1;k<numsSize;k++){
                    if(abs(nums[i]+nums[j]+nums[k]-target)<num){
                        num = abs(nums[i]+nums[j]+nums[k]-target);
                        returnOne = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return returnOne;
}
int abs(int x)
{
    return x>0?x:(-x);
}