// 13. write 8 programs to calculate areas between the classes without returning any value and witgout parameters.
class M13
{
    public static void main (String [] args)
    {
        Triangle.area();
        Square.area();
        Rectangle.area();
        Parallelogram.area();
        Trapezoid.area();
        Circle.area();
        Ellipse.area();
        Sector.area();
    }
}

class Triangle
{
    static void area()
    {
        int b = 5 ;
        int h = 8 ;
        double area = 0.5*b*h ;
        System.out.println("Triangle area : "+area) ;
    }
}

class Square
{
    static void area()
    {
        int a = 10 ;
        int area = a*a ;
        System.out.println("Square area : "+area) ;
    }
}

class Rectangle
{
    static void area()
    {
        int w = 9 ;
        int h = 7 ;
        int area = w*h ;
        System.out.println("Rectangle area : "+area) ;
    }
}

class Parallelogram
{
    static void area()
    {
        int b = 4 ;
        int h = 6 ;
        int area = b*h ;
        System.out.println("Parallelogram area : "+area) ;
    }
}

class Trapezoid
{
    static void area()
    {
        int a = 5 ;
        int b = 9 ;
        int h = 7 ;
        double area = 0.5*(a+b)*h ;
        System.out.println("Trapezoid area : "+area) ;
    }
}

class Circle
{
    static void area()
    {
        int r = 6 ;
        final double pi = 3.142 ;
        double area = pi*r*r ;
        System.out.println("Circle area : "+area) ;
    }
}

class Ellipse
{
    static void area()
    {
        int a = 2 ;
        int b = 4 ;
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        System.out.println("Ellipse area : "+area) ;
    }
}

class Sector
{
    static void area()
    {
        int r = 4 ;
        double ti = 35.4 ;
        double area = 0.5*r*r*ti ;
        System.out.println("Sector area : "+area) ;
    }
}