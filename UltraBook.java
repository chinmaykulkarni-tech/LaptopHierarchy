/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptophierarchy;
/**
 *
 * @author chinmay-kulkaruntu
 */
public class UltraBook extends LaptopHierarchy {
    private boolean isfingerprint;
    private boolean istouchscreen;

    public UltraBook(java.lang.String name,int storage,int ram,boolean isthin,int batterytime,String brand,boolean isfingerprint, boolean istouchscreen) {
        super(name,storage,ram,isthin,batterytime,brand);
        this.isfingerprint = isfingerprint;
        this.istouchscreen = istouchscreen;
    }

    @Override
    public String toString() {
  return  " \n isfingerprint=" + isfingerprint + "\n touchscreen "+ istouchscreen+"";
    }

    public void setIsfingerprint(boolean isfingerprint) {
        this.isfingerprint = isfingerprint;
    }

    public void setIstouchscreen(boolean istouchscreen) {
        this.istouchscreen = istouchscreen;
    }

    public boolean isIsfingerprint() {
        return isfingerprint;
    }

    public boolean isIstouchscreen() {
        return istouchscreen;
    }
  
    
}
