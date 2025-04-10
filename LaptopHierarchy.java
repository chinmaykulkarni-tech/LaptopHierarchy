/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laptophierarchy;

/**
 *
 * @author chinmay-kulkarni-ubuntu
 */
public class LaptopHierarchy {
    private java.lang.String name;
    private int  storage;
    private int  ram;
    private boolean isthin;
    private int batterytime;
    private String brand;

    public LaptopHierarchy(java.lang.String name, int storage, int ram, boolean isthin, int batterytime, String brand) {
        this.name = name;
        this.storage = storage;
        this.ram = ram;
        this.isthin = isthin;
        this.batterytime = batterytime;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public int  getStorage() {
        return storage;
    }

    public int  getRam() {
        return ram;
    }

    public boolean isIsthin() {
        return isthin;
    }

    public int  getBatterytime() {
        return batterytime;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStorage(short storage) {
        this.storage = storage;
    }

    public void setRam(byte ram) {
        this.ram = ram;
    }

    public void setIsthin(boolean isthin) {
        this.isthin = isthin;
    }

    public void setBatterytime(byte batterytime) {
        this.batterytime = batterytime;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "LaptopHierarchy " + "\n name=" + name + "\n storage=" + storage +"GB"+ "\n ram=" + ram +"GB"+ "\n isthin=" + isthin + "\n batterytime=" + batterytime +"hrs"+ "\n brand=" + brand + "";
    }

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LaptopHierarchy l1=new LaptopHierarchy("Acer-Aspire-lite",1000,16,true,8,"Acer");
        System.out.println(l1);
         UltraBook u1=new UltraBook("Acer-Aspire-lite",1000,16,true,8,"Acer",true,true);
         System.out.println(u1);
         MacBook m1=new MacBook("Acer-Aspire-lite",1000,16,true,8,"Acer",true,true,true,true);
         System.out.println(m1);
         Gaming g=new Gaming("Aceer-Aspire-lite",1000,16,true,8,"Acer",true,"1234xgpu");
         System.out.println(g);
         RazerBlade r=new RazerBlade(10,"Acer-Aspire-lite",1000,16,true,8,"Acer",true,"1234xgpu");
         System.out.println(r);
    
    }
    
}
