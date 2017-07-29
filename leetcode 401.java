/*
A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

Each LED represents a zero or one, with the least significant bit on the right.


For example, the above binary watch reads "3:25".

Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

Example:

Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
*/

public class Solution{
	
	int[] hours = {{"00"},
					{"01","02","04","08"},
					{"03","05","06","09","10"},
					{"07","11"}};
	int[] minutes = {{"00"},
					{"01","02","04","08","16","32"}, 
					{"03","05","06","09","10","12","17","18","20","24","33","34","36","40","48"},
					{"07","11","13","14","19","21","22","25","26","28","35","37","38","41","42","44","49","50","52","56"},
					{"15","23","27","29","30","39","43","45","46","51","53","54","57","58","60"},
					{"31","47","55","59"}};
		
		
	}
	
	public List<String> BinaryWatch(int n){
		List<String> list = new ArrayList<>();
		for(int i = 0; i <= 3 && i <= num; i++){
			if(num - i <= 5){
				for(String s : hours[i]){
					for(String t : minutes[num-i]){
						list.add(s+":"+t);
					}
				}
			}
		}
		return list;
	}
}