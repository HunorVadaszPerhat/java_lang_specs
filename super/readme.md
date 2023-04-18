## Super

- [Calling a superclass constructor](#calling-a-superclass-constructor)
- [Accessing method and variable of superclass](#accessing-method-and-variable-of-superclass)

### Calling a superclass constructor
- can call a constructor in the superclass of the current class
- often used in constructor chaining, where there are multiple constructors in a class that call each other using this(), and the final constructor calls a constructor in the superclass using super()

![Super call constructor](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/super_call_constructor.png)

### Accessing method and variable of superclass
- can access methods or variables in the superclass of the current class
- useful when there is a method or variable with the same name in both the superclass and subclass and the one in the superclass should be referred to 

![Accessing method and variable of superclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/access_superclass_method_variable.png)

