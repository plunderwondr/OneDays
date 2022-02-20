class Solution {
    public int[] twoSum(int[] nums, int target) {
        //only 1 solution, only use elements once
        
        //outer loop iterate for entire inner loop 
        //  n! complexity?
        
        
        int result[]={0,0};
        for (int i=0;i<(nums.length-1);i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if (target == (nums[i] + nums[j]))
                    {
                       result[0]=i;
                       result[1]=j;
                    }
            } //for j
        } //for i
        
        return result;
    }
}

//Notes:
//return new int[]{i,j}; shorter line alternative. Didnt work during runtime for some reason but should be syntactically correct