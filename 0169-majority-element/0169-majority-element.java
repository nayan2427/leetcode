class Solution {
    public int majorityElement(int[] nums) {
    //    int count = 0;
    //    int temp = 0;
    //    for(int i : nums){
    //     if(count == 0){
    //         temp = i;
    //     }
    //     if(i == temp){
    //         count++;
    //     }
    //     else{
    //         count--;
    //     }
    //    }
    //    return temp;
    int c = 0;
    int can = 0;
    for(int num : nums) {
        if(c == 0) {
            can = num;
        }
        if(num == can) c++;
        else c--;
    }
    return can;
    }
    
}