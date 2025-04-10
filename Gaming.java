/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptophierarchy;

/**
 *
 * @author chinmay-kulkarni-ubuntu
 */
public class Gaming extends LaptopHierarchy {
    private boolean isdedicatedgpu;
    private String coolingtechnology;

    public Gaming(java.lang.String name, int storage, int ram, boolean isthin, int batterytime, String brand,boolean isdedicatedgpu,java.lang.String coolingtechnology) 
    {
        super(name, storage, ram, isthin, batterytime, brand);
        this.isdedicatedgpu = isdedicatedgpu;
        this.coolingtechnology = coolingtechnology;
    }

    public boolean isIsdedicatedgpu() {
        return isdedicatedgpu;
    }

    public String getCoolingtechnology() {
        return coolingtechnology;
    }

    public void setIsdedicatedgpu(boolean isdedicatedgpu) {
        this.isdedicatedgpu = isdedicatedgpu;
    }

    public void setCoolingtechnology(String coolingtechnology) {
        this.coolingtechnology = coolingtechnology;
    }

    @Override
    public String toString() {
        return "Gaming{" + "isdedicatedgpu=" + isdedicatedgpu + ", coolingtechnology=" + coolingtechnology + '}';
    }
    
}
