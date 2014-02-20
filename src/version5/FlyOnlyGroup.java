/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author dbell17
 */
public interface FlyOnlyGroup extends Duck {
    public abstract void setFlyBehavior(FlyBehavior fb);
    public abstract void performFly();
}
