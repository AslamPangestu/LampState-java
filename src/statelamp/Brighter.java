/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelamp;

/**
 *
 * @author mvryan
 */
public class Brighter implements State{

    @Override
    public void press(LampContext context) {
        System.out.print("Lamp from Brighter ");
        context.setState(new Brightest());
        System.out.println("to Brightest");
    }
    
}
