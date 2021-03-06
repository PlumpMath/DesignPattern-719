## 享元（Flyweight）模式 ##

享元模式属于对象的结构模式。享元模式以共享的方式高效的支持大量的细粒度对象。

享元对象能做到共享的关键是区分内蕴状态（Internal State）和外蕴状态（External State）。

一个内蕴状态是存储在享元对象内部的，并且是不会随环境改变而有所不同的。因此，一个享元可以具有内蕴状态并可以共享。一个外蕴状态是随环境改变而改变的、不可以共享的状态。

享元对象的外蕴状态必须由客户端保存，并在享元对象被创建之后，在需要使用的时候再传入到享元对象的内部。外蕴状态不可以影响享元对象的内蕴状态，换句话说，它们是相互独立的。

根据所涉及的享元对象的内部表象，享元模式可以分成单纯享元模式和复合享元模式两种形式。
在复合享元模式中，享元对象构成合成模式，因此，复合享元模式实际上是单纯享元模式与合成模式的组合。


### 享元模式的应用举例

享元模式在编辑器系统中大量使用。一个文本编辑器往往会提供很多种字体，而通常的做法就是将每一个字母做成一个享元对象。享元对象的内蕴状态就是这个字母，而字母在文本中的位置和字模风格等其他信息则是外蕴状态。比如，字母a可能出现在文本的很多地方，虽然这些字母a的位置和字模风格不同，但是所有这些地方使用的都是同一个字母对象。这样一来，字母对象就可以在整个系统中共享。


### 单纯享元模式的结构

在单纯享元模式中，所有的享元对象都是可以共享的。所涉及的角色如下：

抽象享元（Flyweight）角色、具体享元（ConcreteFlyweight）角色、享元工厂（FlyweightFactory）角色、客户端（Client）角色。


### 复合享元模式的结构

将一些单纯享元使用合成模式加以复合，形成复合享元对象。这样的复合享元对象本身不能共享，但是它们可以分解成单纯享元对象，而后者则可以共享。所涉及的角色如下：

抽象享元（Flyweight）角色、具体享元（ConcreteFlyweight）角色、复合享元（UnsharableFlyweight）角色、享元工厂（FlyweightFactory）角色、客户端（Client）角色。


### 模式的实现

享元模式里的享元对象不一定非得是不变对象（Immutable），但是很多的享元对象确实被设计成了不变对象。

由于不变对象的状态在被创建之后就不再变化，因此不变对象满足享元模式对享元对象的要求。
应用享元模式的另一个关键就是享元对象的创建必须由一个工厂对象加以控制，通常情况下都是使用new关键字来创建一个类的实例，而这里则必须使用工厂方法来达到创建对象的目的。


### 享元模式的优缺点

享元模式的优点在于它大幅度的降低内存中对象的数量，但是做到这一点所付出的代价也很高：
享元模式使得系统更加复杂，为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。

JDK 里的应用：

	java.lang.Integer#valueOf(int)
	java.lang.Boolean#valueOf(boolean)
	java.lang.Byte#valueOf(byte)
	java.lang.Character#valueOf(char)
