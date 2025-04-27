#include <iostream>

using namespace std;

int insertion(int A[], int n, int p, int item)
{
    int j = n;
    while (j >= p)
    {
        A[j + 1] = A[j];
        j--;
    }
    A[p] = item;
    return n +1;
}

int main()
{
    int Array[100] = {10, 20, 30, 40, 50};
    int n = 5;
    int position = 3;

    cout << "Before insert element: ";

    for (int i = 0; i < n; i++)
    {
        cout << Array[i] << "\t";
    }
    cout << endl;

    n = insertion(Array, n, position, 24);

    cout << "After insertion: ";

    for (int i = 0; i < n; i++)
    {
        cout << Array[i] << "\t";
    }

    return 0;
}