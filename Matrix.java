public class Matrix {
    int rows;
    int columns;
    int [][]matrix;
    
    //matrix's constructor
    public Matrix(int r, int c){
        rows = r;
        columns = c;

    }

    //creation of the matrix
    public void creation(){
        matrix= new int[rows][columns];
        for(int i=0; i<rows; i++){
            matrix[i] = new int[columns];
        }
    }

    //initialization of the matrix. This fonction will be called several times
    public void initialization (int i, int j, int a){
        matrix[i][j]=a;
    }
    
    //change the value of one item on th matrix
    public void setValue(int i, int j, int a){
        matrix[i][j]=a;
        System.out.println("Well updated");
    }
    
    //get type of matrix
    public void getType(){
        if(rows == columns){
            System.out.println("This is a square matrix, order"+rows);
            
        }
        else
            System.out.println("This is a matrix"+rows+"-"+columns+"."+rows+" rows and"+columns+" columns");
    }
    
    //get the trace of the matrice
    public int getTrace(){
        int t=0;
        if(rows == columns){
            for(int i=0; i<rows; i++)
                t+=matrix[i][i];
            return t;
        }else{
            this.getType();
            return t;
        }
    }

    //Display all matrix
    public void getMatrix(){
        System.out.println("\n");
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                System.out.println(" "+matrix[i][j]);
            }
        }
    }

}
