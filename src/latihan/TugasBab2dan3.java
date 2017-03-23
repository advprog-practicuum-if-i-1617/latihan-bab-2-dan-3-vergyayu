public class TugasBab2dan3 {
    String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    String hasil = "";
    public void konversi(int angka) {
        if (angka < 12) {
            hasil = hasil + huruf[angka];
        } else if (angka> 12 && angka < 20) {
            hasil = hasil + huruf[angka - 10] + " Belas";
        } else if (angka > 20 && angka < 100) {
            hasil = hasil + huruf[angka / 10] + " Puluh " + huruf[angka % 10];
        } else if (angka == 100) {
            hasil = "Seratus";
        } else if (angka > 100 && angka < 200) {
            hasil = "Seratus " + huruf[(angka - 100) / 10] + " Puluh " + huruf[angka % 10];
        } else if (angka > 200 && angka < 1000) {
            hasil = hasil + huruf[angka / 100] + " Ratus " + huruf[angka % 10] + " Puluh " + huruf[angka % 10];
        } else if (angka == 1000){
            hasil = "Seribu";
        } else {
            hasil = "Angka yang anda masukkan salah";
        }
        System.out.println(hasil);
    }
    public void konversi(String kata) {
        int result = 0;
        if (kata.contains("Seribu")) {
            result = 1000;
        }
        else if (kata.contains("Seratus")) {
            result = 100;
        }
        else if (kata.contains("Sepuluh")) {
            result = 10;
        }
        else if (kata.contains("Sebelas")){
            result = 11;
        }
        else if (kata.contains("Seratus Sepuluh")){
            result = 110;
        }
        else if (kata.contains("Seratus Sebelas")){
            result = 111;
        }
        else if (kata.contains("Ratus") && kata.contains("Puluh")) {
            String bilangan[] = kata.split("(Ratus)|(Puluh)");
            for (int i = 0; i < huruf.length; i++) {
                if (bilangan[0].contains(huruf[i])) {
                    result = result + (i * 100);
                }
                else if (bilangan[1].contains(huruf[i])) {
                    result = result + (i * 10);
                }
                else if (bilangan[2].contains(huruf[i])) {
                    result = result + i;
                }
            }
        }
        else if (kata.contains("Ratus") && kata.contains("Belas")){
        String bilangan[] = kata.split("(Ratus)|(Belas)");
        for (int i =0; i<huruf.length;i++){
            if(bilangan[0].contains(huruf[i])){
                result = result + (i*100);
            } else if (bilangan[1].contains(huruf[i])){
                result = result + (i+10);
            }
        }
    }
        else if (kata.contains("Ratus") && kata.contains("Sebelas")) { 
            String bilangan[] = kata.split("(Ratus)|(Sebelas)");
            for (int i = 0; i < huruf.length; i++) {
                if (bilangan[0].contains(huruf[i])){
                    result = result + (i*100);
                }
                else if (bilangan[1].contains(huruf[i])){
                    result = (i-11);
                }
            }
        }
        else if (kata.contains("Ratus")) {
            String bilangan[] = kata.split("(Ratus)");
            for (int i = 0; i < huruf.length; i++) {
                if (bilangan[0].contains(huruf[i])) {
                    result = result + (i * 100);
                } else if (bilangan[1].contains(huruf[i])) {
                    result = (i-10);
                }
            }
        }
        if (kata.contains("Ratus")){
            String bilangan[]=kata.split("(Ratus)");
            for (int i=0;i<huruf.length;i++){
                if(bilangan[0].contains(huruf[i])){
                    result = result + (i*10);
                } else if (bilangan[1].contains(huruf[i])){
                    result = result + i;
                }
            }
        }
        else if(kata.contains("Seratus")&& kata.contains("Puluh")){
            String bilangan[] = kata.split("(Seratus)|(Puluh)");
            for (int i = 0; i < huruf.length; i++) {
                if (bilangan[0].contains(huruf[i])) {
                    result = result + (i * 100);
                } else if (bilangan[1].contains(huruf[i])) {
                    result = result + (i * 10);
                }
                else if (bilangan[2].contains(huruf[i])){
                    result = result + i;
                }
            }
        }
        else if (kata.contains("Seratus") && kata.contains("Belas")) {
            String bilangan[] = kata.split("(Seratus)|(Belas)");
            for (int i = 0; i < huruf.length; i++) {
                if (bilangan[0].contains(huruf[i])) {
                    result = result + (i * 100);
                } else if (bilangan[1].contains(huruf[i])) {
                    result = result + (i + 10);
                } 
            }
        } 
        else if (kata.contains("Seratus")){
            String bilangan[]=kata.split("(Seratus)");
            for (int i =0; i<huruf.length;i++){
                if(bilangan[0].contains(huruf[i])){
                    result = result + (i*100);
                } else if (bilangan[1].contains(huruf[i])){
                    result = result + i;
                }
            }
        }
        else if (kata.contains("Puluh")){
            String bilangan[]=kata.split("(Puluh)");
            for (int i =0; i<huruf.length;i++){
                if(bilangan[0].contains(huruf[i])){
                    result = result + (i*10);
                } else if (bilangan[1].contains(huruf[i])){
                    result = result + i;
                }
            }
        }
        else if (kata.contains("Belas")){
            String bilangan[]=kata.split("(Belas)");
            for (int i =0; i<huruf.length;i++){
                if(bilangan[0].contains(huruf[i])){
                    result = i+10;
                }
            }
        }
        else {
            for (int i =0; i<huruf.length;i++){
                if (kata.contains(huruf[i]));
                    result = (i-10);
                }
            }
        System.out.println(result);
    }
}