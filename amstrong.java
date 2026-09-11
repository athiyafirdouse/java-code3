import java.utilpublic class amstrong {
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the number");
   int num = sc.nextInt();
    
   int original = num;
   int sum =0;

   while(num>0)
   {
    int digit = num % 10;
    sum = sum + (digit * digit * digit);
    num = num /10;
   }
   if(sum==original)
   {
    System.out.println("armstrong number");
   }
   else
   {
    System.out.println("not armstrong number");
   }
    sc.close();
}

