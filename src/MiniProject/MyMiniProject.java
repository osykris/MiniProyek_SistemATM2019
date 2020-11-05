/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class MyMiniProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin;
        int nominalUang = 0;
        int kodeBankdannorekeningTujuan = 0;
        int bahasa;
        int menu;

        System.out.println("Pilih Bahasa/Select Language");
        System.out.println("=========================================");
        System.out.println("1. Bahasa Indonesia");
        System.out.println("2. English");
        System.out.println("=========================================");
        bahasa = sc.nextInt();
        if (bahasa == 1) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Masukkan pin Anda: ");
            pin = sc.nextInt();
            if (pin == 200006) {
                System.out.println("Pilihan Menu Transaksi");
            } else {
                System.out.println("Masukkan pin Anda: ");
                pin = sc.nextInt();
                System.out.println("Pilihan Menu Transaksi");
            }
            System.out.println("=========================================");
            System.out.println("1. Cek Saldo\t4. Ganti Pin");
            System.out.println("2. Transfer\t5. Keluar");
            System.out.println("3. Tarik Tunai");
            System.out.println("=========================================");
            menu = sc.nextInt();
            if (menu == 2) {
                System.out.println("Bank Tujuan");
                System.out.println("=========================================");
                System.out.println("1. BNI");
                System.out.println("2. Bank Lain");
                System.out.println("=========================================");
                menu = sc.nextInt();
                if (menu == 2) {
                    System.out.println("Masukkan Kode Bank + Nomor Rekening Tujuan(Contoh: 00290000000000)\t: ");
                    kodeBankdannorekeningTujuan = sc.nextInt();
                    System.out.println("Masukkan Jumlah Nominal Uang Transfer\t\t\t\t\t: ");
                    nominalUang = sc.nextInt();
                    System.out.println("Mohon untuk menunggu...");
                    System.out.println("=========================================");
                    System.out.println("------------Rincian Pemesanan------------");
                    System.out.println("Pengerimina ke");
                    System.out.println("Nomor Rekening\t\t: " + kodeBankdannorekeningTujuan);
                    System.out.println("Sebesar\t\t\t: " + nominalUang);
                    System.out.println("Selamat Transaksi Anda Telah Berhasil!");
                    System.out.println("=========================================");
                    System.out.println("Terimakasih telah menggunakan jasa ATM BNI :) Kartu ATM Anda dapat diambil");
                } else if (menu == 1) {
                    System.out.println("Masukkan Kode Bank + Nomor Rekening Tujuan(Contoh: 00290000000000)\t: ");
                    kodeBankdannorekeningTujuan = sc.nextInt();
                    System.out.println("Masukkan Jumlah Nominal Uang Transfer\t\t\t\t\t: ");
                    nominalUang = sc.nextInt();
                    System.out.println("Mohon untuk menunggu...");
                    System.out.println("=========================================");
                    System.out.println("------------Rincian Pemesanan------------");
                    System.out.println("Pengerimina ke");
                    System.out.println("Nomor Rekening\t\t: " + kodeBankdannorekeningTujuan);
                    System.out.println("Sebesar\t\t\t: " + nominalUang);
                    System.out.println("Selamat Transaksi Anda Telah Berhasil!");
                    System.out.println("=========================================");
                    System.out.println("Terimakasih telah menggunakan jasa ATM BNI :) Kartu ATM Anda dapat diambil");
                }
            } else if (menu == 5) {
                System.out.println("Terimakasih telah menggunakan jasa ATM BNI :) Kartu ATM Anda dapat diambil");
            } else if (menu == 1) {
                System.out.println("Menu yang Anda masukkan tidak tersedia:)");
            } else if (menu ==  3) {
                System.out.println("Menu yang Anda masukkan tidak tersedia:)");
            } else if (menu == 4) {
                 System.out.println("Menu yang Anda masukkan tidak tersedia:)");
            }
        } else if (bahasa == 2) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter your pin: ");
            pin = sc.nextInt();
            if (pin == 200006) {
                System.out.println("Transaction Menu Options");
            } else {
                System.out.println("Enter your pin: ");
                pin = sc.nextInt();
                System.out.println("Transaction Menu Options");
            }
            System.out.println("=========================================");
            System.out.println("1. Balance check\t4. Change Pin");
            System.out.println("2. Transfer\t\t5. Exit");
            System.out.println("3. Cash Withdrawal");
            System.out.println("=========================================");
            menu = sc.nextInt();
            if (menu == 2) {
                System.out.println("Bank of Destination");
                System.out.println("=========================================");
                System.out.println("1. BNI");
                System.out.println("2. Other Banks");
                System.out.println("=========================================");
                menu = sc.nextInt();
                if (menu == 2) {
                    System.out.println("Enter the Bank Code + Destination Account Number (Example: 00290000000000)\t: ");
                    kodeBankdannorekeningTujuan = sc.nextInt();
                    System.out.println("Enter the Nominal Amount of Money Transfer\t\t\t\t\t: ");
                    nominalUang = sc.nextInt();
                    System.out.println("Please wait ...");
                    System.out.println("=========================================");
                    System.out.println("--------------Order Details--------------");
                    System.out.println("Receiver to");
                    System.out.println("Account number\t\t: " + kodeBankdannorekeningTujuan);
                    System.out.println("As big as\t\t: " + nominalUang);
                    System.out.println("Congratulations Your Transaction Has Been Successful!");
                    System.out.println("=========================================");
                    System.out.println("Thank you for using BNI ATM services :) Your ATM card can be collected");
                } else if (menu == 1) {
                    System.out.println("Enter the Bank Code + Destination Account Number (Example: 00290000000000)\t: ");
                    kodeBankdannorekeningTujuan = sc.nextInt();
                    System.out.println("Enter the Nominal Amount of Money Transfer\t\t\t\t\t: ");
                    nominalUang = sc.nextInt();
                    System.out.println("Please wait ...");
                    System.out.println("=========================================");
                    System.out.println("--------------Order Details--------------");
                    System.out.println("Receiver to");
                    System.out.println("Account number\t\t: " + kodeBankdannorekeningTujuan);
                    System.out.println("As big as\t\t: " + nominalUang);
                    System.out.println("Congratulations Your Transaction Has Been Successful!");
                    System.out.println("=========================================");
                    System.out.println("Thank you for using BNI ATM services :) Your ATM card can be collected");
                }
            } else if (menu == 5) {
                System.out.println("Thank you for using BNI ATM services :) Your ATM card can be collected");
            } else if (menu == 1) {
                System.out.println("The menu you entered is not available :)");
            } else if (menu ==  3) {
                System.out.println("The menu you entered is not available :)");
            } else if (menu == 4) {
                 System.out.println("The menu you entered is not available :)");
            }
        }
    }
}
