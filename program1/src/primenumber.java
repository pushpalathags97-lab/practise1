public class primenumber
{
    public static void main(String[] args) {
        int n = 7, i;
        for (i = 2; i < n; i++)
            if (n % i == 0) break;

        System.out.println(i == n ? "Prime" : "Not Prime");
    }
}

