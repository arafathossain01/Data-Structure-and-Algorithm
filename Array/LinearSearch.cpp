#include <iostream>
using namespace std;

int LSearch(int A[], int n, int item)
{
    int i = 0;
    while (i < n)
    {
        if (A[i] == item)
        {
            return i;
        }
        i++;
    }

    return -1;
}

int main()
{
    int Array[] = {12, 43, 54, 65, 75, 87, 23};
    int n = 7;

    cout << "The Array is: ";
    
    for (int i = 0; i < n; i++)
    {
        cout << Array[i] << "\t";
    }
    cout << endl;

    int result = LSearch(Array, n, 43);

    if (result >= 0)
    {
        cout << "Item is found: " << Array[result] << "\n";
        cout << "Item index is: " << result;
    }

    else
    {
        cout << "Item is not found.";
    }

    return 0;
}