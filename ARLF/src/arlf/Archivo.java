package arlf;

import java.io.IOException;
import java.io.RandomAccessFile;



public class Archivo {
    String file = "./archivoRegistros.txt";

    public String getfile() {
        return file;
    }

    public void setfile(String file) {
        this.file = file;
    }
   
    private byte[] read(String filePath, int position, int size) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "r");
        Persona temp;
     
    }

    private static void write(String filePath, String data, int position) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
        randomAccessFile.seek(position);
        randomAccessFile.write(data.getBytes());
        randomAccessFile.close();
    }

}