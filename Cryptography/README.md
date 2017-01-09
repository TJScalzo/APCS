## Cryptography Project

In groups, you will be designing an Object Oriented solution for encrypting and decrypting a message.

### Requirements are:
- The solution must know if a message is in ciphertext form or plaintext form and if it is in ciphertext form it must know what cipheralphabet was used to encrypt it.
- The solution must store the plainalphabet and the cipheralphabet in a secure way.
- You may choose the system of encryption (see links below) but you must fully understand how it works
- Before you begin coding you MUST turn in a plan for your solution which includes an outline of the classes you will make (description with fields & methods) AND PSEUDO CODE written out in English for how EACH method of your encryption works


<br />**I will leave it open as to the number of classes you have as long as you meet the specifications.** Design note: In general, one should look for the right "fit" for the number of classes for a project - you should not force it into one at the expense of expandability and elegance and at the same time you should not have multiple classes just for the sake of having them.

### Suggestions for classes:
**Message class** - Represents either a plaintext message or a ciphertext message and KNOWS which it is somehow. The message must be able to be represented in multiple language sets/symbols other than just the English alphabet. Other potential classes must be able to interact with your message and know if is encrypted or not encrypted. Something to consider is not allowing messages to be mutated once created since this would insure the integrity of the message.
<br />[List methods with PSEUDO CODE]

**Cipher class** - Uses a key String to create a cipheralphabet and then encrypts and decrypts messages. A cipher should be able to be made given the key and keys should be adjusted so as to not have any repeating letters and should be of sufficient length so as to insure adequate encryption. A cipher should know both the plainalphabet and the cipheralphabet (after it is generated). But once a cipheralphabet is made,  there is no reason to have these accessible publicly for security reasons. In addition, there should be a way to tell one cipher from another with revealing the key. In the interest of possible future growth, ciphers should allow for other alphabets besides the 26 letter English one and they should allow for control over multiple encryption (turn it on or off).
<br />[List methods with PSEUDO CODE]

### Links to help:

http://rumkin.com/tools/cipher/caesar-keyed.php
http://simonsingh.net/cryptography/crypto-links
http://www.richkni.co.uk/php/crypta/caesar.php
http://www.counton.org/explorer/codebreaking/vigenere-cipher.php
