class Stack
{
    static void add(){
        int a=5;
        int b=7;
        System.out.println(a+b);
        add();
    }
    pubilc stat void main(String [] args){
        add();
    }
}