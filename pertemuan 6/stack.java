package pertemuan6;


public class stack {
  kaos top;
    public stack(){
        top=null;
    }
    public void push(kaos a){
        if(top==null) top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    public void pop(){
        if(top==null) System.out.println("kosong");
        else{
            System.out.println("Hapus Stock Baru. . .");
            top.view();
            top=top.next;
        }
    }
    public void isEmpty() {
        if (top == null) System.out.println("Stock Habis");
        else {
            System.out.println("Stock Tersedia");
        }
    }

    public void view(){
        if(top==null) System.out.println("kosong");
        else{
            kaos ptr=top;
            while(ptr!=null){
                System.out.println("- - - - -");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }

 
}
