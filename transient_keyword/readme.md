## Transient keyword

- in Java, serialization is a concept using can be used the state of an object into a byte stream to be transferred over a network
- during the process of serializing an object of a class if one wants to the JVM to neglect to a particular instance variable it must be declared transient

![Transient](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/transient.png)

### Serialize vs deserialize
![Serialize vs deserialize](https://github.com/HunorVadaszPerhat/java_lang_specs/blob/main/images/serialize_deserialize.png)
- *serialize*: the process of converting complex data structures such as objects into a "flatter" format that can be sent and received as a sequential stream of bytes
- *deserialize*: the process of restoring byte stream to a fully functional replica of the original object, in the exact state as when it was serialized
