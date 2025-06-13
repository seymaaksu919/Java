class Solution {
    public int removeDuplicates(int[] nums) {
        int k =0;
        for(int i=0; i <nums.length;i++){
            if(k < 2 || nums[i] != nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }




    public static void main (String[] args){
        Solution solution = new Solution();
        int [] nums = {1, 1, 1, 2, 2,3};
        int k = solution.removeDuplicates(nums);
        
        
        System.out.println(" k values" +k);

        for(int i =0; i<k;i++){
            System.out.println("New array:" +nums[i]);
        }
         
     } 
}
