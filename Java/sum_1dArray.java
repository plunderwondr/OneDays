class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] result = new int[nums.length];
        int currentCount = 0;
        for( int i= 0; i < nums.length; i++)
        {
            result[i] = currentCount + nums [i];
            currentCount+= nums [i];
        }
        return result;
    }
}