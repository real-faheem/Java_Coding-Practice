//Matrix Multiplication// 
//matrix.length for printing entire matrix//
public class matrix{

public static void main(String args[]){
int [][]arr ={
    {1,2,3},{4,5,6},{7,8,9}
};
int[][]tr=new int[3][3];
for(int row=0;row<3;row++){
    for(int col=0;col<3;col++){
          tr[row][col]=arr [col][row];
        System.out.print(tr[row][col]+" ");

    }System.out.println();

}
}

}