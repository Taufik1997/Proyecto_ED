/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arlf;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Persona {
    char[] nombre = new char[40];
    char[] birthday = new char[9];
    float salario;
    int id;

    public Persona(String nombre, String birthday, float salario, int id) {
        for (int i = 0; i < nombre.length(); i++) {
            this.nombre[i] = nombre.charAt(i);
        }
        for (int i = 0; i < birthday.length(); i++) {
            this.birthday[i] = birthday.charAt(i);
        }
        this.salario = salario;
        this.id = id;
    }

    public Persona() {
    }
    
    
    
    void read(RandomAccessFile raf) throws IOException {
        char[] temp = new char[40];
        for (int i = 0; i < temp.length; i++)
            temp[i] = raf.readChar();
        nombre = temp;
        temp = new char[9];
        for (int i = 0; i < temp.length; i++)
            temp[i] = raf.readChar();
        birthday = temp;
        salario = raf.readFloat();
        id = raf.readInt();     
  }

  void write(RandomAccessFile raf) throws IOException {
    StringBuffer sb;
    if (nombre != null)
        sb = new StringBuffer(String.valueOf(nombre));
    else
        sb = new StringBuffer();

    sb.setLength(40);
    raf.writeChars(sb.toString());
    
    if (birthday!= null)
        sb = new StringBuffer(String.valueOf(birthday));
    else
        sb = new StringBuffer();

    sb.setLength(9);
    raf.writeChars(sb.toString());
    
    raf.writeFloat(salario);
    raf.writeInt(id);    
  }

    public char[] getNombre() {
        return nombre;
    }

    public void setNombre(char[] nombre) {
        this.nombre = nombre;
    }

    public char[] getBirthday() {
        return birthday;
    }

    public void setBirthday(char[] birthday) {
        this.birthday = birthday;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

}
