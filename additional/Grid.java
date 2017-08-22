public class Grid{
	
	public static int getBiggestRegion(int[][] matrix){
		int max = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 1){
					max = Math.max(max, countCells(matrix, i, j));
				}
			}
		}
		return max;
	}
	
	private int countCells(int[][] matrix, int x, int y){
		if(x < 0 || y < 0 || x > matrix.length-1 || y > matrix[0].length-1){
			return 0;
		}
		if(matrix[i][j] == 0){
			return 0;
		}
		int count = 0;
		count = matrix[i][j]--;
		count += countCells(matrix, i + 1, j);
		count += countCells(matrix, i + 1, j + 1);
		count += countCells(matrix, i + 1, j - 1);
		count += countCells(matrix, i - 1, j);
		count += countCells(matrix, i - 1, j + 1);
		count += countCells(matrix, i - 1, j - 1);
		count += countCells(matrix, i, j + 1);
		count += countCells(matrix, i, j - 1);
		return count;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getMax(grid));
    }
	
}