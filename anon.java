interface calculator{
 public int operations(int a,int b);
 }
 class anon{
	public static void main(String[] args){
	calculator c1=new calculator(){
		public int operations(int a,int b){
		System.out.println("doing addition");
		return (a+b);
		}
	};
	int res=c1.operations(10,20);
	System.out.println("result is"+res);
	res=new calculator(){
		public int operations(int a,int b){
		System.out.println("doing subraction");
		return (a-b);
		}
	}.operations(30,10);
	System.out.println("result is "+res);
	}
	}
	
	