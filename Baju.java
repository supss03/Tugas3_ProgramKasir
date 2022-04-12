package ErigoStoreMalang;

public class Baju {
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;
    final int diskonA = 5000;
    final int diskonB = 5000;
    final int diskonC = 15000;
    int harga, hargaDiskon;

    public void totalHarga(String jenisBaju, int jmlBaju){
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Jenis baju: " + jenisBaju + "," +
                " Jumlah baju: " + jmlBaju + ".");

        if (jenisBaju.equalsIgnoreCase("A")) {
            System.out.print("Diskon: Rp");
            if (jmlBaju >= 100) {
                System.out.println(diskonA);

                hargaDiskon = bajuA - diskonA;
                System.out.println("Harga per buah: Rp" + hargaDiskon);
            }
            else {
                System.out.println("0");
                System.out.println("Harga per buah: Rp" + bajuA);
            }

            System.out.print("Total harga: Rp" + hargaA(jmlBaju));
        }
        else if (jenisBaju.equalsIgnoreCase("B")) {
            System.out.print("Diskon: Rp");
            if (jmlBaju >= 100) {
                System.out.println(diskonB);

                hargaDiskon = bajuB - diskonB;
                System.out.println("Harga per buah: Rp" + hargaDiskon);
            }
            else {
                System.out.println("0");
                System.out.println("Harga per buah: Rp" + bajuB);
            }

            System.out.print("Total harga: Rp" + hargaB(jmlBaju));
        }
        else if (jenisBaju.equalsIgnoreCase("C")) {
            System.out.print("Diskon: Rp");
            if (jmlBaju >= 100) {
                System.out.println(diskonC);

                hargaDiskon = bajuC - diskonC;
                System.out.println("Harga per buah: Rp" + hargaDiskon);
            }
            else {
                System.out.println("0");
                System.out.println("Harga per buah: Rp" + bajuC);
            }

            System.out.print("Total harga: Rp" + hargaC(jmlBaju));
        }
    }

    int hargaA(int jmlBaju){
        if (jmlBaju >= 100) {
            harga = (bajuA * jmlBaju) - (diskonA * jmlBaju);
        }
        else {
            harga = (bajuA * jmlBaju);
        }
        return harga;
    }

    int hargaB(int jmlBaju){
        if (jmlBaju >= 100) {
            harga = (bajuB * jmlBaju) - (diskonB * jmlBaju);
        }
        else {
            harga = (bajuB * jmlBaju);
        }
        return harga;
    }

    int hargaC(int jmlBaju){
        if (jmlBaju >= 100) {
            harga = (bajuC * jmlBaju) - (diskonC * jmlBaju);
        }
        else {
            harga = (bajuC * jmlBaju);
        }
        return harga;
    }

}
