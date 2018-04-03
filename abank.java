abstract class bank{
int age;
String name;
int id;
bank(int age,String name,int id){
this.age=age;
this.name=name;
this.id=id;
}
abstract void incsal();
abstract void ramount();
abstract void display();
void result(){
System.out.println("age is"+age+"name is"+name+"id is "+id);
}
}
class employee extends bank{
	int salary,isal,ramtt,amount;
	employee(int age,String name,int id,int salary){
		super(age,name,id);
		this.salary=salary;
	}
void ramount(){
	ramtt=amount-500;
	}
	void incsal(){
		isal=salary*5;
	}
	void display(){
		System.out.println("salary is included so......AGE IS"+age+"NAME IS"+name+"ID IS"+id+"SALARY IS"+salary+"INCREEMENT SALARY IS"+isal);
	}
}
class customer extends bank{
	int amount,ramt,isall,salary;
	customer(int age,String name,int id,int amount){
		super(age,name,id);
		this.amount=amount;
	}
void incsal(){
		isall=salary*5;
	}
	void ramount(){
	ramt=amount-500;
	}
	void display(){
		System.out.println("amountis included so......AGE IS"+age+"NAME IS"+name+"ID IS"+id+"AMOUNT IS"+amount+"REDUECED AMOUNT IS"+ramt);
	}
}
class abank{
	public static void main(String[] args){
	bank b;
 b=new employee(20,"uma",101,1000);
	b.incsal();
	b.display();
	 b=new customer(60,"latha",201,50000);
	b.ramount();
	b.display();
}
}

