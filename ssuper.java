uclass employ{
 String name;
 employ(){
	name="uma";
}
employ(String name){
 this.name=name;
}
}
class customer extends employ{
	int id,age;
	customer(){
	id=101;
	age=19;
System.out.println("default c,id is"+id+"age is"+age+ "name is"+name);

	
}
 	customer(int id,int age,String name){
		super(name);
		this.id=id;
		this.age=age;
	System.out.println("para c,"+"id is"+id+"age is"+age+"name is"+name);

}
	
}
class ssuper{
	public static void main(String[] args){
	employ e;
	e=new customer();

	employ e1;
	e1=new customer(102,20,"laksh");
}
}
