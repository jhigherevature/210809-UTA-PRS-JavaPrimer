# Throwing in Java:

### Throwable
The Throwable class in java is a superclass of all exceptions and errors. It defines functionality that allows objects to be thrown by your Java Virtual Machine with the use of the keyword *throw*, which can halt the execution of your JVM.

### Throws
The *throws* weyword used in a method's signature (after param list) that will communicate that a particular exception(s) can result through
the execution of a method:

```
public int sumOddNumbers(int a, int b) throws EvenNumberException {
    // code...
}
```

### Throw
The *throw* keyword can be used in the body of a method to create an execption or error and communicate that your java program should halt. Generally the *throw* keyword is dependent on the implementation of logic, supplied by a developer, which results in an error or exception occuring

```
public int sumOddNumbers(int a, int b) {
    try {
        if (a % 2 == 0 || b % 2 == 0)
            throw new EvenNumberException();
    } catch (EvenNumberException e) {
        e.printStackTrace();
    }
}
```