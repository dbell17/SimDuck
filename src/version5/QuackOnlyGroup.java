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
public interface QuackOnlyGroup extends Duck{
    public abstract void setQuackBehavior(QuackBehavior qb);
    public abstract void performQuack();
    
}
