// finding the inverse of a matrix

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Finding the Inverse of a Matrix using Gauss-Jordan Elimination

   //taking the dimensions of the matrix as input
   int row,flag=0;
   int column;
   int i,j,k,current_pos;
   float current_val,pivot_position;

   scanf("%d",&row);
   column=row;

   //dimensions of the augmented matrix is same number of rows and double the number of columns

    float augmented_matrix[row][row*2];
    //printf("%d",row);
    for(i=0;i<row;i++)
    {
        for(j=0;j<row;j++)
        {
            scanf("%f",&augmented_matrix[i][j]);
        }
    }

    for(i=0;i<row;i++)
    {
        for(j=row;j<2*row;j++)
        {
            if(j%row!=i)
                augmented_matrix[i][j]=0;
            else
                augmented_matrix[i][j]=1;

        }

    }

    for(j=0;j<row;j++)
    {
        current_pos=j;
        //in order to swap the rows in case any pivot element comes out to be zero
        if(augmented_matrix[j][j]==0)
        {
            for(i=j;i<row;i++)
            {
                if(augmented_matrix[i][j]!=0)
                {
                    current_pos=i;
                }
            }

        }


        if(j!=current_pos)
        {
            for(i=0;i<2*row;i++)
            {
                current_val=augmented_matrix[j][i];
                augmented_matrix[j][i]=augmented_matrix[current_pos][i];
                augmented_matrix[current_pos][i]=current_val;
            }
        }


        for(i=0;i<row;i++)
        {
            if(i==j)
            {
                pivot_position=augmented_matrix[i][j];
                //scaling to get the pivot positions as unity
                for(k=0;k<2*row;k++)
                {
                    augmented_matrix[i][k]/=pivot_position;
                }
            }
            else
            {
                pivot_position=augmented_matrix[i][j]/augmented_matrix[j][j];
                for(k=0;k<2*row;k++)
                {

                    augmented_matrix[i][k]-=(augmented_matrix[j][k])*(pivot_position) ;
                }

            }
        }


    }
    for(k=0;k<row;k++)
    {
    	for(i=row;i<2*row;i++)
    	{
        	printf("%f ",augmented_matrix[k][i]);
    	}
    	printf("\n");
    }




    return 0;
}
