#include<bits/stdc++.h>
using namespace std;
int longestSubarray(vector<int>& nums, int limit) {
    int res = 1;
    deque<int> minQ;
    deque<int> maxQ;

    for (int l = 0, r = 0; r < nums.size(); ++r) {
      while (!minQ.empty() && minQ.back() > nums[r])
        minQ.pop_back();
      minQ.push_back(nums[r]);
      while (!maxQ.empty() && maxQ.back() < nums[r])
        maxQ.pop_back();
      maxQ.push_back(nums[r]);
      while (maxQ.front() - minQ.front() > limit) {
        if (minQ.front() == nums[l])
          minQ.pop_front();
        if (maxQ.front() == nums[l])
          maxQ.pop_front();
        ++l;
      }
      res = max(res, r - l + 1);
    }

    return res;
  }
  int main()
  {
    vector<int> nums = {8,2,4,7};
    int k = 4;
    cout<<longestSubarray(nums, k);
  }