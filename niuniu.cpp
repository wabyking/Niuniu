#include<iostream>
#include<algorithm>
using namespace std;
int main(){
	int card[] = {3,2,1,7,10};
	int sum=0;
	for(int i=0;i<5;i++)
		sum+=card[i];
	do{
    	if((card[0]+card[1]+card[2])%10==0)
    	{
    		cout<<sum%10;
    		break;
    	}
	}
	while (next_permutation(card,card+5));
	return 0;
}
