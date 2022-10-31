package day03IfStatement;

import java.util.Scanner;

public class C04MantikOperatorleri {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
        System.out.println("ilk sayiyi girin");
        double a= unit.nextDouble();
        System.out.println("ikinci sayiyi girin");
        double b= unit.nextDouble();
        System.out.println("Toplama islemi icin 1 e\n Cikarma islemi icin 2 ye\n carpma islemi icin 3 e\n bolme islmemi icin 4 e\n basiniz...");
int sonuc= unit.nextInt();
if (sonuc==1){
    double islem=a+b;
    System.out.println("sonuc = " + islem);
}
else if (sonuc==2){
            double islem2=a-b;
            System.out.println("sonuc = " + islem2);
        }
else if (sonuc==3){
    double islem3=a*b;
    System.out.println("sonuc = " + islem3);
}
else if (sonuc==4){
    double islem4=a/b;
    System.out.println("sonuc = " + islem4);
}
else {
    System.out.println("gecerli bir sayi giriniz");

}

    }
}
