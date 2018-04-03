interface anon{
 int operations(int x,int y);
}
 class calcul{
public static void main(String[] args){
anon a=new anon(){
public int operations(int x,int y){
System.out.println(x);
System.out.println(y);
return(x>y)?x:y;
}
};
int res=a.operations(5,6);
System.out.println(res);
System.out.println(new anon(){
public int operations(int x,int y){
System.out.println(x);
System.out.println(y);
return(x<y)?x:y;
}
}.operations(25,26));
}
}
