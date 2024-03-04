import com.sun.tools.javac.Main;

public class kucingg{
    public String nama = "jamal";
    public int anggota = 3;
    public int umur = 3;
    public void namahewan(){
        System.out.println("Nama : "+ nama);
    }
    public void anggota (){
        System.out.println("anggota kucing : "+ anggota);
    }
    public void umur (){
        System.out.println("umur : "+ umur);
    }

    public static void main(String[] args) {
        kucingg cat = new kucingg();
        cat.namahewan();
        cat.anggota();
        cat.umur();
    }
}
