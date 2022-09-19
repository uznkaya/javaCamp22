public class Main {

    public static void main(String[] args) {
	    String[] ogrenciler = new String[4];
        ogrenciler[0] = "Emincan";
        ogrenciler[1] = "Murat";
        ogrenciler[2] = "Mehmet Can";
        ogrenciler[3] = "Emincan Can";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
