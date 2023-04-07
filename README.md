# JAVA Lang Specs

- [Access modifiers](#access-modifiers)
  - [Same class](#same-class)
  - [Same package and subclass](#same-package-and-subclass)
  - [Same package and non-subclass](#same-package-and-non-subclass)
  - [Different package and subclass](#different-package-and-subclass)
  - [Different package and non-subclass](#different-package-and-non-subclass)
- [Abstract class](#abstract-class)
  - [Methods in abstract class](#methods-in-abstract-class)
    - [Abstract](#abstract)
    - [Non-abstract](#non-abstract)
  - [Fields in abstract class](#fields-in-abstract-class)
    - [Non-static and non-final](#non-static-and-non-final)
    - [Final](#final)
    - [Static](#static)
    - [Static final](#static-final)
  - [Constructors in abstract class](#constructors-in-abstract-class)
    - [Constructor in Abstract class](#constructor-in-abstract-class)
    - [Usage of constructor in non-abstract class](#usage-of-constructor-in-non-abstract-class)
    - [Accessing field of abstract class from non-abstract class](#accessing-field-of-abstract-class-from-non-abstract-class)
- [Interface](#interface)
  - [Fields in interface](#fields-in-interface) 
  - [Constructors in interface](#constructors-in-interface)
  - [Methods in interface](#methods-in-interface)
  - [Access fields and methods of interface](#access-fields-and-methods-of-interface)

## Access Modifiers

|                                 |default             |private             |protected           |public              |
|---                              |---                 |---                 |---                 |---                 |          
| [Same class](#same-class)       | :white_check_mark: | :white_check_mark: | :white_check_mark: | :white_check_mark: |
| [Same package and subclass](#same-package-and-subclass)         | :white_check_mark: | :x:                | :white_check_mark: | :white_check_mark: |
| [Same package and non-subclass](#same-package-and-non-subclass)     | :white_check_mark: | :x:                | :white_check_mark: | :white_check_mark: |
| [Different package and subclass](#different-package-and-subclass)    | :x:                | :x:                | :white_check_mark: | :white_check_mark: |
| [Different package and non-subclass](#different-package-and-non-subclass)| :x:                | :x:                | :x:                | :white_check_mark: |

### Same class
![access_modifiers_same_class](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/access_modifiers_same_class.png)

### Same package and subclass
![access_modifiers_same_package_subclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/access_modifiers_same_package_non_subclass.png)

### Same package and non-subclass
![access_modifiers_same_package_non_subclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/access_modifiers_same_package_subclass.png)

### Different package and subclass
![access_modifiers_different_package_subclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/access_modifiers_different_package_subclass.png)

### Different package and non-subclass
![access_modifiers_different_package_non_subclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/access_modifiers_different_package_non_subclass.png)

## Abstract class

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
    - #### Accessing field of abstract class from non-abstract class
      ![abstract_class_constructor_in_non_abstract_class](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/abstract_class_accessing_fields.png)     
    
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
  - ### Access fields and methods of interface
    ![access_fields_methods_of_interface](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/interface_access_fields_methods.png)
      
