/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelamp;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mvryan
 */
public class StateLampMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader( System.in );
        LampContext lampContext = new LampContext();
        while (true) {
            System.out.print( "Press 'Enter'" );
            is.read();
            lampContext.turn();
        }
    }
    
}
