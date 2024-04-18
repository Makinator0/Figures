package utilities;

public class EnumUtil
{
    public static <E extends Enum<E>> E getRandomValue(Class<E> enumClass) {
        E[] enumConstants = enumClass.getEnumConstants();
        int randomIndex = RandomUtil.random.nextInt(enumConstants.length);
        return enumConstants[randomIndex];
    }
}