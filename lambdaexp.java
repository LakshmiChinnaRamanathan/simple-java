interface lam{
	int operations(int a,int b);
}
class lambdaexp{
	public static void main(String[] args){
		lam max=(a,b)->(a>b)?a:b;
		op(max);
		op(a,b)->{
		System.out.println("lamba exp");			
		(a*b);}
		op((i,j)->(i+j));
}
	static void op(lam c){
		int result=c.operations(300,40);
		System.out.println("result is"+result);

		}
}