public class calc{
public static void main(String[] args){
	int[] array=new int[4];
	
	for(int index=0;index<args.length;index++){
		array[index]=Integer.parseInt(args[index]);
	}
	calculator cal=new calculator();
	int res=cal.findmax(array);
	System.out.println("max is"+res);
	int result=cal.findmin(array);
	System.out.println("min is:"+result);
	int rs=cal.findsum(array);
	System.out.println("sum is :"+rs);
}
}
