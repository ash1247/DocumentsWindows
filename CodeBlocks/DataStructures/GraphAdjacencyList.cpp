#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    vector <list<int> > adjList(5);
    adjList[0].push_back(1);
    adjList[0].push_back(2);

    adjList[1].push_back(2);
    adjList[1].push_back(0);

    adjList[2].push_back(0);
    adjList[2].push_back(1);
    adjList[2].push_back(3);

    adjList[3].push_back(2);

    vector< list<int> >::iterator i;
    int c=0;
    for (i=adjList.begin(); i < adjList.end(); ++i){


        cout<<"vertices connected to node "<<c <<" are ";

        list<int> li = *i;
        for(list<int>::iterator iter = li.begin(); iter!= li.end(); ++iter){

            cout<<*iter<<" ";
        }
        cout<<endl;
        c++;
    }

}
