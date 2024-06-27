#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int findPeakElement(vector<int>& nums) {
        int lo = 0;
        int hi = nums.size()-1;
        while(lo<hi)
        {
            int m = (lo+hi)/2;
            if(nums[m] >= nums[m+1])
                hi = m;
            else
                lo = m+1;
        }
        return lo;
}
int main()
{
    vector<int> arr = {1,2,1,3,5,6,4};
    cout<<findPeakElement(arr);
}