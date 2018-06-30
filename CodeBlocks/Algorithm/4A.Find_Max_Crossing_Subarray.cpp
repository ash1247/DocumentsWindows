#include <bits/stdc++.h>

using namespace std;

tuple<int, int, int> find_max_crossing_subarray(int *A, int low, int mid, int high );
tuple<int, int, int> find_maximum_subarray( int *A, int low, int high);

int main( void )
{
    int n;

    cin >> n;

    int A[n];

    for( int i = 1; i <= n; i++ )
    {
        cin >> A[i];
    }

    int low = 1;
    int high = n;
    int lowR, highR, sumR;

    tie( lowR, highR, sumR ) = find_maximum_subarray( A, low, high );

    cout << lowR << endl;
    cout << highR << endl;
    cout << sumR << endl;

    return 0;


}

tuple<int, int, int> find_max_crossing_subarray(int *A, int low, int mid, int high )
{
    int leftSum = -123456789;
    int sum = 0;
    int max_left = 0;

    for( int i = mid; i >= 1; i-- )
    {
        sum = sum + A[i];

        if( sum > leftSum )
        {
            leftSum = sum;
            max_left = i;
        }
    }

    int rightSum = -123456789;
    sum = 0;
    int max_right = 0;

    for( int j = mid + 1; j <= high; j++ )
    {
        sum = sum + A[j];

        if( sum > rightSum )
        {
            rightSum = sum;
            max_right = j;
        }
    }

    return make_tuple( max_left,max_right, leftSum + rightSum );
}


tuple< int, int, int > find_maximum_subarray( int *A, int low, int high )
{
    int cross_low = 0, cross_high = 0, cross_sum = 0;
    int left_low = 0, left_high = 0, left_sum = 0;
    int right_low = 0, right_high = 0, right_sum = 0;
    if( high == low )
    {
        return make_tuple( low, high, A[low] );
    }
    else if( int mid = (low + high) / 2 )
    {
        tie( left_low , left_high, left_sum ) = find_maximum_subarray( A, low, mid);
        tie( right_low, right_high, right_sum ) = find_maximum_subarray( A, mid + 1, high );
        tie( cross_low, cross_high, cross_sum ) = find_max_crossing_subarray( A, low, mid, high);

        if( left_sum >= right_sum & left_sum >= cross_sum )
        {
            return make_tuple( left_low, left_high, left_sum );
        }
        else if( left_sum <= right_sum & right_sum >= cross_sum )
        {
            return make_tuple( right_low, right_high, right_sum );
        }
        else
        {
            return make_tuple( cross_low, cross_high, cross_sum );
        }
    }
}
