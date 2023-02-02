package org.example;


import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws InterruptedException {
            System.out.println("Ordu Giresun Havalimanı'na hoş geldiniz.");

            String sartlar =  "Herhangi bir siyasi yasağınız bulunmamalı. \n"
                             +"Yurt dışına çıkış kuralları... \n"
                             +"Herhangi bir siyasi yasağınız bulunmamalı. \n"
                             +"15 TL ödemenizin tamını yatırmış olmalısınız. \n"
                             +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor. \n";
            String mesaj = "Yurt dışı çıkış şartlarının hepsini sağlamanız gerekiyor";

            while (true) {
                System.out.println("--------------------------------------------------");
                System.out.println(sartlar);
                System.out.println("--------------------------------------------------");
                Yolcu yolcu = new Yolcu();

                System.out.println("Bakiyeniz kontrol ediliyor.");

                Thread.sleep(3000);
                if (yolcu.yurtDisiBakiyeKontrol() == false) {
                    //System.out.println(mesaj);
                    tekrar("Evet");
                    continue;
                }
                System.out.println("Siyasi yasak kontrol ediliyor.");
                Thread.sleep(3000);

                if (yolcu.siyasiYasakKontrol() == false) {
                    //System.out.println(mesaj);
                    tekrar("Evet");
                    continue;
                }
                System.out.println("Vize durumu kontrol ediliyor");
                Thread.sleep(3000);

                if (yolcu.vizeDurumuKontrol() == false) {
                    //System.out.println(mesaj + "\n");
                    tekrar("Evet");

                }
                System.out.println("Yurt dışına çıkabilirsiniz");
                break;
            }

        }

        public static void tekrar(String s) {
            System.out.println("Tekrar denemek ister misiniz?");
            Scanner scanner = new Scanner(System.in);
            String tekrarlamak = scanner.nextLine();

            if (tekrarlamak.equalsIgnoreCase(s)) {

            }

        }


    }

