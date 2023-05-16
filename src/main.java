

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("\ninserire i dati: marca,modello,prezzo,pollici,ram,touch\n");

        String in1 = scan.nextLine();
        String in2 = scan.nextLine();
        double in3 = scan.nextInt();
        double in4 = scan.nextInt();
        int in5 = scan.nextInt();
        boolean in6 = scan.nextBoolean();

        telefono t1 = new telefono(in1,in2,in3,in4,in5,in6);
        System.out.println();
        t1.stampa();
        System.out.println(t1.fasciaPrezzo(in3));
        System.out.println(t1.tipotelefono(in4));
        
        System.out.println();
        telefono t2 = new telefono();
        t2.stampa();
        System.out.println(t2.fasciaPrezzo(t2.getPrezzoLancio()));
        System.out.println(t2.tipotelefono(t2.getPollici()));




    }
    
}

