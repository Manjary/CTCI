package ArraysAndStrings;

public class NullifyMatrix {
   static int[][] nullify_matrix(int [][] mat){
	   boolean[] row=new boolean[mat.length];
	   boolean[] column=new boolean[mat[0].length];
	   for (int i=0;i<row.length;i++){
		   for (int j=0;i<column.length;i++){
			   if(mat[i][j]==0){
				   row[i]=true;
				   column[j]=true;
			   }
		   }
	   }
	   for(int i=0;i<row.length;i++){
		   if(row[i]){
			   nullifyRow(mat,i);
		   }
	   }
	   for(int j=0;j<column.length;j++){
		   if(row[j]){
			   nullifycol(mat,j);
		   }
	   }
	   return mat;
   }
   static void nullifyRow(int [][]mat,int row){
	   for (int i=0;i<mat[0].length;i++){
		   mat[row][i]=0;
	   }
   }
   static void nullifycol(int [][]mat,int col){
	   for (int i=0;i<mat.length;i++){
		   mat[i][col]=0;
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
   public static void print_mat(int[][] mat) {
		int mat_size = mat.length;
		for (int i = 0; i < mat_size; i++) {
			for (int j = 0; j < mat_size; j++) {
				System.out.print(mat[i][j] + ",");
			}
			System.out.println();
		}
	}
   public static void main(String[] args){
	   int mat[][]=intialize_mat(5);
	   System.out.println("********before nullify ********");
	   print_mat(mat);
	   mat=nullify_matrix(mat);
	   System.out.println("********after nullify ********");
	   print_mat(mat);
   }
}
