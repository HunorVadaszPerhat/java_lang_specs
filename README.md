# JAVA Lang Specs

- [Access modifiers](#access-modifiers)

## Access Modifiers

|                                 |default             |private             |protected           |public              |
|---                              |---                 |---                 |---                 |---                 |          
| same class                      | :white_check_mark: | :white_check_mark: | :white_check_mark: | :white_check_mark: |
| same package & subclass         | :white_check_mark: | :x:                | :white_check_mark: | :white_check_mark: |
| same package & non-subclass     | :white_check_mark: | :x:                | :white_check_mark: | :white_check_mark: |
| different package & subclass    | :x:                | :x:                | :white_check_mark: | :white_check_mark: |
| different package & non-subclass| :x:                | :x:                | :x:                | :white_check_mark: |

