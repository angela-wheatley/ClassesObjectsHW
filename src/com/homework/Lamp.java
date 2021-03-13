package com.homework;

public class Lamp
{
    private boolean on;
    private String powerType;
    private String energySource;
    
    public Lamp ()
    {
        on = false;
        powerType = "battery";
        energySource = "batteries";
    }
    
    public Lamp (boolean on, String powerType)
    {
        this.on = on;
        this.powerType = powerType;
    }
    
    public Lamp (boolean on, String powerType, String energySource)
    {
        this.on = on;
        this.powerType = powerType;
        this.energySource = energySource;
    }
    
    public boolean isOn()
    {
        return on;
    }
    
    public void setOn(boolean on)
    {
        this.on = on;
    }
    
    public String getPowerType ()
    {
        return powerType;
    }
    
    public void setPowerType(String powerType)
    {
        this.powerType = powerType;
    }
    
    public String getEnergySource()
    {
        return energySource;
    }
    
    public void setEnergySource(String energySource)
    {
        this.energySource = energySource;
    }
    
    boolean willLampTurnOn()
    {
        if(powerType.equals("plug") && energySource.equals("outlet"))
        {
            return true;
        }
        else if(powerType.equals("battery") && energySource.equals("batteries"))
        {
            return true;
        }
        return false;
    }
    
    String turnLampOff()
    {
        if(on = false)
        {
            String alreadyOff = "The lamp is off.";
            return alreadyOff;
        }
        String turnOff = "Turn that lamp off!";
        return turnOff;
    }

}
