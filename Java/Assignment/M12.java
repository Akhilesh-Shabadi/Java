// 12. write 8 programs to calculate areas with methods with return type.
class M12
{
    static double triangle()
    {
        int b = 5 ;
        int h = 8 ;
        double area = 0.5*b*h ;
        return area;
    }

    static int square()
    {
        int a = 10 ;
        int length = a*a ;
        return length;
    }

    static int rectangle()
    {
        int w = 9 ;
        int h = 7 ;
        int area = w*h ;
        return area ;
    }

    static int parallelogram()
    {
        int b = 4 ;
        int h = 6 ;
        int area = b*h ;
        return area;
    }

    static double trapezoid()
    {
        int a = 5 ;
        int b = 9 ;
        int h = 7 ;
        double area = 0.5*(a+b)*h ;
        return area;
    }

    static double circle()
    {
        int r = 6 ;
        final double pi = 3.142 ;
        double area = pi*r*r ;
        return area;
    }

    static double ellipse()
    {
        int a = 2 ;
        int b = 4 ;
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        return area;
    }

    static double sector()
    {
        int r = 4 ;
        double t = 35.4 ;
        double area = 0.5*r*r*t ;
        return area;
    }

    public static void main ( String [] args )
    {
        {
            double x = triangle();
            System.out.println(x);
        }
        {
            int x=square();
            System.out.println(x);
        }
        {
            int x=rectangle();
            System.out.println(x);
        }
        {
            int x=parallelogram();
            System.out.println(x);
        }
        {
            double x=trapezoid();
            System.out.println(x);
        }
        {
            double x=circle();
            System.out.println(x);
        }
        {
            double x=ellipse();
            System.out.println(x);
        }
        {
            double x=sector();
            System.out.println(x);
        }
    }
}