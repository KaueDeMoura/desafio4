import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class assassinato {
    public static void main(String[] args){
    
        char resposta;
        int qtde=0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Voce sabe de algo?");
    System.out.println("Responda todas as perguntas com 'S' para SIM ou 'N' para NÃO\n");
    System.out.println("Voce telefonou para a vitima?");
    resposta = sc.nextLine().charAt(0);
    if(resposta == 's' || resposta == 'S'){
        qtde++;
    } else{}
    System.out.println("Voce esteve no local do crime?");
    resposta = sc.nextLine().charAt(0);
    if(resposta == 's' || resposta == 'S'){
        qtde++;
    } else{}
    System.out.println("Voce mora perto da vitima?");
    resposta = sc.nextLine().charAt(0);
    if(resposta == 's' || resposta == 'S'){
        qtde++;
    } else{}
    System.out.println("Devia algo para a vitima?");
    resposta = sc.nextLine().charAt(0);
    if(resposta == 's' || resposta == 'S'){
        qtde++;
    } else{}
    System.out.println("Voce já trabalhou com a vitima?");
    resposta = sc.nextLine().charAt(0);
    if(resposta == 's' || resposta == 'S'){
        qtde++;
    } else{}

    if (qtde <= 1){
        System.out.println("Voce é inocente!");
    }
    if (qtde == 2){
        System.out.println("Voce é suspeito do crime e continuaremos com mais ivestigações.");
    }
    if (qtde == 3 || qtde == 4){
        System.out.println("Voce é cumplice");
    }
    if (qtde == 5){
        System.out.println("Voçe esta preso!");
    }

    }
}
