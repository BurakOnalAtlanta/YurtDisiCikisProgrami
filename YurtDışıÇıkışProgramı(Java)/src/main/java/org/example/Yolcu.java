package org.example;

import java.util.Scanner;

public class Yolcu implements YurtDisiKuralalri{

    private int bakiye;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harc bedeli: ");
        this.bakiye = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Herhangi bir siyasi yasağını bulunuyor mu? (Evet yada hayır)");

        String cevap = scanner.nextLine();

        if (cevap.equalsIgnoreCase("Evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }

        System.out.println("Vize yasağını bulunuyor mu? (Evet yada hayır)");

        String cevap2 = scanner.nextLine();

        if (cevap2.equalsIgnoreCase("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }



    }


    @Override
    public boolean yurtDisiBakiyeKontrol() {
        if (this.bakiye < 15) {
            System.out.println("Lütfen yurt dışı çıkış harcını tam yatırın.");
            return false;
        } else {
            System.out.println("Yurt dışı harcı işlemi tamamlandı");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Yurt dışına çıkamazsınız. Siyasi yasağınız bulunuyor");
            return false;
        } else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vizeniz bulunuyor. Yurt dışı çıkış izniniz artık var.");
            return true;
        } else {
            System.out.println("Vizeniz bulunmuyor. Yurt dışı çıkış izniniz yok.");
            return false;
        }
    }
}
