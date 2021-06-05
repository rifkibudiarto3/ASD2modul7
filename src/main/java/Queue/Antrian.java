package Queue;

public class Antrian {
   private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumlah;
    private int depan;
    
    public Antrian(int data){
        ukuran = data;
        antrian = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumlah = 0;
    }
    
    public void masuk(long j){
        if (!isFull()){
            antrian[++belakang] = j;
            jumlah++;
        }
    }
    
    public long keluar(){
        long temp = antrian[0];
        if (!isEmpty()){
            for (int i=0; i<jumlah; i++)
                antrian[i] = antrian[i+1];
                jumlah--;
                belakang--;
            
        }
        return temp;
    }
    
    public long peekDepan(){
        return antrian [depan];
    }
    
    public boolean isEmpty(){
        return (jumlah==0);
    }
    
    public boolean isFull(){
        return (belakang==ukuran-1);
    }
    
    public int ukuran(){
        return jumlah;
    }
    
    public void lihat(){
     for (int i=0;i<jumlah; i++)
        System.out.print(antrian[i]+" ");
        System.out.println(" ");
    }
    }