class Ex2
{
    public static void main(String [] args)
    {
        {
            int a=10;
            int b=30;
            {
                // ex 1
                {
                    if ((a<=b||a!=b)&&(a<b)){
                        System.out.println("yes a is less than b");
                    } else {
                        System.out.println("b is greater than a");
                    }
                }

                // ex 2
                {
                    if (a==b){
                        System.out.println("hello");
                    } else {
                        System.out.println("hey!!");
                    }
                }

                // ex 4
                {
                    if ((a<=b&&a==b)&&a!=b){
                        System.out.println(a+b);
                    } else {
                        System.out.println(a-b);
                    }
                }
            }
        }

        // ex 3
        {
            int marks=28;
            if (marks>37)
            {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }

        // ex 5
        {
            int a=1;
            int b=10;
            if (true){
                System.out.println(a+a);
            } else {
                System.out.println(b+b);
            }
        }

        // ex 7
        {
            int a=7;
            int b=a;
            int c=b;
            if (a==b||b==c&&a<=c){
                System.out.println("Hello good morning");
            } else if (a<b&&b<=c&&a==c) {
                System.out.println("hey good evening");
            }
        }

        // ex 8
        {
            int no=21;
            if (no%3==0&&no%7==0){
                System.out.println("Fizz buzz");
            } else if (no%3==0) {
                System.out.println("fizz fuzz");
            } else if (no%7==0) {
                System.out.println("Bizz Buzz");
            } else {
                System.out.println("invalid number");
            }
        }

        // ex 9
        {
            int no=16;
            if (no%2==0&&no%8==0){
                System.out.println("yes it divisible");
            } else if (no%2==0) {
                System.out.println("yes its divisible by 2");
            } else if (no%8==0) {
                System.out.println("yes it divisible by 8");
            } else {
                System.out.println("invalid number");
            }
        }

        // ex 10
        {
            int amt=6000;
            if (amt>2000){
                if (amt>5000){
                    System.out.println("premium version");
                } else {
                    System.out.println("normal version");
                } 
            } else {
                System.out.println("go to home");
            }
        }

        // ex 6abcd
        {
            Ex6.logic(10, 20, 40);
            Ex6.logic(30, 35, 29);
            Ex6.logic(25, 20, 0);
            Ex6.logic(30, 25, 29);
        }
    }
}

class Ex6
{
    static void logic(int a, int b, int c)
    {   
        if (a>b && a>c) {
            System.out.println("a is larger");
        } else if (b>c) {
            System.out.println("b is larger");
        } else {
            System.out.println("c is larger");
        }
    }

    static void logic(int a, int b)
    {
        int c=a+b;
        if (a>b && a>c) {
            System.out.println("a is larger");
        } else if (b>c) {
            System.out.println("b is larger");
        } else {
            System.out.println("c is larger");
        }
    }
}