package org.example;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;



public class RandomGen
{
    private final Random random;
    private static final int firstLetter = 97;
    private static final int lastLetter = 122;
    private final Random randomLength = new Random();

    private final int StrLength = randomLength.nextInt(50);
    private static final int leftChar = 32;
    private static final int rightChar = 126;
    public RandomGen()
    {
        this.random = new Random();
    }


    private String generateRandomString()
    {
        return random.ints(firstLetter, lastLetter + 1).limit(StrLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private char generateRandomChar()
    {
        int randomAscii = random.nextInt(rightChar - leftChar + 1) + leftChar;

        return (char) randomAscii;
    }

    private byte generateRandomByte()
    {
        int b = random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE + 1);
        return (byte) b;
    }

    private short generateRandomShort()
    {
        int s = random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE + 1);
        return (short) s;
    }
    public <T> T generateDto(Class<T> dtoClass) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException
    {
        Constructor<T> constructor = dtoClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        T dto = constructor.newInstance();

        for (Field res : dtoClass.getDeclaredFields())
        {
            res.setAccessible(true);
            Class<?> fieldType = res.getType();
            switch (fieldType.getName())
            {
                case "java.lang.String":
                    res.set(dto, generateRandomString());
                    break;
                case "int":
                case "java.lang.Integer":
                    res.set(dto, random.nextInt());
                    break;
                case "boolean":
                case "java.lang.Boolean":
                    res.set(dto, random.nextBoolean());
                    break;
                case "char":
                    res.set(dto, generateRandomChar());
                    break;
                case "double":
                case "java.lang.Double":
                    res.set(dto, random.nextDouble());
                    break;
                case "byte":
                case "java.lang.Byte":
                    res.set(dto, generateRandomByte());
                    break;
                case "short":
                case "java.lang.Short":
                    res.set(dto, generateRandomShort());
                    break;
                case "long":
                case "java.lang.Long":
                    res.set(dto, random.nextLong());
                    break;
                case "float":
                case "java.lang.Float":
                    res.set(dto, random.nextFloat());
                    break;
            }
        }
        return dto;
    }
}