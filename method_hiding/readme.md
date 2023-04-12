## Method hiding

- [Instance method in subclass](#instance-method-in-subclass)
- [Static method in subclass](#static-method-in-subclass)
- [The method of object](#the-method-of-object)
- [The method of class type](#the-method-of-class-type)

### Instance method in subclass
Instance method in superclass cannot overrite static method in subclass:
![method hide 1](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/method_hide_1.png)

### Static method in subclass
Static method in subclass cannot override instance method in superclass:
![method hide 2](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/method_hiding_2.png)

### The method of object
The method for a created object will be called:
![method hide 3](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/method_hide_3.png)

### The method of class type
The method for class type will be called:
![method hide 4](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/method_hide_4.png)


