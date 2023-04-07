## Abstract class
  - [Methods in abstract class](#methods-in-abstract-class)
    - [Abstract](#abstract)
    - [Non-abstract](#non-abstract)
  - [Fields in abstract class](#fields-in-abstract-class)
    - [Non-static and non-final](#non-static-and-non-final)
    - [Final](#final)
    - [Static](#static)
    - [Static final](#static-final)
  - [Constructors in abstract class](#constructors-in-abstract-class)
    - [Constructor in abstract class](#constructor-in-abstract-class)
    - [Usage of constructor in non-abstract class](#usage-of-constructor-in-non-abstract-class)
  - [Abstract class vs interface](#abstract-class-vs-interface)

  - ### Methods in abstract class:
    - #### Abstract  
      - access modifiers for abstract methods can be -> *default, public, protected* EXCEPT *private*:
        ![abstract_method](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_method.png)
    - #### Non-abstract
      - access modifiers for non-abstract methods can be -> *default, public, private, protected*:
        ![non_abstract_method](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/non_abstract.png)
  - ### Fields in abstract class:
    - #### Non-static and non-final
      ![abstract_class_non_static_non_final](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_class_non_static_non_final.png)
    - #### Final
      ![abstract_class_final](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_class_final_fields.png)
    - #### Static
      ![abstract_class_static](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_class_static_fields.png)
    - #### Static final
      ![abstract_static_final](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_class_static_final_field.png)
  - ### Constructors in abstract class:
    - #### Constructor in abstract class 
      ![abstract_class_constructor](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_class_constructor.png)
    - #### Usage of constructor in non-abstract class
      ![abstract_class_usage_of_constructor_in_non_abstract_class](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstrat_class_constructor_in_non_abstract_class.png)

## Abstract class vs interface
### Methods
  - abstract class: can be abstract and nont abstract
  - interface: can be abstract, default, static
### Access modifiers
  - abstract class: methods can have private, public, default and protected
  - interface: methods are by default *public abstract* only
### Variables
  - abstract class: can be non-static and non-final
  - interface: by default are *public static final*
### Constructor
  - abstract class: can have constructor
  - interface: cannot have constructor
### Multiple inheritance
  - abstract class: can extend at most one class and implement one or more interfaces
  - interface: can only extend one or more interfaces
### Extends/Implements
  - abstract class: abstract classes are extended by the sub-class. Sub-classes need to provide implementation for all abstract methods or class shall be declared as abstract as well
  - interface: interface is implemented by a class and the implementing class needs to provide implementation for all methods. If class does not implement all methods class shall be declared as abstract
