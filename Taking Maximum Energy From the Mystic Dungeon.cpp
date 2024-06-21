#include<bits/stdc++.h>
using namespace std;
int maximumEnergy(vector<int>& energy, int k) {
       int n=energy.size();
        int maxi=INT_MIN;
        for(int i=n-1;i>=n-k;i--){
            int ans=0;
            for(int j=i;j>=0;j=j-k){
                ans+=energy[j];
                maxi=max(maxi,ans);
            }
           
        }
        return maxi;
}
int main()
{
    vector<int> energy = {5,2,-10,-5,1};
    int k = 3;
    cout<<maximumEnergy(energy,k);
}