package org.example;
import java.lang.reflect.InvocationTargetException;

public class Main
{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        RandomGen generator = new RandomGen();
        dto randomDto = generator.generateDto(dto.class);

        System.out.println("String: " + randomDto.getStr());
        System.out.println("Int: " + randomDto.getInt());
        System.out.println("Double: " + randomDto.getDouble());
        System.out.println("Bool: " + randomDto.getBool());
        System.out.println("Char: " + randomDto.getChar());
        System.out.println("Byte: " + randomDto.getByte());
        System.out.println("Float: " + randomDto.getFloat());
        System.out.println("Short: " + randomDto.getShort());
        System.out.println("Long: " + randomDto.getLong());
    }
}