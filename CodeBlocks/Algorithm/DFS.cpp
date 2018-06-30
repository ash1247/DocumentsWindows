#include <bits/stdc++.h>

using namespace std;

#define WHITE -1
#define GRAY 0
#define BLACK 1
#define SIZE 100

vector<int> graph[ SIZE ];
int tim;
int start[ SIZE ], finish[ SIZE ], path[ SIZE ], color[ SIZE ];

void dfs_visit( int u );

int main( void )
{
    int nodes, edges, u, v;
    cout << "Enter the number of nodes: ";
    cin >> nodes;
    cout << "Enter the number of edges: ";
    cin >> edges;

    for( int i = 0; i < edges; i++ )
    {
        cin >> u >> v;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }

    for( int i = 1; i <= nodes; i++ )
    {
        color[i] = WHITE;
        path[i] = -1;
    }

    tim = 0;

    for( int i = 1; i <= nodes; i++ )
    {
        if(color[i] == WHITE )
        {
            dfs_visit(i);
        }
    }

    for(int i = 1; i <= nodes; i++ )
    {
        printf("Node %d:  %d ----> %d\n", i, start[i], finish[i] );
    }

    return 0;
}

void dfs_visit( int u )
{
    color[u] = GRAY;
    tim = tim + 1;
    start[ u ] = tim;

    for(int i = 0; i < graph[u].size(); i++ )
    {
        int v = graph[u][i];
        if( color[v] ==  WHITE )
        {
            path[v];
            dfs_visit( v );
        }
    }

    color[u] = BLACK;
    tim = tim + 1;
    finish[u] = tim;
}
