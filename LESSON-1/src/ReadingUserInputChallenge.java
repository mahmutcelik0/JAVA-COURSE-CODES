import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void challengeSolution(){
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        int sumOfNumbers = 0;
        while(numberCount <10) {
            System.out.print("ENTER NUMBER #" + (numberCount + 1) + ":");
            boolean boolValue = scanner.hasNextInt();
            if (boolValue) {
                int number = scanner.nextInt();
                numberCount++;
                sumOfNumbers += number;
            } else {
                System.out.println("INVALID NUMBER");
                scanner.nextLine(); //EN ONEMLI KISIM
                /*scanner nesnesi içinde yukarıda değer saklanıyor döngü tekrar
                * döndüğünde önceki alınan değer duruyor if e girilirse o değer alınıyor
                * fakat else kısmında değer alınmadığı için hatalı durumda nextLine() ile
                * geçilmezse sonsuz döngüye giriliyor. nextLine() kullanılarak hatalı veri
                * scanner nesnesinden atlanır ve dongu tekrar dondugunde tekrar ınput alınır*/
            }
        }
        scanner.close();
        System.out.println("SUM OF NUMBERS: "+ sumOfNumbers);
    }






}