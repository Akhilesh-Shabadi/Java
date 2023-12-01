// 10. write 8 programs to calculate areas with methods with parameter.
class M10
{
    static void triangle(int b, int h)
    {
        double area = 0.5*b*h ;
        System.out.println("Triangle area : "+area) ;
    }

    static void square(int a)
    {
        int area = a*a ;
        System.out.println("Square area : "+area) ;
    }

    static void rectangle(int w, int h)
    {
        int area = w*h ;
        System.out.println("Rectangle area : "+area) ;
    }

    static void parallelogram(int b, int h)
    {
        int area = b*h ;
        System.out.println("Parallelogram area : "+area) ;
    }

    static void trapezoid(int a, int b, int h)
    {
        double area = 0.5*(a+b)*h ;
        System.out.println("Trapezoid area : "+area) ;
    }

    static void circle(int r)
    {
        final double pi = 3.142 ;
        double area = pi*r*r ;
        System.out.println("Circle area : "+area) ;
    }

    static void ellipse(int a, int b)
    {
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        System.out.println("Ellipse area : "+area) ;
    }

    static void sector(int r, double t)
    {
        double area = 0.5*r*r*t ;
        System.out.println("Sector area : "+area) ;
    }

    public static void main ( String [] args )
    {
        triangle(5,6);
        square(6);
        rectangle(3,6);
        parallelogram(4,9);
        trapezoid(5,9,7);
        circle(6);
        ellipse(3,7);
        sector(6,37);
    }
}