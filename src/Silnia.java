public class Silnia {
    static int result(int a)
    {
        if (a==0)
            return 1;
        else
        {
           return a * result(a-1);
        }
    }
}