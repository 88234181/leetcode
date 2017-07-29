/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

public class Solution{
	public int convertRomanNumeral(String str){
		int r = 0;
		
		String roman = "IVXLCDM";
		int[] nums = {1,5,10,50,100,500,1000};
		
		for(int i = 0; i < str.length - 1; i++){
			int index1 = nums[roman.indexOf(str.charAt(i))];
			int index2 = nums[roman.indexOf(str.charAt(i+1))];
			if(index1 >= index) r += index1;
			else r-= index2;
		}
		r += nums[roman.indexOf(str.charAt(str.length()-1))];
		return r;
	}
}