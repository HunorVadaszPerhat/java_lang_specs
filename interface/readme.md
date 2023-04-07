## Interface
  - ### Fields in interface
    - all fields are by default *PUBLIC STATIC FINAL*
    - specifying a field as *PUBLIC STATIC FINAL* is redundant 
    ![interface_fields](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/interface_fields.png)
  - ### Constructors in interface
    - constructors are not allowed 
  - ### Methods in interface
    - can be *abstract*, *default* and *static*
    - are by default *PUBLIC ABSTRACT* 
    ![interface_methods](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/interface_methods.png)

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
