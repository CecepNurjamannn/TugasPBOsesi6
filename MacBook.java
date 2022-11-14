/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2sesi6.newpackage;

/**
 *
 * @author Lenovo
 */
public class MacBook implements Laptop {
    private int volume;
    boolean is_power_on;

    public MacBook(){
        this.volume = 80;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("MacBook Air");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process ...");
    }

    @Override
    public void volumeUp() {
        if(is_power_on){
            if(this.volume==MAX_VOL){
                System.out.println("Volume is Full ");
            }
            else{
                this.volume += 10;
                System.out.println("Volume is : " + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("Volume is 0% ");
            }
            else{
                this.volume -= 10;
                System.out.println("Volume is : " + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
}
