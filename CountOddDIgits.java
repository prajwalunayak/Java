import java.util.Scanner;

class Digits 
{
    public int countOdd(int iNo) 
    {
        if (iNo < 0) 
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        while (iNo > 0) 
        {
            int iDigit = iNo % 10;
            if (iDigit % 2 != 0) {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

public class CountOddDigits 
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iValue = scanner.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.countOdd(iValue);

        System.out.println(iRet);

    }
}
