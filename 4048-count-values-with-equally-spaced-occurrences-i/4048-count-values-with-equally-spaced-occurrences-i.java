class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int count = 0;
        for(ArrayList<Integer> indices : map.values()){
            if(indices.size() == 3){
                int i1 = indices.get(0);
                int i2 = indices.get(1);
                int i3 = indices.get(2);
                if(i2 - i1 == i3 - i2){
                    count++;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna