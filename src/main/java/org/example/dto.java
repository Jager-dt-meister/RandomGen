package org.example;

public class dto
{
    private String str;
    private int intNumber;
    private double doubleNumber;
    private boolean bool;
    private char charS;
    private byte byteS;
    private float floatNumber;
    private short shortNumber;
    private long longNumber;


    public dto (String str, int intNumber, double doubleNumber, boolean bool, char charS, byte byteS,
                float floatNumber, short shortNumber, long longNumber)
    {
        this.str = str;
        this.intNumber = intNumber;
        this.doubleNumber = doubleNumber;
        this.bool = bool;
        this.charS = charS;
        this.byteS = byteS;
        this.floatNumber = floatNumber;
        this.shortNumber = shortNumber;
        this.longNumber = longNumber;
    }

    public String getStr()
    {
        return str;
    }
    public int getInt()
    {
        return intNumber;
    }
    public double getDouble()
    {
        return doubleNumber;
    }
    public boolean getBool()
    {
        return bool;
    }
    public char getChar()
    {
        return charS;
    }
    public byte getByte()
    {
        return byteS;
    }
    public float getFloat()
    {
        return floatNumber;
    }

    public short getShort()
    {
        return shortNumber;
    }
    public long getLong()
    {
        return longNumber;
    }
}
