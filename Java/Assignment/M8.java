// write a program to perform all the arithmatic operations using methods.
class M8
{
    static void add()
    {
        int a = 10 ;
        int b = 10 ;
        int c = (a+b) ;
        System.out.println("Addtion of 10 and 10 : "+c);
    }

    static void sub()
    {
        int a = 10 ;
        int b = 5 ;
        int c = a-b ;
        System.out.println("Subtraction of 10 and 5 : "+c);
    }

    static void mul()
    {
        int a = 10 ;
        int b = 7 ;
        int c = a*b ;
        System.out.println("Multiple of 10 and 7 : "+c) ;
    }

    static void div()
    {
        int a = 10 ;
        int b = 2 ;
        int c = a/b ;
        System.out.println("Division of 10 and 2 : "+c) ;
    }

    static void mod()
    {
        int a = 11 ;
        int b = 2 ;
        int c = a % b ;
        System.out.println("Modulus of 11 and 2 : "+c) ;
    }

    public static void main (String [] args)
    {
        // System.out.println("----Main Starts----");
        add();
        sub();
        mul();
        div();
        mod();
        // System.out.println("---Main ends---");
    }
}