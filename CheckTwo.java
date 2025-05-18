import java.util.Scanner;

class Digits 
{
    public int checkTwo(int iNo) 
    {
        if (iNo < 0) 
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        while (iNo > 0) 
        {
            int iDigit = iNo % 10;
            if (iDigit == 2) 
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }

}


    public class CheckTwo
    {
        public static void main(String A[]) 
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iValue = scanner.nextInt();
        int bRet = 0;

        
        Digits nobj = new Digits();
        bRet = nobj.checkTwo(iValue);

       // int iRet = CheckTwo(iValue);
        System.out.println(bRet);
        
        }
    }
    

