public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean kontrol = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                kontrol = true;
                break;
            }
        }
        if (kontrol) {
            System.out.println("Aranan sayi dizide mevcuttur");
        } else {
            System.out.println("Sayi mevcut degildir.");
        }
    }
}
