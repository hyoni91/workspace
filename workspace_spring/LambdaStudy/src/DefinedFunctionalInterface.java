
//정의되어 있는 함수형 인터페이스

/*
|함수형인터페이스명| -> |리턴타입 메소드 (매개변수)|
Predicate<T> -> boolean test(T t)
매개변수 t가 true 또는 false 판단(대리자)

Supplier<T> -> T get()
매개변수를 받지 않고 단순히 T를 반환한다(공급자)

Consumer<T> -> void accept(T t)
t 데이터를 전달한다 / 리턴타입 없음 (소비자)

Function<T,R> -> R apply(T t)
T:type , R:result
매개변수로 전달된 t를 R 타입으로 리턴

*/







public interface DefinedFunctionalInterface { }
