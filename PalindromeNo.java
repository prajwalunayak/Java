import java.util.Scanner;

class Digits
{
    public int DigitRev(int iNo)
    {
       int iDigit = 0, iRev = 0;
        while(iNo != 0)
        {
            iDigit = iNo%10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
}

class PalindromeNo
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your number");
        int iValue = sobj.nextInt();
        Digits dobj = new Digits();

        iRet = dobj.DigitRev(iValue);
       // System.out.println(iRet);

        if(iRet == iValue)
        {
            System.out.println("It is a Palindrome Number");
        }
        else
        {
            System.out.println("NOT a Palindrome Number");
        }
    }
}