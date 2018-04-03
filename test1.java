class person{
void display(){
System.out.println("dispaly of person");
}
}
class employ extends person{
void display(){
System.out.println("dispaly of EMPLOY");
}
}
class student extends person{
void display(){
System.out.println("dispaly of student");
}
}
class test1{
public static void main(String[] args){

person p;
p=new employ();
//p=new student();
p.dispaly();
//p.display();

}

}