## Static keyword
- [Static blocks](#static-blocks)
- [Static variables](#static-variables)
- [Static methods](#static-methods)
- [Static class](#static-class)

### Static blocks
- static block is used for initializing static variable
- static block gets executed when the class is loaded in memory
- a class can have multiple static blocks (it will execute in the same sequence in which they have been written into the program)
  ![Static block](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/static_blocks.png)

### Static variables
- a static variable is common to all instances of the class since it is a class level variable
- memory allocation only happens once when the class is loaded in the memory
- static variables are also known as class variables
- unlike non-static variables, static variables can be accessed in directly in both static and non-static methods
  ![Static variable](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/static_variable.png)

### Static methods
- static methods can access class variables without using object of the class (non-static variables and non-static methods can ONLY be accessed using objects)
- static methods can be accessed directly in static and non-static methods
![Static methods](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/static_methods.png)

### Static class
- a class can be made static ONLY IF it is a nested class
- a nested static class does not need reference of Outer class
- a static class cannot non-static members of Outer class
  ![Static class](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/static_classes_access.png)
