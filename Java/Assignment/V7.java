// Global Variables [ 21-11-23 ]
class V7
{
    // 1. MOBILE
        static int m_cost = 80000 ;
        static String m_m_name = " iPhone 15 Pro " ;
        static String m_colour = " Moon white " ;

    // 2. CAR
        static int c_cost = 5500000 ;
        static String c_model = " Fotuner Legender 2.8 " ;
        static String c_type = " Diesel 4x4 AT " ;

    // 3. SCHOOL
        static String s_name = "Sri Saraswathi";
        static char s_grade = 'A';
        static int s_str = 800 ;

    // 4. TV
        static int tv_cost = 35000 ;
        static String tv_brand = "Micromax" ;
        static String tv_type = "Ultra High Definition 4K TV" ;

    // 5. BIKE
        static int b_cost = 230000 ;
        static String b_brand = "Bajaj Dominar 400" ;
        static String b_colour = "Charcoal Black, Aurora Green, Vine Black" ;

    // 6. COURSE
        static String course_name = "Civil";
        static String unvir_name = "VTU";
        static int exam_cost = 1075;

    // 7. LAPTOP
        static String L_brand = "Lenovo" ;
        static String L_name = "ideapad L340" ;
        static int L_cost = 53500 ;

    // 8. HOME
        static String h_name = "Pragati";
        static int h_cost = 12500000 ;
        static String h_colour = "Cream colour" ;

    // 9. EMPOLYEE
        static int emp_id = 04 ;
        static int emp_sal = 45000 ;
        static char emp_grade = 'A' ;

    // 10. CLOTH
        static String cloth_colour = "Black" ;
        static int cloth_cost = 1000 ;
        static String cloth_size = "L, XL, M" ;

    public static void main ( String [] args)
    {
    // 1. Mobile
        System.out.println ( "1>" );
        System.out.println ( " Mobile Model Name : " + m_m_name ) ;
        System.out.println ( " Mobile Colour : " + m_colour );
        System.out.println ( " Mobile Cost : " + m_cost );

    // 2. Car
        System.out.println ( "2>" );
        System.out.println ( " Car Model : " + c_model ) ;
        System.out.println ( " Car Type : " + c_type ) ;
        System.out.println ( " Cost of CAR : " + c_cost ) ;

    // 3. School
        System.out.println ( "3>" );
        System.out.println ( " School Name : "+s_name);
        System.out.println ( " School Grade : "+s_grade);
        System.out.println ( " School Strength : "+s_str);

    // 4. Tv
        System.out.println ( "4>" );
        System.out.println ( " TV Model : "+tv_brand);
        System.out.println ( " TV type : "+tv_type);
        System.out.println ( " Cost of TV : "+tv_cost);

    // 5. Bike
        System.out.println ( "5>" );
        System.out.println ( " Bike Model : "+b_brand) ;
        System.out.println ( " Bike Colour : "+b_colour) ;
        System.out.println ( " Cost of Bike : "+b_cost) ;

    // 6. Course
        System.out.println ( "6>") ;
        System.out.println ( " Course name : "+course_name) ;
        System.out.println ( " Unvir name : "+unvir_name);
        System.out.println ( " Exam cost : "+exam_cost) ;

    // 7. Laptop
        System.out.println ( "7>" );
        System.out.println ( " Laptop Brand name : "+L_brand) ;
        System.out.println ( " Laptop Model : "+L_name) ;
        System.out.println ( " Cost of Laptop : "+L_cost) ;

    // 8. Home
        System.out.println ( "8>" );
        System.out.println ( " Home Name : "+h_name) ;
        System.out.println ( " Home Colour : "+h_colour) ;
        System.out.println ( " Home Cost : "+h_cost) ;

    // 9. Empolyee
        System.out.println ( "9>" );
        System.out.println ( " Empolyee ID : "+emp_id) ;
        System.out.println ( " Employee Salary : "+emp_sal) ;
        System.out.println ( " Employee Grade : "+emp_grade) ;

    // 10. Cloth
        System.out.println ( "10>" );
        System.out.println ( " Cloth Colour : "+cloth_colour) ;
        System.out.println ( " Cloth Cost : "+cloth_cost) ;
        System.out.println ( " Cloth Size : "+cloth_size) ;
    }
}