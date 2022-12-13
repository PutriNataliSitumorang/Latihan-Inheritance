/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public class PersegiPanjang {
    
    private int panjang;
    private int lebar;
    public void setPanjang(int p){
        panjang=p;
    }
    public void setLebar(int l){
        lebar=l;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int luas(){
        int luas =panjang*lebar;
        return luas;
    
}

}