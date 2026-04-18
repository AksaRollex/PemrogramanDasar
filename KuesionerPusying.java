import java.util.Scanner;

public class KuesionerPusying {

    public static void main(String[] args) {

        /*
         * jadi disini adalah tahap awal saya pemecahan, dari yang awalnya itu soal dari
         * bu pradita, lalu masukan dari bu pradita, lalu saya pecahkan kasusnya
         * berdasarkan studi kasus yang bisa saya nalar
         */

        // -------------- analisis pribadi --------------
        /*
         * pertanyaan : program menargetkan 10 responden untuk mengisi kuesioner. setiap
         * responden
         * mengisi akan menambah jumlah data. namun, jika waktu survei selesai,
         * pengisian dihetikan walaupun belum mencapai target.
         * 
         * wajib ada percabangan dan looping (harus ada ini seperti yang ada di soal)
         * 
         * pov : di satu tempat terdapat 10 responden, ibarat 1 device ini digunakan
         * mengisi kuesioner oleh 10 responden, tetapi devicenya digunakan bergantian,
         * dan ketika mengisi setiap responden nanti terdapat waktu 15detik untuk
         * mengisi beberapa pertanyaan yang telah disediakan, jika tidak tidak
         * menyelesaikan pertanyaan yang telah disediakan, maka nanti akan terdapat
         * track berapa pertanyaan yang terjawab dari beberapa pertanyaan, lalu akan
         * melanjutkan ke responden berikutnya.
         * // (ini analogi saya jika waktu limit, jadi 1 device ini akan digunakan untuk
         * beberapa responden, jadi nanti waktu bisa habis dan ada responden yang akan
         * tidak kebagian mengisi ataupun ada responden yang mengisi tetapi belum
         * tuntas, dikarenakan sistemnya adlaah saya menyediakan waktu untuk saya dan
         * waktu untuk responden)
         * 
         * analisis :
         * - 10 responden
         * - variabel : no responden, nama, alamat, umur, nomor telepon, pendidikan,
         * waktu pengisian, jumlah pertanyaan yang terjawab, jumlah pertanyaan, status.
         * 1 responden = 15 detik * 10 responden = 150 detik = 2 menit 30 detik
         * waktu sela saya = 2 menit 30 detik
         * waktu selalu running meskipun dalam proses percabangan ke responden
         * berikutnya
         * // (analisis variabel apa saja yang sekiranya dibutuhkan)
         * 
         * output yang saya inginkan :
         * 
         * -----------------------------------
         * nama peneliti = aksa
         * -----------------------------------
         * pada kesempatan kali ini, kamu hanya ditargetkan untuk mengisi
         * 10 responden dengan waktu yang telah ditentukan
         * 
         * (clear terminal)
         * -----------------------------------
         * waktu pengisian pertanyaan tersisa : 7 detik tersisa
         * waktu peneliti tersisa : 2 menit 18 detik tersisa
         * -----------------------------------
         * nomor responden = 1
         * nama responden = budi
         * alamat = jakarta
         * umur = 20
         * nomor telepon = 08123456789
         * pendidikan = sma
         * jumlah pertanyaan yang terjawab = 3/5
         * status = selesai
         * 
         * percabangan : ingin melanjutkan ke responden berikutnya atau tidak, jika iya
         * maka akan melanjutkan ke responden berikutnya, jika tidak maka akan
         * menghentikan program dan menampilkan data yang telah diisi oleh responden
         * yang telah mengisi kuesioner
         * 
         * nomor responden = 10
         * nama responden = budi
         * alamat = jakarta
         * umur = 20
         * nomor telepon = 08123456789
         * pendidikan = sma
         * jumlah pertanyaan yang terjawab = 3/5
         * status = selesai
         * 
         * jumlah responden yang berhasil mengisi kuesioner dengan lengkap = 7 responden
         * jumlah responden yang tidak berhasil mengisi kuesioner dengan lengkap = 3
         * responden
         * // jadi ini adalah gambaran kasar untuk output yang saya inginkan...
         * 
         * }
         */

        Scanner input = new Scanner(System.in);

        // ini deklarasi variabel yang telah saya improvasasi juga berdasarkan yang
        // dibutuhkan, jadi saya learn by doing
        int total_responden = 10; // total responden seperti pada soal yang telah disediakan bu pradita
        int no_responden = 1; // no responden di default mulai dari 1
        int jumlah_pertanyaan = 5; // jumlah pertanyaan disini aku default 5 soal dan tidak bisa lebih, karena
                                   // nanti 1 responden mengisi 5 pertanyaan dan mengisi biodata, dimana waktunya
                                   // adalah 15 detik dan tidak memungkinkan kalau pertanyaannya banyal

        int berhasil = 0; // jumlah responden yang berhasil mengisi kuesioner dengan lengkap alias
                          // pertanyaan 1-5
        int tidak_selesai = 0; // jumlah responden yang berhasil mengisi kuesioner tetapi tidak lengkap alias
                               // tidak berhasil menjawab pertanyaan 5/5
        int gagal_total = 0; // jumlah responden yang tidak berhasil mengisi kuesioner sama sekali
                             // dikarenakan waktu peneliti habis -> alhasil prorgram akan berhenti

        boolean lanjutProgram = true; // ini untuk kondisi nanti apakah ingin melanjutkan ke responden berikutnya atau
                                      // tidak

        System.out.print("Nama peneliti = "); // nama peneliti, kan saya mengibaratkan mengisi kuesioner nya di 1 device
                                              // dan nanti akan digunakan bersama-sama untuk 10 responden
        String nama = input.nextLine(); // input nama dari peneliti
        System.out.println("Hai " + nama + ", selamat datang menjadi peneliti di Kuesioner Simpel!");
        System.out.print("-----------------------------------");
        System.out.println("\nTarget: 10 responden | 150 detik untuk peneliti | 15 detik untuk responden");
        System.out.println("-----------------------------------");
        // 4 baris diatas adalah teks biasa alias teks penjelas aja untuk teknisnya
        // bagaimana

        long waktuMulaiPeneliti = System.currentTimeMillis();
        long batasPeneliti = 150000;
        // batas waktu peneliti ini 150detik, dan seharusnya para responden nanti itu
        // 15detik per responden... jadi waktu memungkinkan habis sebelum 150 detik
        // untuk 10 responden

        do {

            boolean waktuHabis = false; // default waktu habis ini ketika nanti waktunya habis maka dia jadi true dan
                                        // otomatis menghentikan program
            boolean pesanWaktuSudahTampil = false; // ini pesan untuk ketika waktu sudah habis, maka akan menampilkan
                                                   // pesan waktu habis

            long sisaPeneliti = (batasPeneliti - (System.currentTimeMillis() - waktuMulaiPeneliti)) / 1000;
            // sisa waktu peneliti ini diambil dari perhitungan dari batas peneliti yang
            // 150detik itu lalu dikurangin waktu mulai peneliti... jadi ini sistemnya
            // pengurangran
            System.out.println("Sisa waktu peneliti: " + sisaPeneliti + " detik");
            System.out.print("-----------------------------------");
            System.out.println("\n===== RESPONDEN " + no_responden + " =====");

            // BIODATA RESPONDEN
            System.out.print("Nama = ");
            input.nextLine();

            System.out.print("Alamat = ");
            input.nextLine();

            System.out.print("Umur = ");
            input.nextLine();

            System.out.print("No HP = ");
            input.nextLine();

            while (true) {
                System.out.print("Pendidikan (kuliah/sma) = ");
                String pendidikan = input.nextLine();

                if (pendidikan.equalsIgnoreCase("kuliah")) {
                    System.out.print("Kuliah dimana = ");
                    input.nextLine();
                    break;
                } else if (pendidikan.equalsIgnoreCase("sma")) {
                    System.out.print("SMA dimana = ");
                    input.nextLine();
                    break;
                } else {
                    System.out.println("|| Input tidak valid! ||");
                }
            } // jadi ini kalau inputan pendidikan itu selain dari kuliaha tau sma, maka ini
              // akan looping terus... jadi tidak ada data yang invalid nanti... jadi akan
              // selesai loopingnya ketika variabel pendidikan sudah menerima nilai kuliah
              // atau sma

            if (System.currentTimeMillis() - waktuMulaiPeneliti >= batasPeneliti) {
                // jika waktu mulai peneliti ini sudah sama dengan batas peneliti, otomatis
                // waktu yang tersisa kan sudah tidak ada, alias program harus berhenti karena
                // waktu sudah habis
                if (!pesanWaktuSudahTampil) {
                    System.out.print("-----------------------------------");
                    System.out.println("Waktu peneliti habis!");
                    System.out.print("-----------------------------------");
                    pesanWaktuSudahTampil = true;
                }
                gagal_total++;
                break;
            }

            // PERTANYAAN RESPONDEN
            long waktuMulaiResponden = System.currentTimeMillis();
            long batasResponden = 15000; // batas waktu maksimal untuk responden mengerjakan adalah 15detik, jadi
                                         // perhitungan waktu responden ini dimulai ketika setelah mengisi biodata alias
                                         // ketika ingin menjawab pertanyaan 1-5

            int terjawab = 0;

            System.out.println("-----------------------------------");
            System.out.println("Sisa waktu peneliti: " + sisaPeneliti + " detik");
            System.out.print("-----------------------------------");
            System.out.println("\n--- PERTANYAAN (15 detik) ---");

            long sisaWaktu;
            sisaWaktu = (batasResponden - (System.currentTimeMillis() - waktuMulaiResponden)) / 1000; // dibagi 1000
                                                                                                      // untuk mengubah
                                                                                                      // dari milidetik
                                                                                                      // ke detik
            // jadi ini analogi ketika sisa waktu masih ada, maka proses kuesioner masih
            // bisa dilanjutkan, tetapi jika sisa waktu responden ini sudah habis, maka
            // sudah tidak bisa mengisi/menjawab pertanyaan-pertanyaan yang telah disediakan

            // Pertanyaan 1
            if (System.currentTimeMillis() - waktuMulaiPeneliti >= batasPeneliti) {
                if (!pesanWaktuSudahTampil) {
                    System.out.println("Waktu peneliti habis!");
                    pesanWaktuSudahTampil = true;
                }
                waktuHabis = true;
            }
            if (sisaWaktu <= 0) {
                waktuHabis = true;
            } else {
                System.out.println("Sisa waktu: " + sisaWaktu + " detik");
                System.out.print("Pertanyaan 1 : Apa warna favoritmu? ");
                String soal1 = input.nextLine();

                if (!soal1.isEmpty()) { // ini ketika soal berhasil terjawab alias tidak kosong, maka variabel terjawab
                                        // ini bertambah 1, dimana fungsinya adlaah utnuk memtrack berapa soal yang
                                        // terjawab dari 5 soal yang telah disediakan
                    terjawab++;
                }
            }
            // jadi analogi untuk soal 1-5 ini ketika waktu masih ada alias masih tersisa,
            // maka pertanyaan maish bisa dijawab, lalu jika sisawaktunya itu sudah 0, maka
            // nilai dari variabel waktuhabis ini langsung di isi dengan niali true.
            // dimana waktuhabis itu true, maka akan otomatis menghentikan program

            // Pertanyaan 2
            if (System.currentTimeMillis() - waktuMulaiPeneliti >= batasPeneliti) {

                if (!pesanWaktuSudahTampil) {
                    System.out.println("Waktu peneliti habis!");
                    pesanWaktuSudahTampil = true;
                }

                waktuHabis = true;
            }
            if (!waktuHabis) {
                sisaWaktu = (batasResponden - (System.currentTimeMillis() - waktuMulaiResponden)) / 1000;
                if (sisaWaktu <= 0) {
                    waktuHabis = true;
                } else {
                    System.out.println("Sisa waktu: " + sisaWaktu + " detik");
                    System.out.print("Pertanyaan 2 : Apakah kamu menikah? ");
                    String soal2 = input.nextLine();

                    if (!soal2.isEmpty()) {
                        terjawab++;
                    }
                }
            }

            // Pertanyaan 3
            if (System.currentTimeMillis() - waktuMulaiPeneliti >= batasPeneliti) {
                if (!pesanWaktuSudahTampil) {
                    System.out.println("Waktu peneliti habis!");
                    pesanWaktuSudahTampil = true;
                }
                waktuHabis = true;
            }
            if (!waktuHabis) {
                sisaWaktu = (batasResponden - (System.currentTimeMillis() - waktuMulaiResponden)) / 1000;
                if (sisaWaktu <= 0) {
                    waktuHabis = true;
                } else {
                    System.out.println("Sisa waktu: " + sisaWaktu + " detik");
                    System.out.print("Pertanyaan 3 : Apakah kamu pingin kaya? ");
                    String soal3 = input.nextLine();

                    if (!soal3.isEmpty()) {
                        terjawab++;
                    }
                }
            }

            // Pertanyaan 4
            if (System.currentTimeMillis() - waktuMulaiPeneliti >= batasPeneliti) {
                if (!pesanWaktuSudahTampil) {
                    System.out.println("Waktu peneliti habis!");
                    pesanWaktuSudahTampil = true;
                }
                waktuHabis = true;
            }
            if (!waktuHabis) {
                sisaWaktu = (batasResponden - (System.currentTimeMillis() - waktuMulaiResponden)) / 1000;
                if (sisaWaktu <= 0) {
                    waktuHabis = true;
                } else {
                    System.out.println("Sisa waktu: " + sisaWaktu + " detik");
                    System.out.print("Pertanyaan 4 : Apakah kamu memiliki tujuan hidup? ");
                    String soal4 = input.nextLine();

                    if (!soal4.isEmpty()) {
                        terjawab++;
                    }
                }
            }

            // Pertanyaan 5
            if (System.currentTimeMillis() - waktuMulaiPeneliti >= batasPeneliti) {
                if (!pesanWaktuSudahTampil) {
                    System.out.println("Waktu peneliti habis!");
                    pesanWaktuSudahTampil = true;
                }
                waktuHabis = true;
            }
            if (!waktuHabis) {
                sisaWaktu = (batasResponden - (System.currentTimeMillis() - waktuMulaiResponden)) / 1000;
                if (sisaWaktu <= 0) {
                    waktuHabis = true;
                } else {
                    System.out.println("Sisa waktu: " + sisaWaktu + " detik");
                    System.out.print("Pertanyaan 5 : Apakah kamu ganteng? ");
                    String soal5 = input.nextLine();

                    if (!soal5.isEmpty()) {
                        terjawab++;
                    }
                }
            }

            // --- STATUS ---
            String status = (waktuHabis || terjawab < jumlah_pertanyaan) // status ini ketika waktu habis atau jumlah
                                                                         // pertanyaan yang terjawab itu tidak sessuai
                                                                         // atau tidak sama dengan jumlah pertanyaan
                                                                         // yang disediakan, maka nilainya akan tidak
                                                                         // selesai
                                                                         // waktu habis / yang terjawab < 5 = tidak
                                                                         // selesai
                                                                         // tapi kalau waktu tidak habis / yang terjawab
                                                                         // = 5, maka nilainya selesai
                    ? "TIDAK SELESAI"
                    : "SELESAI";

            if (waktuHabis) { // nilai waktu habis ini ketika waktu habis itu true, maka akan menampilkan
                              // pesan waktu habis
                System.out.println("Waktu habis, responden tidak selesai.");
            }

            // ini adalah ketika responden yang mendapatkan status "selesai", maka akan
            // otomatis menambahkan data ke variabel berhasil, jadi hitungannya adalah
            // ketika selesai maka ada yang berhasil
            if (status.equals("SELESAI"))
                berhasil++;
            else
                tidak_selesai++;
            // dan ketika responden tidak mendapatkan status "selesai", maka akan otomatis
            // menambahkan data ke variabel tidak_selesai

            System.out.println("\nTerjawab: " + terjawab + "/" + jumlah_pertanyaan); // ini untuk menampilkan berapa
                                                                                     // pertanyaan yang terjawab dari
                                                                                     // jumlah pertanyaan yang
                                                                                     // disediakan
            System.out.println("Status  : " + status); // ini untuk menampilkan status dari responden apakah selesai
                                                       // atau tidak selesai
            System.out.println("-----------------------------------");

            // --- LANJUT ---
            do {
                System.out.print("Lanjut ke responden berikutnya? (ya/tidak) = ");
                String lanjut = input.nextLine();
                System.out.println("-----------------------------------");

                if (lanjut.equalsIgnoreCase("ya")) {

                    long sisaPenelitiCek = (batasPeneliti - (System.currentTimeMillis() - waktuMulaiPeneliti)) / 1000;

                    if (sisaPenelitiCek <= 0) {
                        System.out.println("Waktu peneliti habis!");
                        System.out.println("-----------------------------------");

                        lanjutProgram = false;

                        gagal_total = total_responden - (berhasil + tidak_selesai);

                        break;
                    }
                    // ini jika waktu peneliti masih ada, maka masih bisa untuk melanjutkan ke
                    // responden berikutnya, tetapi jika waktu peneliti sudah habis, maka program
                    // akan berhenti dan menampilkan pesan waktu habis

                    no_responden++;
                    break;
                } else if (lanjut.equalsIgnoreCase("tidak")) {

                    lanjutProgram = false;

                    gagal_total = total_responden - (berhasil + tidak_selesai);

                    break;
                }
            } while (true);

        } while (lanjutProgram && no_responden <= total_responden); // jalankan program selagi var lanjutprogram masih
                                                                    // true dan no_responden belum setara alias nilainya
                                                                    // belum sama dengan total responden (5=5)
        // jadi ini looping akan melanjutkan ke responden berikutnya atau tidak, nah
        // yang seperti sudah saya bilang tadi... kalau inputan percabangan ini selain
        // ya atau tidak, maka akan terus looping di pertanyaan ini terus hingga
        // memenuhi nilai yang ditentukan

        // --- REKAP ---
        System.out.println("===== HASIL AKHIR =====");
        System.out.println("Berhasil              = " + berhasil);
        System.out.println("Tidak selesai         = " + tidak_selesai);
        System.out.println("Tidak sempat mengisi  = " + gagal_total);
        System.out.println("========================");
        System.out.println("Terima kasih, " + nama);
        // ini rekap data yang saya inginkan, dimana rekap data ini akan menampilkan
        // jumlah responden yang berhasil mengisi kuesioner dengan lengkap, jumlah
        // responden yang tidak berhasil mengisi kuesioner dengan lengkap, dan jumlah
        // responden yang tidak sempat mengisi kuesioner karena waktu peneliti habis

        input.close();

        /*
         * kesimpulan proyek // ini tadi saya merekam kesimpulannya.. tapi malah yang ke
         * record beda windows
         * 
         * 1. tahap 1 - menginput peneliti (yang membantu mengisi ke-10 responden)
         * - waktu di declare 150detik untuk peneliti
         * - waktu di declare 15detik untuk setiap responden
         * 
         * looping pertanyaan kuliah/sma (jika input selain itu, maka akan meminta input
         * ulang)
         * looping pertanyaan lanjut ke responden berikutnya (jika input selain itu,
         * maka akan meminta input ulang)
         * 
         * (ketika waktu peneliti habis, maka akan menghentikan program (baik saat
         * mengisi biodata maupun saat menjawab pertanyaan))
         * 
         * jika waktu habis dan responden belum menyelesaikan pengisian biodata maupun
         * menjawab pertanyaan, apakah lanjut/tidak
         * jika waktu peneliti habis, maka akan langsung menampilkan track atau rekap
         * data kuesioner
         * 
         * 2. tahap 2 - responden mengisi biodata (nama, alamat, umur, nomor telepon,
         * pendidikan)
         * 
         * 3. tahap 3 - responden menjawab pertanyaan (5 pertanyaan)
         * 
         * rekap data terdiri dari :
         * - jumlah responden yang berhasil mengisi kuesioner dengan lengkap
         * - jumlah responden yang belum selesai mengisi kuesioner
         * - jumlah responden yang tidak sempat mengisi kuesioner karena waktu peneliti
         * habis
         * 
         * ** note : sisa waktu peneliti itu terlihat sama tetapi aslinya terus
         * berjalan, jadi ini bug display bukan bug logic maupun timernya
         */
    }
}