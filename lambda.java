interface lamcal{
int loperations(int a,int b);
}
class lambda{
public static void main(String[] args){
lamcal max=(a,b)->(a>b)?a:b;
op(max);
op((a,b)->(a*b));
op((i,j)->(i+j));
}
static void op(lamcal c){
int result=c.loperations(30,40);
System.out.println("result is"+result);

}
}