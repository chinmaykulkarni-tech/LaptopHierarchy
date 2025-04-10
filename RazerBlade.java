/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptophierarchy;

/**
 *
 * @author chinmay-kulkarni-ubuntu
 */
public class RazerBlade extends Gaming  {
    private int threadcore;

    public RazerBlade(int threadcore, String name, int storage, int ram, boolean isthin, int batterytime, String brand, boolean isdedicatedgpu, String coolingtechnology) {
        super(name, storage, ram, isthin, batterytime, brand, isdedicatedgpu, coolingtechnology);
        this.threadcore = threadcore;
    }

    public int getThreadcore() {
        return threadcore;
    }

    public void setThreadcore(int threadcore) {
        this.threadcore = threadcore;
    }

    @Override
    public String toString() {
        return "RazerBlade{" + "threadcore=" + threadcore + '}';
    }
    
    
}
