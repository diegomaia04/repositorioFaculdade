package lista04;

import java.util.Scanner;


public class Ex07 {

    
    public static void main(String[] args) {
        double p,v,np,au,di;
        Scanner e = new Scanner (System.in);
        System.out.println("Insira o preço e vendas mensais :\n");
        p=e.nextDouble();
        v=e.nextDouble();
        au=0;
        di=0;
        if(p<30&&v<500){
            au=0.1*p;
        }else if ((p>=30 && p<80)&&(v>=500 && v<1200)){
            au=0.15*p;
        }else{
            di=0.2*p;
        }
        np=p+au-di;
        System.out.println("novo preço:"+ np);
        }
    }
