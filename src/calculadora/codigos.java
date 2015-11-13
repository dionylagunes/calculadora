package calculadora;
public class codigos {
    int a=0,b=0,c=0,d=0,cont,con;
    
    codigos(){
        for(a=0;a!=10;a++){ 
            for(b=0;b!=10;b++){
                for(c=0;c!=10;c++){
                    for(d=0;d!=10;d++){cont++;
                    System.out.println(" "+a+" "+b+" "+c+" "+d);
                    }
                }
            }
        }
    }
    public void convinaciones(){
        con=10*10*10*10;
        System.out.println("convinaciones posibles "+con);
    }
    public static void main(String[] args) {
        codigos g= new codigos();
        g.convinaciones();
    }
}
