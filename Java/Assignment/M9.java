// 9. write 8 programs to calculate areas using methods.
class M9
{
    static void triangle()
    {
        int b = 5 ;
        int h = 8 ;
        double area = 0.5*b*h ;
        System.out.println("Triangle area : "+area) ;
    }

    static void square()
    {
        int a = 10 ;
        int length = a*a ;
        System.out.println("Square area : "+length) ;
    }

    static void rectangle()
    {
        int w = 9 ;
        int h = 7 ;
        int area = w*h ;
        System.out.println("Rectangle area : "+area) ;
    }

    static void parallelogram()
    {
        int b = 4 ;
        int h = 6 ;
        int area = b*h ;
        System.out.println("Parallelogram area : "+area) ;
    }

    static void trapezoid()
    {
        int a = 5 ;
        int b = 9 ;
        int h = 7 ;
        double area = 0.5*(a+b)*h ;
        System.out.println("Trapezoid area : "+area) ;
    }

    static void circle()
    {
        int r = 6 ;
        final double pi = 3.142 ;
        double area = pi*r*r ;
        System.out.println("Circle area : "+area) ;
    }

    static void ellipse()
    {
        int a = 2 ;
        int b = 4 ;
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        System.out.println("Ellipse area : "+area) ;
    }

    static void sector()
    {
        int r = 4 ;
        double t = 35.4 ;
        double area = 0.5*r*r*t ;
        System.out.println("Sector area : "+area) ;
    }

    public static void main ( String [] args )
    {
        triangle();
        square();
        rectangle();
        parallelogram();
        trapezoid();
        circle();
        ellipse();
        sector();
    }
}