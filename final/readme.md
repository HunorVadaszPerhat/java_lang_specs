## Final
- [Final variable](#final-variable)
- [Final method](#final-method)
- [Final class](#final-class)

### Final variable
- final variables are constants
- once a final variable is initialized the value cannot be changed
- it is a good practice to name variables with UPPER CASE 
- #### Blank final variables
    - if a final variable is not initialized at the time of the declaration is known as a blank final variable
    - the blank final variable must be initialized 
![Final variables](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/final_variables.png)


### Final method
- final methods CANNOT be overriden by subclass
![Final methods](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/final_methods.png)

- BUT final methods CAN be called by subclass
![Final methods call from subclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/final_methods_call_from_subclass.png)

### Final class
- final classes cannot be extended by subclass
![Final class](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/final_class.png)
