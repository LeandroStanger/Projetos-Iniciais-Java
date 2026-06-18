public class Aula3 {
    public String a = null, b = null, c = null;
    public double d = 0.00, e = 0.00, f = 0.00;

    public void main(String [] args){
    a = "Ola mundo!";
    b = "Ola mundo!";
    c = "Ola";
    //b = a = c;
    d = 3.14;
    e = 6.28;
    d = e;

    if(a.equals(b) && c != b){
        System.out.printf("%s e igual a %s\n", a, b);
    }else if(a.equals(b) && b.equals(c)){
     System.out.printf("%s egual a %s e %s egual a %s\n", a, b, b, c);   
    }else{
        System.out.printf("Nada e igual a nada!!!\n");
    }
    }
}
