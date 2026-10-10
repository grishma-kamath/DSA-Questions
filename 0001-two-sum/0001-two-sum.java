class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer>map=new HashMap<>();
        int res=0;
        for(int i=0; i<nums.length; i++){
            
            res=target-nums[i];
            if(map.containsKey(res)){
                return new int[]{i, map.get(res)};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}