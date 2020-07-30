# 람다란?
- 람다표현식은 메서드로 전달할 수 있는 익명 함수를 단순화 한 것.
    - 익명: 이름이없다
    - 함수: 특정 클래스에 종속되지 않는다.
    - 전달: 메서드의 인수로 전달하거나 변수로 저장할 수 있다.
    - 간결성: 익명클래스와 달리 자질구레한 코드구현이 필요없다.

- 람다는 세 부분으로 이루어진다.
    - 파라미터 리스트 : (Apple a1, Apple a2)
    - 화살표 : ->
    - 람다의 바디 : a1.getWeight().compareTo(a2.getWeight())
    - (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

# 어디에, 어떻게 람다를 사용?
- 람다는 함수형 인터페이스라는 문맥에서 사용할 수 있다.
- 함수형 인터페이스는 정확히 하나의 추상 메서드를 지정하는 인터페이스다.

# 함수형 인터페이스
- Predicate : T 형식의 객체를 사용하는 불린 표현식이 필요한 상황에서
```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```
- Consumer : T 형식의 객체를 인수로 받아 어떤 동작을 수행하고 싶을 때
```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

- Function : 제네릭 형식 T를 인수로 받아 제네릭 형식 R객체를 반환하는 apply 추상 메서드를 정의
```java
@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
```

# 메서드 레퍼런스
- 메서드 레퍼런스는 특정 메서드만을 호출하는 람다의 축약형
## 메서드 레퍼런스 만드는 방법
- 정적 메서드 레퍼런스 : Integer::parseInt
- 다양한 형식의 인스턴스 메서드 레퍼런스 : String::length
- 기존 객체의 인스턴스 메서드 레퍼런스 : expensiveTransaction::getValue
## 생성자 레퍼런스
- ClassName::new