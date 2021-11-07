package javainterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public  abstract class Ball implements Tossable {
    private String brandname;
    public Ball(String brandname)
    {
        this.brandname=brandname;
    }
    @Override
    public void toss() {

    }
    public String getBrandname() {
        return brandname;
    }
    public void bouncel()
    {
    
     
    
    }
}
