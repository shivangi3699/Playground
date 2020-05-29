#include<iostream>
#include<string>
#include<string.h>
using namespace std; 
int main() 
{ 
    string s1,s2,s3;

  cin>>s1>>s2;
  
    int i,j=0;
  
    
    for(i = (s1.length() - 1); i >=0; i--)
    {
      s3[j]=s1[i];
      j++;
    }
  
  
  	for(j=0;j<s1.length()-1;j++)
    {
   if (s3[j]!=s2[j]) 
   {
        cout<<("It is wrong");
     return 0;
     	
   }
     
    } cout<<("It is correct"); 
 }
