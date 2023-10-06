
package main;


import java.util.ArrayList;
import matrix.Matrix;
import matrix.Interphase.MatrixTraverseDo;


//this is a test of the Matrix Class

public class Main{
    
    public static void main(String[] args) {
        Matrix<Integer> mtrx = new Matrix<>(4,10);
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(4);
              
        arrayList.add( new ArrayList<>(10));
        arrayList.add( new ArrayList<>(10));
        arrayList.add( new ArrayList<>(10));
        arrayList.add( new ArrayList<>(10));
        
     
        for(int i=0;i<arrayList.size();i++){
            
            for(int j=0;j<10;j++){
                arrayList.get(i).add(j*i);
            }
    
        }
        
        for(int i=0;i<mtrx.amountOfRows();i++){
            
            for(int j=0;j<mtrx.amountOfColumns();j++){
                mtrx.insert(arrayList.get(i).get(j), i, j);
            }
            
        }
        

        MatrixTraverseDo<Integer,Integer> printableMatrixInterphase = (c,i,j,k)->{
            System.out.printf(" %d ",c);
            if(j == mtrx.amountOfColumns()-1){
                System.out.println();  
            }
        };
        
         //this is an example of traverse method (there is not need a context variable here)
         Matrix.traverse(mtrx, printableMatrixInterphase, null);

    }
};//end of class;s
