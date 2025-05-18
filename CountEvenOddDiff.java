import java.util.Scanner;

class Digits 
{
    public int countDiff(int iNo)
     {
        if (iNo < 0) 
        {
            iNo = -iNo;
        }

        int iEven = 0, iOdd = 0;

        while (iNo > 0) 
        {
            int iDigit = iNo % 10;

            if (iDigit % 2 == 0) 
            {
                iEven = iEven + iDigit;
            } 
            else 
            {
                iOdd = iOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        return iEven - iOdd;
    }
}

public class CountEvenOddDiff 
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iValue = scanner.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.countDiff(iValue);

        System.out.println(iRet);

        scanner.close();
    }
}
