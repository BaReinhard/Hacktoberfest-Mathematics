#include <bits/stdc++.h>
#include<boost/multiprecision/cpp_int.hpp>
	 
		#define ll          long long
		#define pb          push_back
		//#define mp          make_pair
		#define pii         pair<int,int>
		#define vi          vector<int>
		#define all(a)      (a).begin(),(a).end()
		#define lol        1000000007
		#define endl        '\n'
		#define rep(i,a,b)	for(int i=a;i<b;i++)
		//using namespace std;
		namespace mp = boost::multiprecision;
	 
		void solve()
		{
			unsigned n;
      std::cout<<"Enter a number"<<endl;
			std::cin>>n;
			mp::cpp_int u=1;
			for(unsigned i=1; i<=n; i++)
				u*=i;
			std::cout<<u<<endl;
			
			
			
		}
	 
		int main()
		{
			std::ios_base::sync_with_stdio(false);
			std::cin.tie(0);
			std::cout.tie(0);
			int t=1;
//			std::cin>>t;
			while(t--){
				solve();
			}
			return 0;
		} 
