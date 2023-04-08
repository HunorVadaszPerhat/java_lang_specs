## Static keyword
[Static block](#static-block)

### Static block
- static block is used for initializing static variable
- static block gets executed when the class is loaded in memory
- a class can have multiple static blocks (it will execute in the same sequence in which they have been written into the program)
  ![Access modifiers](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/static_block.png)

### Static vaiables
- a static variable is common to all instances of the class since it is a class level variable
- memory allocation only happens once when the class is loaded in the memory
- static variables are also known as class variables
- unlike non-static variables, static variables can be accessed in directly in both static and non-static methods
