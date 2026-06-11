class pro896 {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

       for(int i = 1; i < nums.length; i++){
        if(nums[i] < nums[i-1]){
            increasing = false;
        }
        if(nums[i] > nums[i-1]){
            decreasing = false;
        }
        
       }
       return increasing || decreasing;
    }
    public static void main(String[] args) {
        pro896 sol = new pro896();
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {1, 3, 2};
        int [] nums3 = {1, 1, 1};
        System.out.println(sol.isMonotonic(nums1)); 
        System.out.println(sol.isMonotonic(nums2)); 
        System.out.println(sol.isMonotonic(nums3));
    }
}