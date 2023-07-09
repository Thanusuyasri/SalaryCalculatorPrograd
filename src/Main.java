import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] Dayhr=new int[7];
        int weekhr=0;
        int[] dalycharge=new int[7];
        for(int iterator=0;iterator<7;iterator++)
        {
            Dayhr[iterator]= scanner.nextInt();
            weekhr+=Dayhr[iterator];
        }
        int weekpay=0,weekextra=0;
        for(int iterator=1;iterator<6;iterator++)
        {
            if(Dayhr[iterator]>8)
            {
                int extra=(Dayhr[iterator]-8)*115;
                dalycharge[iterator]=extra+800;
            }
            else{
                dalycharge[iterator]=Dayhr[iterator]*100;
            }
            weekpay+=dalycharge[iterator];
        }
        dalycharge[0]=Dayhr[0]*150;
        dalycharge[6]=Dayhr[6]*125;
        weekpay+=dalycharge[0]+dalycharge[6];
        weekhr=weekhr-Dayhr[0]-Dayhr[6];
        if(weekhr>40)
        {
            int extra=(weekhr-40)*125;
            weekextra=(40*100)+extra;
        }
        System.out.println(weekpay+weekextra);

    }
}