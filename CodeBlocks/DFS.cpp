#include<bits/stdc++.h>
using namespace std;
#define WHITE 0
#define GRAY 1
#define BLACK 2
#define SIZE 100
int adj[SIZE][SIZE];
int colour[SIZE];
int parent[SIZE];
int dis[SIZE];
void dfs(int vertex);
void dfsvisit(int u,int vertex);
int main()
{
    //freopen("bfs.txt","r",stdin);
	int vertex;
	int edge;
	cin>>vertex>>edge; //3 3
	cout<<"vertex  is :"<<vertex<<endl;//3
	cout<<"Edge is : "<<edge<<endl; //3
	int node1,node2;
	for (int i=0;i<edge;i++)
	{
		cin>>node1>>node2;
		adj[node1][node2]=1;
		adj[node2][node1]=1;
	}
	for(int i=0;i<vertex;i++)
	{
		for(int j=0;j<vertex;j++)
		{
			cout<<adj[i][j]<<" ";
		}
		cout<<endl;
	}
	dfs(vertex);
}
void dfs(int vertex)
{
	for (int i=0;i<vertex;i++)
		colour[i]=WHITE;
		cout<<"DFS is ";
		for(int i=0;i<vertex;i++)
		{
			if(colour[i]==WHITE)
			{
				dfsvisit(i,vertex);
			}
		}

	}
void dfsvisit(int u,int vertex)
	{
		colour[u]=GRAY;
		for(int i=0;i<vertex;i++)
		{
			if(adj[u][i]==1)
			{
				int v=i;
				if(colour[v]==WHITE)
				{
					parent[v]=u;
					dfsvisit(v,vertex);
				}
			}
		}
		colour[u]=BLACK;
		cout<<u<<" ";
	}
