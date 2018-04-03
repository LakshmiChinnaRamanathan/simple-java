 class calc{
     int max=0,min=0,sum=0;
	int findmax(int arr[]){
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	int findmin(int arr[]){
		for(int j=0;j<arr.length;j++){
			if(min>arr[j]){
				min=arr[j];
			}
		}
		return min;
	}	
	int findsum(int arr[]){
		for(int k=0;k<arr.length;k++){
			sum=sum+arr[k];
		}
			return sum;
	}
		}
	public class calculator{
       		public static void main(String[] args){
		int[] array=new int[args.length];
	
		for(int index=0;index<args.length;index++){
		array[index]=Integer.parseInt(args[index]);
		}
		calc cal=new calc();
		int res=cal.findmax(array);
		System.out.println("max is"+res);
		int result=cal.findmin(array);
		System.out.println("min is:"+result);
		int rs=cal.findsum(array);
		System.out.println("sum is :"+rs);
}
}


