// Data Set: Kode yang diajukan oleh Author
public class JohnTravoltaKasus {
    public static void main(String[] args) {
        int jamKerja = 52; 
        int rate = 15000;
        int pengeluaran = 600000;
        double gaji;
        
        if (jamKerja > 40) {
            int lembur = jamKerja - 40;
            gaji = (40 * rate) + (lembur * rate * 1.5);
        } else {
            gaji = jamKerja * rate;
        }
        
        if (gaji > pengeluaran) {
            System.out.println("bisa menabung");
            System.out.println("Tabungan: " + (gaji - pengeluaran));
        } else if (gaji == pengeluaran) {
            System.out.println("tidak bisa menabung");
        } else {
            System.out.println("cari tambahan"); 
        }
    }
}
