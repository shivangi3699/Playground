#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0,sum=0;
  std::cin>>n;

  while(n>0)
  {
    sum=n%10;
    n=n/10;
    if(sum%2==0)
    {
      even=even+sum;
    }
    else
    {
      odd=odd+sum;
    }
  }
  if(even==odd)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}