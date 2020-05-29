#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0,z=0,row_ind=0,col_ind=0;
  std::cin>>r;
  std::cin>>c;
  int row_arr[r];
  int col_arr[c];
  int arr[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>arr[i][j];
    }
  }
  std::cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum=sum+arr[i][j];
    }
    std::cout<<sum<<" ";
    row_arr[z++]=sum;
    sum=0;
  }
  std::cout<<"\n";
  int temp_row=row_arr[0];
  for(i=1;i<r;i++)
  {
    if(temp_row<row_arr[i])
    {
      temp_row=row_arr[i];
      row_ind=i;
    }
  }
  std::cout<<"Row "<<row_ind+1<<" has maximum sum";
  z=0;
  sum=0;
  
 std::cout<<"\nSum of columns is ";
   for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
      sum=sum+arr[i][j];
    }
    std::cout<<sum<<" ";
    col_arr[z++]=sum;
    sum=0;
  } 
  
  int temp_col=col_arr[0];
  for(i=0;i<c;i++)
  {
    if(temp_col<col_arr[i])
    {
      temp_col=col_arr[i];
      col_ind=i;
    }
  }
  std::cout<<"\nColumn "<<col_ind+1<<" has maximum sum";
}