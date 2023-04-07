## Access Modifiers
  - [Same class](#same-class)
  - [Same package and subclass](#same-package-and-subclass)
  - [Same package and non-subclass](#same-package-and-non-subclass)
  - [Different package and subclass](#different-package-and-subclass)
  - [Different package and non-subclass](#different-package-and-non-subclass)

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
