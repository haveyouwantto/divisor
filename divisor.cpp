#include <iostream>

using namespace std;

void divisor(int n){
    for( int a = 1; a <= n; ++a )
       {
        if(n%a==0){
            cout<<a<<" ";
        }
       }
}

int main()
{
    divisor(80000000);
    return 0;
}

