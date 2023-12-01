// 15. write 8 programs to calculate the areas with method with return type.
class M15
{
    public static void main(String [] args)
    {
        System.out.println(Triangle.area());
        System.out.println(Square.area());
        System.out.println(Rectangle.area());
        System.out.println(Parallelogram.area());
        System.out.println(Trapezoid.area());
        System.out.println(Circle.area());
        System.out.println(Ellipse.area());
        System.out.println(Sector.area());
    }
}

class Triangle
{
    static double area()
    {
        int b = 5 ;
        int h = 8 ;
        double area = 0.5*b*h ;
        return area;
    }
}

class Square
{
    static int area()
    {
        int a = 10 ;
        int area = a*a ;
        return area;
    }
}

class Rectangle
{
    static int area()
    {
        int w = 9 ;
        int h = 7 ;
        int area = w*h ;
        return area ;
    }
}

class Parallelogram
{
    static int area()
    {
        int b = 4 ;
        int h = 6 ;
        int area = b*h ;
        return area;
    }
}

class Trapezoid
{
    static double area()
    {
        int a = 5 ;
        int b = 9 ;
        int h = 7 ;
        double area = 0.5*(a+b)*h ;
        return area;
    }
}

class Circle
{
    static double area()
    {
        int r = 6 ;
        final double pi = 3.142 ;
        double area = pi*r*r ;
        return area;
    }
}

class Ellipse
{
    static double area()
    {
        int a = 2 ;
        int b = 4 ;
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        return area;
    }
}

class Sector
{
    static double area()
    {
        int r = 4 ;
        double t = 35.4 ;
        double area = 0.5*r*r*t ;
        return area;
    }
}