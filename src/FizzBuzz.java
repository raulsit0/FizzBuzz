class FizzBuzz
{
    public static void main(String[] args)
    {
//for loop
        for (int i = 1 ; i <= 100; i++)
        {
//check if divisible by both 3 and 5
            if( i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
//check if divisible by 3
            else if(i % 3 ==0)
            {
                System.out.println("Fizz");
            }
//check if divisible by 5
            else if(i % 5 ==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
