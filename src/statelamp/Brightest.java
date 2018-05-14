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
public class Brightest implements State{

    @Override
    public void press(LampContext context) {
        System.out.print("Lamp from Brightest ");
        context.setState(new TurnOff());
        System.out.println("to Off");
    }
    
}
