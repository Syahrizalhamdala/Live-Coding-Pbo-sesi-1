public class Mobil{
    String Merk;
    String Warna;
    int Kecepatan;
    boolean Menyala;

    public Mobil(String Merk,String Warna){
        this.Merk = Merk;
        this.Warna = Warna;
        this.Kecepatan = Kecepatan;
        this.Menyala = false;
    }

    public void nyala(){
        Menyala = true;
        System.out.println("Mobil Menyala");
    }

    public void mati(){
        Menyala = false;
        System.out.println("Mobil belum Menyala");
    }

    public void gas(){
        if (Menyala == false){
            return;
        }
        Kecepatan += 5;
        System.out.println("Kecepatan " + Kecepatan + "Km/Jam");
    }

    public void rem(){
         if (Menyala == false){
            return;
        }
        Kecepatan -= 5;{
            if (Kecepatan <= 0){
                Kecepatan = 0;
            }
        }
        
    }

    public void info(){
        System.out.println("Merk " + Merk);
        System.out.println("Warna " + Warna);
        System.out.println("Kecepatan " + Kecepatan);
        System.out.println("Menyala " + Menyala);
    }

}