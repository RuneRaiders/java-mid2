package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        //Integer result = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 타입 추론, 타입 인자 영역
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.<Integer>genericMethod(10);
        Integer integerValue2 = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue2 = GenericMethod.<Double>numberMethod(20.0);
    }
}
