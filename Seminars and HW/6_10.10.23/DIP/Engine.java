package DIP;

/**
 * Интерфейс Engine. От него зависят все модули в нашем примере:
 * верхний модуль - использует в конструкторе объект типа Engine,
 * нижний модуль - реализует методы интерфейса.
 * 
 */
public interface Engine {
    void start();
}