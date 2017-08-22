/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int s = 1;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <= rowIndex; i++){
            list.add(s);
            s = s*(rowIndex - i)/(i+1);
        }
        
        return list;
    }
}