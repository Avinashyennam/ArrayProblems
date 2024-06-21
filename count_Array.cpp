#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    
    int countArr[13] = {0};
    for(int i=0;i<n;i++)
        countArr[a[i]]++;


    int q;
    cout<<"Enter number of queries :- ";
    cin>>q;
    while(q-->0)
    {
        int nums;
        cin>>nums;
        cout<<" --> "<<countArr[nums];
        cout<<endl;
    }
}