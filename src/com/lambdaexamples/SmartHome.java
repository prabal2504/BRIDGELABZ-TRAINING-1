package com.lambdaexamples;

interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {

        // Motion detected
        LightAction motionLight = () ->
                System.out.println("Motion detected: Hall lights turned ON");

        // Night mode
        LightAction nightLight = () ->
                System.out.println("Night mode: Dim bedroom lights activated");

        // Voice command
        LightAction voiceCommandLight = () ->
                System.out.println("Voice command: All lights turned OFF");

        motionLight.activate();
        nightLight.activate();
        voiceCommandLight.activate();
    }
}
