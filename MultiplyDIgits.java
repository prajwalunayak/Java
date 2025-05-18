import java.util.Scanner;

class Digits 
{
    public int multiplyDigits(int iNo) 
    {
        if (iNo < 0) 
        {
            iNo = -iNo;
        }
        int iMult = 1;

        while (iNo > 0) 
        {
            int iDigit = iNo % 10;
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }

        return iMult;
    }
}

public class MultiplyDigits 
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iValue = scanner.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.multiplyDigits(iValue);

        System.out.println(iRet);

        scanner.close();
    }
}
