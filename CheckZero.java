import java.util.Scanner;

class Digits
{
 public boolean checkZero(int iNo)
     {
        if (iNo < 0) {
            iNo = -iNo;
        }
        while (iNo > 0) 
        {
            int iDigit = iNo % 10;
            if (iDigit == 0)
            {
                return true;
            }
            iNo = iNo / 10;
        }
        return false;
    }
}

public class CheckZero 
{

    public static void main(String A[]) 
    {
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        Digits nobj = new Digits();
        bRet = nobj.checkZero(iValue);

        if (bRet == true) 
        {
            System.out.println("Contains Zero");
        } 
        else 
        {
            System.out.println("DOES NOT Contain Zero");
        }
       
    }
}
