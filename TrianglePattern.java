//This program prints a Right Angle Triangle Star Pattern in Java

public class TrianglePattern {
    public static void main(String args[])
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}