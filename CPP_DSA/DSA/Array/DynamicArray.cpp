#include <iostream>
using namespace std;

int main()
{

    int size;
    cout << "Enter the size: ";
    cin >> size;

    int *array = new int[size];

    cout << "Enter elements: ";
    for (int i = 0; i < size; i++)
    {
        cin >> array[i];
    }

    cout << "Your elements are: ";
    for (int i = 0; i < size; i++)
    {
        cout << array[i] << "\t";
    }

    return 0;
}