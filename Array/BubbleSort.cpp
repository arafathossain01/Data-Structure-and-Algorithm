#include<iostream>
using namespace std;

int BSort(int A[], int n){

    
}
int main(){
    int Array[]={12,20,4,6,50,10,87,45,55};
    int n =sizeof(Array)/sizeof(Array[0]);

    cout<<"Before sorting: ";
    for (int i=0; i<n; i++){
        cout<<Array[i]<<"\t";
    }

    cout<<endl;

    cout<<"Before sorting: ";
    BSort(Array,n);
    return 0;
}