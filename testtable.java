class table{
	int r,c;
	table(){
		System.out.println("default cons created");
		r=1;
		c=2;
		

	}
	table(int x,int y){
		r=x;c=y;
		
	}
	void calculate(){
		int n;
		n=r*c;
		System.out.println("result is"+n);
	}
}
class test{
	public static void main(String args[])
	{
		table t1=new table();
		table t2=new table(10,20);
		table t3=new table();
		t3.r=30;
		t3.c=40;
		t1.calculate();
		t2.calculate();
		t3.calculate();
	}
}
