class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int distance = Integer.MAX_VALUE;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2;i++){
            if (distance == 0) break;
            int j = i + 1;
            int end = nums.length-1;
            while (j < end){
                if (nums[i] + nums[j] + nums[end] < target){
                    if (Math.abs(nums[i] + nums[j] + nums[end]-target) < distance ){
                        res = nums[i] + nums[j] + nums[end];
                        distance = Math.abs(target-res);
                    }
                    j++;
                } else if (nums[i] + nums[j] + nums[end] > target){
                    if (Math.abs(nums[i] + nums[j] + nums[end]-target) < distance ){
                        res = nums[i] + nums[j] + nums[end];
                        distance = Math.abs(target-res);
                    }
                    end--;
                } else if (nums[i] + nums[j] + nums[end] == target){
                    res = nums[i] + nums[j] + nums[end];
                    distance = 0;
                    break;
                }
                
            }
        }
        return res;
    }
}