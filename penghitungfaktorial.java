import java.util.Scanner;

public class penghitungfaktorial {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("masukkan angka untuk dihitung faktorialnya: ");
    int angka=input.nextInt();
    int faktorial=1;
    for(int A=1;A<=angka;A++){
        faktorial=faktorial*A;
    }
    System.out.println("faktorial dari "+angka+" adalah: "+faktorial);
}    
}