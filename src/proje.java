import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz :");
        int miktar = input.nextInt();
        int a =1;
        int kucuk = 999999999,buyuk = -999999999;
        while(miktar>=a){
            System.out.print(a +". sayıyı giriniz");
            int n= input.nextInt();
            a++;
            System.out.print(a+". sayıyı giriniz ");
            int m = input.nextInt();
            a++;
            if(n<m && n<kucuk){
                kucuk = n;
            }
            else if (m<n && m<kucuk){
                kucuk=m;
            }
            if(n>m && n>buyuk){
                buyuk = n;
            }
            else if(m>n && m>buyuk){
                buyuk = m;
            }

        }
        System.out.println("En küçüğü :"+kucuk);
        System.out.println("En büyüğü :"+ buyuk);
    }
}
