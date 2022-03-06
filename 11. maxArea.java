class Solution {
    public int maxArea(int[] height) {
        int largest = 0;
        int left = 0;
        int right = height.length-1;
        for (int i = 0; i < height.length; i++){
            // System.out.println("i"+i);
            // System.out.println("j"+j);
            int current = Math.min(height[left], height[right])*(right-left);
            largest = Math.max(current, largest);
            if (height[left] > height[right]){
                right--;
            } else {
                left++;
            }
            System.out.println("area" + largest);
        }
        return largest;
    }
}