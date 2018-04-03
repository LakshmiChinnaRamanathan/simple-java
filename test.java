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
class test{
public static void main(String[] args){
employ e=new employ();
student s=new student();
person p=new person();
test(e); test(p); test(s);
}
static void test(person p){
p.display();
}
}