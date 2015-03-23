package niuniu;

import java.util.Random;

class Niuniu
{
	
		public static void main(String[] args) {
			int card1[]=new int[5];
			int card[]={1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13};
		//int score[52];
			for(int i=0;i<5;i++){
				int n=Math.abs(new Random().nextInt()) % 52;
				card1[i]=card[n];
			}
//		Ï´ÅÆ
			for(int i=0;i<52;i++)
				System.out.print(card[i]+" ");
			Niuniu sample=new Niuniu(card1,3);
			System.out.println(new Niuniu(card1,3).niuniu());
		}
	
	
		
	
		
	
	
	
		public Niuniu(int a[],int len)
		{
			this.a=a;
			print(a,a.length);
			this.len=len;
			noUse=new int[a.length-len];
			use=new int[len];
			
		}
		int answer;
		public int niuniu()
		{
			return niuniu(0,0,0);
		}
		public int niuniu(int step,int use_index,int no_use_index)
		{
			//System.out.println("#"+step+":"+use_index+":"+no_use_index);
			if(a.length==step)
			{
				int sum=0;
				for(int i=0;i<len;i++)
				{
					sum+=getValue(use[i]);
					
				}
				if(sum%10==0)
				{
					//print(use,use.length);
					int niu=0;
					for(int j=0;j<noUse.length;j++)
					{
						niu+=getValue(noUse[j]);
					}
					//System.out.println(niu+"***********");
					return niu=niu%10;
				}
				else
				{
					print(use,len);
					return -1;
				}
			}
			else
			{
				if(use_index<3)
				{
					use[use_index]=a[step];
					int result=niuniu(step+1,use_index+1,no_use_index);
					if(result!=-1)
						return result;
					
				}
				if(no_use_index<2)
				{
					noUse[no_use_index]=a[step];
					int result=niuniu(step+1,use_index,no_use_index+1);
					if(result!=-1)
						return result;
				}
				return -1;
			}
			
			
		}
		int a[];
		int len;
		int noUse[];
		int use[];
		
		void print(int b[],int len)
		{
			for(int i=0;i<len;i++)
			{
				System.out.print(b[i]+" ");
				
			}
			System.out.println();
		}
		
		
		public int getValue(int num)
		{
			if(num>=10)
				return 0;
			else
				return num%10;
			
		}
	}
	