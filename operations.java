//import Matrix;

public class operations {
    int [][]tmp;
    public int [][] sum(Matrix m1, Matrix m2) {
        if((m1.rows == m2.rows)&&(m1.columns == m2.columns)){
            
            tmp = new int[m1.rows][m1.columns];
            for(int i=0; i<m2.rows; i++){
                for(int j=0; j<m1.columns; j++){
                    tmp[i]= new int[m1.columns];
                }
            }

            for(int i=0; i<m1.rows; i++){
                for(int j=0; j<m1.columns; j++)
                    tmp[i][j]= m1.matrix[i][j] + m2.matrix[i][j];
            }
            return tmp;
        }else
            return null;
    }    

    public int [][] product(Matrix m1, Matrix m2){
        if(m1.columns == m2.rows){
            
            tmp = new int[m1.rows][m1.columns];
            for(int i=0; i<m2.rows; i++){
                for(int j=0; j<m1.columns; j++){
                    tmp[i]= new int[m1.columns];
                }
            }

            for(int i=0; i<m1.rows; i++){
                for(int j=0; j<m2.columns; j++){
                    tmp[i][j]=0;
                    for (int t=0; t<m1.columns; t++)
                        tmp[i][j] += (m1.matrix[i][t] * m2.matrix[t][j]);
                }
            }
            return (tmp);
        }
        else
            return null;
    }

    public int [][] transpose(Matrix m1)
    {
        tmp = new int[m1.rows][m1.columns];
        for(int i=0; i<m1.rows; i++){
            for(int j=0; j<m1.columns; j++){
                tmp[i]= new int[m1.columns];
            }
        }
        for(int i = 0; i < m1.rows; i++)
        {
            for(int j = 0; j < m1.columns; j++)
            {
                tmp[j][i] = m1.matrix[i][j];
            }
        }    
        return (tmp);
    }
}
