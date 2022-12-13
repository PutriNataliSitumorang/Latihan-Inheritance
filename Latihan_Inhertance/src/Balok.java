/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public class Balok extends PersegiPanjang {
    
  
    private int tinggi;
    public void setTinggi(int t){
        tinggi=t;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int Volume(){
        int v=getPanjang()*getLebar()*tinggi;
    return v;
    
}


}