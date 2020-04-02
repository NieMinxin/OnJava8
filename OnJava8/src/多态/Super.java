package 多态;

public class Super {
	public int field =0;
	public int getField() {
		return field;
	}

}
/*
 * 当 **Sub** 对象向上转型为 **Super** 引用时，任何属性访问都被编译器解析，因此不是多态的。在这个例子中，
 * **Super.field** 和 **Sub.field** 被分配了不同的存储空间，因此，**Sub** 实际上包含了两个称为 **field** 的属性：它自己的和来自 **Super** 的。
 * 然而，在引用 **Sub** 的 **field** 时
 * ，默认的 **field** 属性并不是 **Super** 版本的 **field** 属性。
 * 为了获取 **Super** 的 **field** 属性，需要显式地指明 **super.field**。*/

