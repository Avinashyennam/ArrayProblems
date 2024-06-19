#include<bits/stdc++.h>
using namespace std;
int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int miss = 1;
        for(int num : nums)
        {
            if(num>0)
            {
                if(num == miss)
                    miss++;
                else if(num>miss)
                    break;
            }
        }
        return miss;
}
int main()
{
    vector<int> nums = {1,2,0};
    cout<<firstMissingPositive(nums);
}