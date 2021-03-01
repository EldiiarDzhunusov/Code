using System;

namespace project1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[4] { 1, -2, 3, 4 };
            foreach(int i in arr)
            {
                if (i >= 0)

                {
                    Console.Write($"{i} ");
                }
            }
            Console.WriteLine();
        }    
    }
}
