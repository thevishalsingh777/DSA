class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>>map = new  HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){ 
            map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int count = 0;
        for(ArrayList<Integer> indices : map.values()){
            if(indices.size()<3){
                continue;
            }
            int gap = indices.get(1) - indices.get(0);
            boolean special = true;
            for(int i = 2; i < indices.size(); i++){
                if(indices.get(i) - indices.get(i - 1) != gap){
                    special = false;
                    break;
                }
            }
            if(special){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna