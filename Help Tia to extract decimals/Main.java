#include<iostream>
#include<string>
#include<math.h>
using namespace std;

int main()
{
   string num;
   string substr=".";
   std::cin>>num;
   if(num.find(substr) != string::npos) 
   {

     size_t pos = num.find('.');
	 string str3 = num.substr (pos+1);
     std::cout<<"Floating part is : "<<str3;
	}
	else
		cout<<"Floating part is : ";

}