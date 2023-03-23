package day02_recap;

public class Q07_SwitchCase {
    public static void main(String[] args) {
         /*
            gunleri gösterebilen bir program yazın
            gun Pazartesi veya Sali ise:
            Java dersi gunleri
            gun Persembe veya Cuma ise:
            Selenyum dersi gunleri
            gun carsamba veya cumartesi ise:
            SQL dersi gunleri
            aksi halde: izin gunu
            (if deyimini KULLANMAYIN)
        */
        String gun="Pazar";
        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("java dersi gunleri ");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");


        }





    }
}
