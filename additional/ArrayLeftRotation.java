/**
A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of n(the number of integers) and d(the number of left rotations you must perform). 
The second line contains n space-separated integers describing the respective elements of the array's initial state.

Constraints

Output Format

Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
**/
public class ArrayLeftRotation{
	public static int[] leftRotation(int[] arr, int n, int k){
		int[] tmp = new int[n];
		int index = k;
		for(int i = 0; i < n; i++){
			tmp[index%n] = arr[i];
			index++;
		}
		return tmp;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}