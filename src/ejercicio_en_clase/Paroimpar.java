package ejercicio_en_clase;

public class Paroimpar {
    int n; 
    public Paroimpar (int n){
        this.n = n;
    }
    public int Parimpar(){
        this.n = n;
        if (n%2==0){
            System.out.println("El número "+n+ " es par");
        }else if (n%2!=0){
            System.out.println("El número "+n+ " es impar");
        }else{
            System.out.println("El número ingresado es 0");
        }
        
        return n;
    }
    public int negpos(){    
        this.n = n;
        if (n > 0){
            System.out.println("Es positivo");
        }else if(n <0){
            System.out.println("Es negativo");
        }else
            System.out.println("El numero es 0");
        return n;
    }
    public int primo(){
        int a = 0;
        this.n =n;
        for (int i =1; i<= n; i++){
            if (n%i==0){
                a++;
            }
        }if (a ==2){
            System.out.println("El número "+n+" es primo");
        }else{
            System.out.println("El número "+n+" no es primo");
        }
        return n;
    }
}

