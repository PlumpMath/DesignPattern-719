/**
 * 
 */
package pattern.Visitor.more;

/**
 * Visitor接口方法重载
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-24
 */
public class OverloadingInVisitor {

}

/**
 * 为什么不使用多态性原则将各个访问方法的名字重载为visit()？就是注释掉的部分。
 * 一般而言，Java设计师使用方法的重载要经历如下的一个过程：
 * 1.初学者不用。
 * 他们还没有认识到在Java语言中使用重载的好处。
 * 2.中等程度者到处用。
 * 他们认识到在Java中使用重载的好处，于是，凡是可以使用重载的地方都会使用重载。
 * 3.经过一些磨练之后，资深的设计师们认识到：
 * 重载在很多情况下会造成不必要的困惑，从而明白在什么情况下应当避免使用重载。
 * 像本例一样，如果有20个Visitable的实现类，那么访问者就会有20个对应的访问方法。
 * 如果使用重载，所有这20个方法都会有同样的名字，维护这样代码非常费劲。
 * 
 * 使用重载的好处是可以强调这些方法所具有的多态性和分析的一致性。
 * 尽管它们所使用的参量不同，但是太多的同名方法会使阅读代码的人不容易看清楚不同的重载方法之间的区别。
 * 过多的使用重载会使一个不大的系统变得不必要的复杂，并导致一些很难发现的错误。
 * 由于这里不使用重载就可以清楚地看到这些访问方法的接受者，因此是一个较好的选择。
 */
interface Visitor {

//	public void visit(A a);
//	public void visit(B b);
//	public void visit(C c);
	
	public void visitA(A a);

	public void visitB(B b);

	public void visitC(C c);
}

interface Visitable {

	public void accept(Visitor visitor);
}

class A implements Visitable {

	@Override
	public void accept(Visitor visitor) {
	}
}

class B implements Visitable {

	@Override
	public void accept(Visitor visitor) {
	}
}

class C implements Visitable {

	@Override
	public void accept(Visitor visitor) {
	}
}