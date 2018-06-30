#include <bits/stdc++.h>
using namespace std;

struct Item
{
    int value, weight;
};

bool cmp(struct Item a, struct Item b)
{
    double ratio1 = (double)a.value / a.weight;
    double ratio2 = (double)b.value / b.weight;
    return ratio1 > ratio2;
}

double fractionalKnapsack(int W, struct Item A[], int n)
{
    sort(A, A + n, cmp);

    int currentWeight = 0;
    double finalValue = 0.0;

    for (int i = 0; i < n; i++)
    {
        if (currentWeight + A[i].weight <= W)
        {
            currentWeight += A[i].weight;
            finalValue += A[i].value;
        }
        else
        {
            int remain = W - currentWeight;
            finalValue += A[i].value * ((double) remain / A[i].weight);
            break;
        }
    }

    return finalValue;
}

int main()
{
    int W, n;
    cout << "Enter the Knapsack limit: ";
    cin >> W;

    cout << "How many items?\n";
    cin >> n;

    Item A[n];

    for( int i = 1; i <= n; i++ )
    {
        cin >> A[i].value >> A[i].weight;
    }

    cout << "Maximum profit we can obtain is "
         << fractionalKnapsack(W, A, n);
    return 0;
}

