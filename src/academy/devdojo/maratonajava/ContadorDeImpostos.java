//Estou apenas aprendendo, esse é um contador de impostos de Netherlands em 2020 ;)
package academy.devdojo.maratonajava;
import java.text.DecimalFormat;

public class ContadorDeImpostos {
    public static void main(String[] args) {
      double salario = 10000;
      double porcentagem1 = 9.70;
      double porcentagem2 = 37.35;
      double porcentagem3 = 49.50;
        DecimalFormat ncd = new DecimalFormat("#.##");

        if (salario <= 34712){
           double imposto = salario*porcentagem1/100;
            System.out.println("O imposto total pago ao ano com o salario de "+salario+"R$ é de "+(ncd.format(imposto))+"R$");
        } else if (salario > 34712 && salario < 68507) {
            double imposto = salario*porcentagem2/100;
            System.out.println("O imposto total pago ao ano com o salario de "+salario+"R$ é de "+(ncd.format(imposto))+"R$");
        }else{
            double imposto = salario*porcentagem3/100;
            System.out.println("O imposto total pago ao ano com o salario de "+salario+"R$ é de "+(ncd.format(imposto))+"R$");
        }

    }
}
