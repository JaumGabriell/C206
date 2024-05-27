package Exceções;

import java.io.FileNotFoundException;

public class Checked extends Exception{
    public Checked(String message){
        super(message);
    }
}
