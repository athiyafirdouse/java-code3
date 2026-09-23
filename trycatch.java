 class trycatch {
    public static int anyfunction(int x,int y)
    {
        try{
            int a = x/y;
            return a;
        }
    catch(ArithmeticException e)
    {
      System.out.println("division by zero");

    }
    return 0;
    }
    public static void main(String[] args) {
        int a=3,b=4,result;
      
        try{
            a=Integer.parseInt(args[a]);
            b= Integer.parseInt(args[b]);
            System.out.println("values of a and b = "+a+""+b);
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }
        result = anyfunction(a,b);
        System.out.println("\n RESULT : " + result);
    }
    
}
