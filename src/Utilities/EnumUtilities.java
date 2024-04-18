package Utilities;
import java.util.Random;

public class EnumUtilities
{
    private static final Random RANDOM = new Random();

    public static <E extends Enum<E>> E getRandomValue(Class<E> enumClass) {
        E[] enumConstants = enumClass.getEnumConstants();
        int randomIndex = RANDOM.nextInt(enumConstants.length);
        return enumConstants[randomIndex];
    }
}