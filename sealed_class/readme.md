## Sealed class

A sealed class MUST permit at least one subclass
  ![sealed_class_must_contain_at_leat_one_subclass](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_must_contain_subclass.png)

A subclasses must be either final, non-sealed or sealed
  ![sealed_class_rule_1](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_rules_1.png)
  
  - a subclass as non-sealed
    ![sealed_class_rule_2](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_rule_2.png)
  - a subclass as final
    ![sealed_class_rule_3](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_rule_3.png)
  - a subclass as sealed must have subclasses
    ![sealed_class_rule_4](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_rule_4.png)
    - if subclass is non-sealed
      ![sealed_class_rule_5](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_rule_5.png)
    - if subclass is final
      ![sealed_class_rule_6](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/sealed_class_rule_6.png)




  
