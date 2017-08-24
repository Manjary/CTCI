package ArraysAndStrings;

public class RotateMatrixBy90clock {
	static int[][] rotate(int matrix[][]){
		if (matrix.length == 0 || matrix.length != matrix[0].length) return null;
		int n = matrix. length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i-first;
				int top = matrix[first][i]; //II save top
				matrix[first][i] =matrix[last-offset] [first];
				//II bottom -> left
				matrix[last-offset] [first] =matrix[last][last - offset];
				//II right -> bottom
				matrix[last][last - offset] =matrix[i][last];
				//II top -> right
				matrix[i][last]= top; //II right <- saved top
			}
		}
		return matrix;
	}

	static int[][] transpose(int mat[][]) {
		int rows = mat.length;
		int col = mat[0].length;
		int temp = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = i; j < col; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		return mat;
	}

	public static int[][] swapRows(int[][] mat) {
		int cols = mat[0].length;
		int rows = mat.length;
		int temp;
		for (int i = 0; i < rows / 2; i++) {
			int swap_row = rows - i - 1;
			for (int j = 0; j < cols; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[swap_row][j];
				mat[swap_row][j] = temp;
			}

		}
		return mat;
	}

	public static void print_mat(int[][] mat) {
		int mat_size = mat.length;
		for (int i = 0; i < mat_size; i++) {
			for (int j = 0; j < mat_size; j++) {
				System.out.print(mat[i][j] + ",");
			}
			System.out.println();
		}
	}
    static int[][] intialize_mat(int mat_size){
    	int init_element = 0;
    	int mat[][] = new int[mat_size][mat_size];
		for (int i = 0; i < mat_size; i++) {
			for (int j = 0; j < mat_size; j++) {
				mat[i][j] = init_element;
				init_element++;
			}
		}
    	return mat; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat_size = 5;
		
		
		/**
		 * For 90 degree rotation clockwise do swap rows followed by transpose of matrix
		 */
		int mat[][]=intialize_mat(mat_size);
		print_mat(mat);
		int swap_row_mat[][] = swapRows(mat);
		System.out.println("**********swappedRows****************");
		print_mat(swap_row_mat);
		int t_mat[][] = transpose(swap_row_mat);
        System.out.println("*************Transpose**************");
		print_mat(t_mat);
        System.out.println("*******method from CTCI***************");
        int mat2[][]=intialize_mat(mat_size);
        print_mat(mat2);
        System.out.println("*******rotate method called***************");
        print_mat(rotate(mat2));
	}
 /**
  * 
  */
}
