class Solution {
    public int max(int x,int y){
        return x>y?x:y;
    }
    public int[][] updateMatrix(int[][] matrix) {
        int[][] returnMatrix = new int[matrix.length][matrix[0].length];
        int hori = matrix.length;
        int row = matrix[0].length;
        for(int i = 0;i< hori;i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j]=0;
                if(matrix[i][j]==0)
                    returnMatrix[i][j] = 0;
                else {
                    int distance = 1;
                    for(distance = 1;distance<max(hori,row);distance++)
                    {
                        for(int count = 0;count<distance;count++)
                        {
                            if(i-count>=0 && j-(distance-count)>=0 && matrix[i-count][j-(distance-count)]==0)
                            {
                                returnMatrix[i][j]=distance;
                                break;
                            }
                            else if(i+count<hori && j-(distance-count)>=0 && matrix[i+count][j-(distance-count)]==0)
                            {
                                returnMatrix[i][j]=distance;
                                break;
                            }
                            else if(i-count>=0 && j+(distance-count)<row && matrix[i-count][j+(distance-count)]==0)
                            {
                                returnMatrix[i][j]=distance;
                                break;
                            }
                            else if(i+count<hori &&j+(distance-count)<row &&matrix[i+count][j+(distance-count)]==0)
                            {
                                returnMatrix[i][j]=distance;
                                break;
                            }
                        }
                        if(returnMatrix[i][j]!=0)
                            break;

                    }
                }
            }
        }
        return returnMatrix;
    }
}