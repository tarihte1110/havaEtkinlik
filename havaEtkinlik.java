import java.util.Scanner;
public class havaEtkinlik {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Hava sıcaklığını santigrat derece cinsinden giriniz:");
        int heat=input.nextInt();

        if(heat<5){
            System.out.print("Kayak yapmayı tercih edebilirsiniz.");
        }
        else if(heat>=5 && heat<10){
            System.out.print("Sinemaya gitmeyi tercih edebilirsiniz.");
        }
        else if(heat>=10 && heat<=15){
            System.out.println("Sinemaya ya da pikniğe gitmeyi tercih edebilirsiniz.");
        }
        else if(heat>15 && heat<=25){
            System.out.print("Pikniğe gitmeyi tercih edebilirsiniz.");
        }
        else if(heat>25){
            System.out.print("Yüzmeyi tercih edebilirsiniz.");
        }
        else{
            System.out.print("Hatalı giriş yaptınız!");
        }


    }
}
