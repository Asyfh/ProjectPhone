/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectphonetrial;

/**
 *21103001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */

    public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}