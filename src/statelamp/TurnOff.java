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
public class TurnOff implements State{

    @Override
    public void press(LampContext context) {
        System.out.print("Lamp from Off ");
        context.setState(new TurnOn());
        System.out.println("to On");
    }
    
}
