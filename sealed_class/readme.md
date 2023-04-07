## Sealed class
Subclasses of a sealed class must be modified by one of the following:

  - final: No further subclasses are allowed.
    ![final](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/final_sub_class.png)
  - sealed: A sealed set of subclasses is allowed.
  - non-sealed: This is a new keyword that allows inheritance by unknown subclasses.
