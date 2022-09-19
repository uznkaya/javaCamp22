public class Main {

    public static void main(String[] args) {
	    char secilenHarf = 'Ö';
        char[] kalinHarf = {'A','I','O','U'};
        char[] inceHarf = {'E','İ','Ö','Ü'};
        for(char harf:kalinHarf){
            if(secilenHarf==harf){
                System.out.println("Secilen harf kalindir.");
            }
        }
        for(char harf2:inceHarf){
            if(secilenHarf == harf2){
                System.out.println("Secilen harf incedir.");
            }
        }
    }
}
