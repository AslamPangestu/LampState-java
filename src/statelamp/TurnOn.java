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
public class TurnOn implements State{

    @Override
    public void press(LampContext context) {
        System.out.print("Lamp from On ");
        context.setState(new Brighter());
        System.out.println("to Brighter");
    }
    
}
