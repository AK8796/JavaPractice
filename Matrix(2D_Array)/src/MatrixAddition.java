
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][]= {{1,8,3},{4,5,6},{7,8,9}};
		int b [][]= {{9,5,9},{7,5,3},{4,5,6}};
		
		int c[][]= new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
