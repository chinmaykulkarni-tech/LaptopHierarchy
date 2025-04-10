/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptophierarchy;

/**
 *
 * @author chinmay-kulkarni-ubuntu
 */
public class MacBook extends UltraBook{
private boolean isusbc;
private boolean isretinadisplay;

    public MacBook(java.lang.String name,int storage,int ram,boolean isthin,int batterytime,String brand,boolean isfingerprint,boolean istouchscreen,boolean isusbc, boolean isretinadisplay) {
        super(name,storage,ram,isthin,batterytime,brand,isfingerprint,istouchscreen);
        this.isusbc = isusbc;
        this.isretinadisplay = isretinadisplay;
    }

    public boolean isIsusbc() {
        return isusbc;
    }

    public boolean isIsretinadisplay() {
        return isretinadisplay;
    }

    public void setIsusbc(boolean isusbc) {
        this.isusbc = isusbc;
    }

    public void setIsretinadisplay(boolean isretinadisplay) {
        this.isretinadisplay = isretinadisplay;
    }

    @Override
    public String toString() {
        return" isusbc=" + isusbc + ", isretinadisplay=" + isretinadisplay + '}';
    }
    

}
