#include <bits/stdc++.h>

using namespace std;

int deletion(int A[], int n, int position)
{
    int j = position;
    while (j <= n)
    {
        A[j] = A[j + 1];
        j++;
    }
    return n - 1;
}

int main()
{
    int Array[] = {10, 20, 30, 40, 50, 60};
    int n = 6;

    cout << "Before delete: ";
    for (int i = 0; i < n; i++)
    {
        cout << Array[i] << "\t";
    }

    cout << endl;

    n = deletion(Array, n, 2);

    cout << "After delete: ";
    for (int i = 0; i < n; i++)
    {
        cout << Array[i] << "\t";
    }

    return 0;
}