public class calctest{
     int max=0,min=0,sum=0;
	int findmax(int arr[]){
		for(int i:arr){
			if(max<i){
				max=i;
			}
		}
		return max;
	}
	int findmin(int arr[]){
		for(int j:arr){
			if(min>j){
				min=j;
			}
		}
		return min;
	}	
	int findsum(int arr[]){
		for(int k:arr){
			sum=sum+k;
		}
			return sum;
	}
		}
	