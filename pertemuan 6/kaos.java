package pertemuan6;

import java.util.Scanner;


public class kaos {
    String nama;
    kaos next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Merk kaos        : ");
        nama=str.nextLine();
        next=null;
    }
    public void view(){
        System.out.println("Stock kaos        : "+nama);
    }
    public static void main(String[] args) {
        int menu=0;
        stack st=new stack();
        while(menu!=5){
            System.out.print("1.Tambahkan stock kaos (push)\n2.Hapus stock kaos (pop)\n3.Lihat Stock (view)\n4.Cek Stock (isEmpty)\n5.Exit\n : ");
            menu=in.nextInt();
            if(menu==1){
                sepatu baru=new kaos();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) st.isEmpty();
            else if(menu==5) System.out.println("keluar . . .");
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }    
}
