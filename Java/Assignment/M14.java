// 14. write 8 programs to calculate the areas with method with parameters.
class M14
{
    public static void main (String [] args)
    {
        Triangle.area(6,8);
        Square.area(4);
        Rectangle.area(3,8);
        Parallelogram.area(6,9);
        Trapezoid.area(3,5,9);
        Circle.area(5);
        Ellipse.area(4,7);
        Sector.area(5,45.67);
    }
}

class Triangle
{
    static void area(int b, int h)
    {
        double area = 0.5*b*h ;
        System.out.println("Triangle area : "+area) ;
    }
}

class Square
{
    static void area(int a)
    {
        int area = a*a ;
        System.out.println("Square area : "+area) ;
    }
}

class Rectangle
{
    static void area(int w, int h)
    {
        int area = w*h ;
        System.out.println("Rectangle area : "+area) ;
    }
}

class Parallelogram
{
    static void area(int b, int h)
    {
        int area = b*h ;
        System.out.println("Parallelogram area : "+area) ;
    }
}

class Trapezoid
{
    static void area(int a, int b, int h)
    {
        double area = 0.5*(a+b)*h ;
        System.out.println("Trapezoid area : "+area) ;
    }
}

class Circle
{
    static void area(int r)
    {
        final double pi = 3.142 ;
        double area = pi*r*r ;
        System.out.println("Circle area : "+area) ;
    }
}

class Ellipse
{
    static void area(int a, int b)
    {
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        System.out.println("Ellipse area : "+area) ;
    }
}

class Sector
{
    static void area(int r, double t)
    {
        double area = 0.5*r*r*t ;
        System.out.println("Sector area : "+area) ;
    }
}