## 解释器(Interpreter)模式 ##

解释器模式是类的行为模式。给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。客户端可以使用这个解释器来解释这个语言中的句子。


解释器模式所涉及到的角色有：
抽象表达式（Expression）角色、终结符表达式（Terminal Expression）角色、非终结符表达式（Nonterminal Expression）角色、客户端（Client）角色、环境（Context）角色。


解释器模式适用于以下的情况：

* 系统有一个简单的语言可供解释。
* 一些重复发生的问题可以用这种简单的语言表达。
* 效率不是主要的考虑。


JDK 里的应用：

	java.util.Pattern
	java.text.Normalizer
	java.text.Format
