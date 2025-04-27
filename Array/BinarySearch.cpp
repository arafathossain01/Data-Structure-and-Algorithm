#include <iostream>
using namespace std;

int BSearch(int A[], int n, int item)
{
    int left = 0;
    int right = n - 1;

    

    while (left <= right)
    {
        int mid = (left + right) / 2;
        if (item == A[mid])
        {
            return mid;
        }

        if (item < A[mid])
        {
            right = mid - 1;
        }

        if (item > A[mid])
        {
            left = mid + 1;
        }
    }

    return -1;
}

int main()
{
    int Array[] = {32, 35, 45, 55, 67, 69, 70};
    int n = 7;

    cout << "Elements are: ";

    for (int i = 0; i < n; i++)
    {
        cout << Array[i] << "\t";
    }

    cout<<endl;

    int result = BSearch(Array, n, 45);

    if (result >= 0)
    {
        cout << "Item is found: " << Array[result] << "\n";
        cout << "Item index number is: " << result;
    }

    else
    {
        cout << "Item is not found";
    }
    return 0;
}