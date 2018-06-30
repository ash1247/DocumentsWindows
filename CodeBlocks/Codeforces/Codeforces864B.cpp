#include <bits/stdc++.h>
using namespace std;

main()
{
    int n ;
    cin >> n;
    int A[n];
    for(int i = 0;i<n;i++)
    {
        cin >> A[i];
    }
    int x = A[0];
    int y;
    for(int i = 1;i<n;i++){
        if(A[i]!=x){
            y=A[i];
            break;
        }
    }
    int p=0,v=0;
    for(int i = 0;i<n;i++)
    {

        if(A[i]==x)
        {
            p++;
        }
        else if(A[i]==y)
        {
            v++;
        }
    }
    if((p+v)==n && x!=y){
       if(p==v){
        cout << "YES" << endl;
        cout << x << " " << y << endl;
       }
       else cout << "NO" << endl;
    }
    else cout << "NO" << endl;
}
