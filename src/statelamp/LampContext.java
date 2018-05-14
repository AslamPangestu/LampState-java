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
public class LampContext {
    private State state;

    public LampContext() {
        this.state = new TurnOff();
    }
    
    public void turn(){
        state.press(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
}
