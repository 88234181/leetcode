/**
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

This challenge is also available in the following translations:

Chinese
Russian
Input Format

The first line contains a single string, a. 
The second line contains a single string, b.

Constraints
1<=|a|,|b|<=10^4
It is guaranteed that a and b consist of lowercase English alphabetic letters (i.e., a through z).
Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input

cde
abc
Sample Output

4
**/
public class Anagrams{
	public static int numberNeeded(String a, String b){
		int[] alphabet = new int[26];
		for(char c : a.toCharArray()){
			alphabet[c-'a']++;
		}
		for(char c : b.toCharArray()){
			alphabet[c-'a']--;
		}
        int total = 0;
		for(int i : alphabet){
            total+=Math.abs(i);
        }
        return total;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(first, second));
    }
}