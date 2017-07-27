/*
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).

Note:
The length of both lists will be in the range of [1, 1000].
The length of strings in both lists will be in the range of [1, 30].
The index is starting from 0 to the list length minus 1.
No duplicates in both lists.
*/

public class Solution{
	public String[] findCommonInterest(String[] interest1, String[] interest2){
		if(interest1.length() == 0 || interest2.length() == 0) return new String[]{};
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < interest1.length(); i++){
			map.put(interest1[i], i);
		}
		
		int sum = Integer.MAX_VALUE;
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < interest2.length(); i++){
			if(map.containsKey(interest2[i])){
				int sumIndex = map.get(interest2[i]) + i;
				if(sumIndex < sum){
					sum = sumIndex;
					list.clear();
				}
				list.add(interest2[i]);
			}
		}
		return list;
	}
}