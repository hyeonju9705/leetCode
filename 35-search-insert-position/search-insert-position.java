class Solution {
    public int searchInsert(int[] nums, int target) {
        //8:28 시작
        int answer = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > target){
                answer = i;
                break;
            }else if(nums[i] == target){
                answer = i;
                break;
            }
        }

        return answer == -1 ? nums.length : answer;
    }
}