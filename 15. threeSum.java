class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2;i++){
            //如果这么写会丧失【i，i，-2i】的情况
            //if (nums[i] == nums[i+1]) continue;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int end = nums.length-1;
            while (j < end){
                
                if (nums[end] + nums[i] + nums[j] == 0) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(nums[end]);
                    res.add(cur);
                    //去重
                    do {
                        j++;
                    }while (j < end && nums[j] == nums[j-1]);
                    do {
                        end--;
                    }while (j < end && nums[end] == nums[end+1]);
                    
                    //if (!res.contains(cur)) res.add(cur);
                    // while (nums[--end] + nums[i] + nums[++j] < 0) 
                    // j++;
                    // end--;
                }else if (nums[end] + nums[i] + nums[j] < 0){
                    j++;
                } else if (nums[end] + nums[i] + nums[j] > 0) end--;  
                
            }
        }
        return res;
    }
}