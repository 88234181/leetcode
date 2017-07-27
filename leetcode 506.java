/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
*/

public class Solution{
	public String[] findRelativeRanks(int[] ranks){
		int[] ranksClone = ranks.clone();
		Arrays.sort(ranksClone);
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < ranks.length; i++){
			map.put(ranksClone[i], ranks.length-i);
		}
		String[] r = new String[ranks.length];
		for(int i = 0; i < ranks.length; i++){
			String str = "";
			if(map.get(ranks[i]) == 1) str = "Gold Medal";
			else if(map.get(ranks[i]) == 2) str = "Silver Medal";
			else if(map.get(ranks[i]) == 3) str = "Bronze Medal";
			else str = ranks[i] + "";
			r[i] = str;
		}
		
		return r;
	}
}