class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outp = new int[2];

        int k=0;
        for(int i = 0; i<nums.length; i++){
            if(k==i){
                continue;
            }
            
            if(nums[k]+nums[i]==target){
                outp[0] = k;
                outp[1] = i;
                return outp;
            }
            
            if(i ==nums.length-1){
                i = 0;
                k++;
            }
            
        }
        return outp;

    }
}