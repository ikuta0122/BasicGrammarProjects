package com.ikuta.demo;

//关于String类中的常用方法
public class StringDemo04 {
    public static void main(String[] args) {
        // 1.char charAt(int index)
        //	返回指定索引的 char值。
		/*
		Parameters:
			index the index of the char value.
		Returns:
			the char value at the specified index of this string. The first char value is at index 0.
		 */
        char c = "西野七濑".charAt(2);
        System.out.println(c);
        //	输出:七

        //	2.int compareTo(String anotherString)
        //	按字典顺序比较两个字符串大小
        //	字符串之间比较大小不能直接使用 >和<,需要使用compareTo方法
        System.out.println("abc".compareTo("abc"));
        //	输出：0	等于0	前后一致
        System.out.println("abcd".compareTo("abce"));
        //	输出：-1	小于0	前小后大
        System.out.println("abce".compareTo("abcd"));
        //	输出：1	大于0	前大后小

        //3.boolean contains(CharSequence s)
        //	判断前字符串是否包含后字符串
        System.out.println("西野七濑".contains("七濑"));
        //	输出：true
        System.out.println("西野七濑".contains("生田"));
        //	输出：false

        //4.boolean endsWith(String suffix)
        //	判断字符串是否以指定后缀结束。
        System.out.println("西野七濑".endsWith("七濑"));
        //	输出:true
        System.out.println("西野七濑".endsWith("西野"));
        //	输出:false

        //5.boolean equals(Object anObject)
        //	判断字符串是否相等。必须调用equals()方法,不能用"=="
        System.out.println("西野七濑".equals("西野七濑"));
        //	输出:true
        System.out.println("西野七濑".equals("生田绘梨花"));
        //	输出:false
        /*compareTo和equals的区别
         *equals只能判断是否相等
         *compareTo不仅能判断是否相等,还能判断大小
         */

        //6.boolean equalsIgnoreCase(String anotherString)
        //	判断字符串是否相等,并且忽略大小写
        System.out.println("Nishino".equalsIgnoreCase("nishino"));
        //	输出:true
        System.out.println("Nishino".equalsIgnoreCase("ikuta"));
        //	输出:false

        //7.byte[] getBytes()
        //	将字符串对象转换成字节数组
        byte[] bytes = "nishino".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "\t");
        }
        System.out.println();
        //	输出：110	105	115	104	105	110	111

        //8.int indexOf(String str)
        //	返回某个子字符串在当前字符串中第一次出现处的索引
        System.out.println("西野七-七濑-七".indexOf("七"));
        //	输出:2

        //9.boolean isEmpty()
        //	判断字符串是否为"空字符串"
        System.out.println("".isEmpty());
        //	输出:true
        System.out.println("西野七濑".isEmpty());
        //	输出:false

        //10.int length()
        //	返回字符串的长度
        System.out.println("西野七濑".length());
        //	输出：4
        System.out.println("生田绘梨花".length());
        //	输出：5
        //	面试题：判断数组长度和判断字符串长度不一样
        //	判读数组长度是length属性，而判断字符串长度是length()方法

        //11.int lastIndexOf(String str)
        //	返回某个子字符串在当前字符串中最后出现处的索引
        System.out.println("西野七-七濑-七".lastIndexOf("七"));
        //	输出：7

        //12.String replace(char oldChar, char newChar)
        //	返回一个新字符串:通过用newChar替换字符串中所有出现的oldChar得到
        System.out.println("西野七濑".replace("七濑", "绘梨花"));
        //	输出:西野绘梨花

        //13.String replace(CharSequence target, CharSequence replacement)
        //	String的父接口就是CharSequence
        //	返回一个新字符串:通过用newChar替换字符串中所有出现的oldChar得到
        System.out.println("西野七濑".replace("七濑", "绘梨花"));
        //	输出:西野绘梨花

        //14.String[] split(String regex)
        //	拆分字符串
        //	"1994-05-25"以"-"分隔符进行拆分
        String[] birthday = "1994-05-25".split("-");
        for (int i = 0; i < birthday.length; i++) {
            System.out.print(birthday[i] + "\t");
        }
        System.out.println();
        //	输出:1994	05	25

        //15.boolean startsWith(String prefix)
        //	判断字符串是否以指定前缀开始。
        System.out.println("西野七濑".startsWith("西野"));
        //	输出:true
        System.out.println("西野七濑".startsWith("野"));
        //	输出:false

        //16.String substring(int beginIndex)
        //	截取字符串:beginIndex开始
        System.out.println("西野七濑".substring(2));
        //	输出:七濑

        //17.String substring(int beginIndex, int endIndex)
        //	截取字符串:beginIndex处开始,endIndex-1处结束
        //	beginIndex	起始位置（包括）
        //	endIndex	结束位置（不包括）
        System.out.println("西野七濑-生田绘梨花-星野南".substring(5, 10));
        //	输出:生田绘梨花

        //18.char[] toCharArray()
        //	将字符串转换为一个新的字符数组。
        char[] name = "西野七濑".toCharArray();
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
        }
        System.out.println();
        //	输出:西	野	七	濑

        //19.String toLowerCase()
        //	将字符串中的所有字符转换成小写
        System.out.println("Nishino Nanase".toLowerCase());
        //	输出:nishino nanase

        //20.String toUpperCase()
        //	将字符串中的所有字符转换成大写
        System.out.println("Nishino Nanase".toUpperCase());
        //	输出:NISHINO NANASE

        //21.String toString()
        //	返回此对象本身
        System.out.println("西野七濑".toString());
        //	输出:西野七濑

        //22.String trim()
        //	删除字符串前后空白,不包括中间空白
        System.out.println("     西野       七濑         ".trim());
        //	输出:西野       七濑

        /*23.valueOf
         *static String valueOf(int i)
         *static String valueOf(long l)
         *static String valueOf(double d)
         *static String valueOf(float f)
         *static String valueOf(boolean b)
         *static String valueOf(char c)
         *static String valueOf(char[] data)
         *static String valueOf(char[] data, int offset, int count)
         *static String valueOf(Object obj)
         */
        //	String中只有这个方法(valueOf)是静态的,不需要创建String对象
        //	作用:将非字符串转换成字符串
        System.out.println(String.valueOf(true));
        //	输出:true
        char[] chars = {'西', '野', '七', '濑'};
        System.out.println(String.valueOf(chars));
        //	输出:西野七濑
        System.out.println(String.valueOf(chars, 2, 2));
        //	输出:七濑
        System.out.println(String.valueOf(new Idol()));
        //	输出:course22.Idol@5305068a(为重写toString()方法)
        //	输出:Idol(重写toString()方法)
		/*源代码:
		public static String valueOf(Object obj) {
        	return (obj == null) ? "null" : obj.toString();
    	}
		*/
        //	结论:System.out.println()这个方法在输出任何数据时，都是先转换成字符串在输出
    }
}

class Idol {

    @Override
    public String toString() {
        return "Idol";
    }

}