package br.com.henriqueandrew.prova;

// @author Henrique Andrew da Silva
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercicio10 {

    public static final boolean arquivo(File documento, String texto) throws FileNotFoundException, IOException, ClassNotFoundException {
        if (documento.exists() && documento.canRead()) {
            ObjectInputStream objInput = null;
            FileInputStream fileInput = null;
            Object obj = null;

            System.out.println("Arquivo já existe: " + documento.getAbsoluteFile());

            fileInput = new FileInputStream(documento);
            objInput = new ObjectInputStream(fileInput);
            obj = objInput.readObject();

        } else if (documento == null) {
            BufferedWriter buf = new BufferedWriter(new FileWriter("C:\\TESTE\\exercicio10.txt"));
            buf.write(texto + "\n");
            buf.close();
            System.out.println("Arquivo criado!!!");

        }
        return true;
    }

}
