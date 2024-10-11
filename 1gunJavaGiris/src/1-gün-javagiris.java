public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double dolarDun = 8.15;
        double dolaBugun = 8.20;
        int vade = 36;
        boolean dustuMu = false;
        System.out.println("internetSubeButonu");
        
        if (dolarDun>dolaBugun) {
            System.out.println("Dolar düştü resmi");
        }else {
            System.out.println("Dolar yükseldi resmi");
        }

        String kredi1 ="Hızlı Kredi";
        String kredi2 = "Mutlu emekli kredisi";
        String kredi3 = "Konut kredisi";
        String kredi4 = "Çiftçi kredisi";
        String kredi5 = "Msb kredisi";
        String kredi6 = "Meb kredisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println(kredi6);
        
        String[] krediler = 
        {
                            "Hızlı Kredi", 
                            "Mutlu emekli kredisi",
                            "Konut kredisi",
                            "Çiftçi kredisi",
                            "Msb kredisi",
                            "Meb kredisi"
                        };
        for(String kredi : krediler) {
            System.err.println(kredi);
        }
        
        for(int i = 0 ; i<krediler.length;i++) {
            System.err.println(krediler[i]);
        }

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);
        
        int[] sayilar1 = {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40,50};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);


        String sehir1 = "Ankara";
        String sehir2 = "İstanbul";
        sehir1 = sehir2;
        sehir2 = "İzmir";
        System.out.println(sehir1);
    }
}
