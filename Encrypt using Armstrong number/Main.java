#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int orignalnum=n;
  int p=0,reminder,pw,result=0;
    while(orignalnum!=0)
    {
      
      orignalnum=orignalnum/10;
      ++p;
      
    }
  orignalnum=n;
  while(orignalnum!=0)
  {
    reminder=orignalnum%10;
    pw=power(reminder,p);
    result=result+pw;
    orignalnum=orignalnum/10;
  }
  if(result==n)
  {
    return 1;
  }

}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}