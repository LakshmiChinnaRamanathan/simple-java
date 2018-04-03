public class calctest1{
       public static void main(String[] args){
	int[] array=new int[args.length];
	
	for(int index=0;index<args.length;index++){
		array[index]=Integer.parseInt(args[index]);
	}
	calctest cal=new calctest();
	int res=cal.findmax(array);
	System.out.println("max is"+res);
	int result=cal.findmin(array);
	System.out.println("min is:"+result);
	int rs=cal.findsum(array);
	System.out.println("sum is :"+rs);
}
}


