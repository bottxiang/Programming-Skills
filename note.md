
/********************************************************/
递归的基本原理：
1.每级函数调用都有自己的变量。
2.每次函数调用都会返回一次。
3.递归函数中位于递归调用之前的语句，均按被调函数的顺序执行。
4.递归函数中位于递归调用之后的语句，均按被调函数相反的顺序执行。
5.虽然每级递归都有自己的变量，但并没有拷贝函数的代码。（程序按顺序执行函数中的代码，而递归调用就相当于又从头开始执行函数的代码）
Last，递归函数必须包含能让递归调用停止的语句。

尾递归是最简单的递归形式，因为它相当于循环。
/*********************************************************/
