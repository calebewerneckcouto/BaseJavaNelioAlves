package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {
        float impostoSalario = 0;
        float impostoServico = 0;
        float impostoCapital = 0;
        float totalImpostoBruto;
        float totalImpostoLiquido;
        float salarioAnual;
        float prestacaoServico;
        float ganhoCapital;
        float gastosMedicos;
        float gastosEducacionais;
        float abatimentoMaximo;
        float gastosDedutiveis;
        float abatimentoReal;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Renda anual com salário:");
        salarioAnual = sc.nextFloat();

        System.out.println("Renda anual com prestação de serviço:");
        prestacaoServico = sc.nextFloat();

        System.out.println("Renda anual com ganho de capital:");
        ganhoCapital = sc.nextFloat();

        System.out.println("Gastos Médicos:");
        gastosMedicos = sc.nextFloat();

        System.out.println("Gastos Educacionais:");
        gastosEducacionais = sc.nextFloat();

        sc.close();

       
        float salarioMensal = salarioAnual / 12;
        if (salarioMensal < 3000) {
            impostoSalario = 0;
        } else if (salarioMensal < 5000) {
            impostoSalario = salarioAnual * 0.10f;
        } else {
            impostoSalario = salarioAnual * 0.20f;
        }

      
        impostoServico = prestacaoServico * 0.15f;

        
        impostoCapital = ganhoCapital * 0.20f;

        
        totalImpostoBruto = impostoSalario + impostoServico + impostoCapital;

        
        abatimentoMaximo = totalImpostoBruto * 0.30f;

        
        gastosDedutiveis = gastosMedicos + gastosEducacionais;

       
        abatimentoReal = Math.min(abatimentoMaximo, gastosDedutiveis);

       
        totalImpostoLiquido = totalImpostoBruto - abatimentoReal;

      
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", abatimentoMaximo);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", totalImpostoBruto);
        System.out.printf("Abatimento: %.2f%n", abatimentoReal);
        System.out.printf("Imposto devido: %.2f%n", totalImpostoLiquido);
    }
}
