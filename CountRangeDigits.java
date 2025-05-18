import java.util.Scanner;

class Digits
 {
    public int countRange(int iNo) 
    {
        if (iNo < 0) 
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        while (iNo > 0) 
        {
            int iDigit = iNo % 10;
            if (iDigit > 3 && iDigit < 7) 
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

public class CountRangeDigits 
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iValue = scanner.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.countRange(iValue);

        System.out.println(iRet);

        scanner.close();
    }
}
