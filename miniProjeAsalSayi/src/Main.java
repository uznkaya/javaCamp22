public class Main {

    public static void main(String[] args) {
	    int number = 3, checker = 0;
        if(number <= 1) {
            System.out.println("Sayi ya gecersizdir ya da 1dir.");
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    checker = 1;
                }
            }
            if(checker == 0){
                System.out.println("Asal sayidir.");
            }
            else{
                System.out.println("Asal sayi degildir.");
            }
        }
    }
}
