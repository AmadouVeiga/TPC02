import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        JFileChooser escolha = new JFileChooser(".");
        int res = escolha.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION){
            File fich = escolha.getSelectedFile();
           // System.out.println(fich.getAbsolutePath());
            Scanner ler = null;
            try {
                 ler = new Scanner(fich);
                ler.nextLine();
                 while (ler.hasNext()){

                     String linha =ler.nextLine();
                    // System.out.println(linha);


                     //separar os dados da linha
                     String[] sep = linha.split(";");
                     String nome = sep[0];
                     for (int[] i; linha;i++){
                         int notas =Integer.parseInt(sep[i]);
                     }
                      ;



                     Alunos alunos = new Alunos(nome, new int[]{notas});
                     //System.out.println(alunos);

                     // Colocar alunos na Lista
                     lista.inserir(alunos);

                 }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            finally {
                ler.close();
            }
            // listar a "lista"
            lista.listar();
        }
    }
}