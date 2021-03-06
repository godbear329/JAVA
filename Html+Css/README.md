## HTML5

1. 概念及其简介

HTML（Hyper Text Markup Language）是超文本标记语言，所谓的超文本就是页面中，你能听到的，看到的，点击的一切东西，例如图片、音频、视频。HTML的主要目标是将互联网语义化，以便更好地被人类和机器阅读，并同时提供更好的支持各种媒体的嵌入。

而HTML5是对HTML的第五次修订，在2014年10月由万维网(W3C)完成标准指定。它与上一代HTML4.01相比，解决了web浏览器的兼容性问题，例如在一个浏览器中可以运行的HTML,Css，Javascript，在另一个浏览器中不能运行。(原因:各浏览器的规范不统一，没有被标准化。)添加并废除了一些元素，能够更加适应互联网快速发展的需求。

2. h5结构

    1. 基本元素

    * DOCTYPE声明
    * <!---->注释
    * &lt;html&gt;标签
    * &lt;head>标签
    * &lt;body>标签
    * &lt;h1>到&lt;h6>标签
    * &lt;br/>标签
    * &lt;hr/>标签
    * &lt;p>&lt;/p>标签
    * &lt;div>&lt;/div>标签
* &lt;span>&lt;/span>标签
  
2. 图像相关元素&lt;img/>标签
   
    * width
    * height
    * src
    * alt
3. 超链接和锚点&lt;a>&lt;/a>标签
   
    * href
    * target
4. 列表相关元素
   
    * 有序列表&lt;ol>&lt;/ol>
        * type
        * start
    * 无序列表&lt;ul>&lt;/ul>
        * type
    * 自定义列表&lt;dl>&lt;/dl>
        * &lt;dt>&lt;/dt>
        * &lt;dd>&lt;/dd>
5. 表格相关元素&lt;table>&lt;/table>
   
    * &lt;tr>行
    * &lt;td>列
    * border规定围绕表格的边框的宽度
    * cellpadding指定单元格内容和单元格边框之间的间隔
    * cellspacing指定单元格之间的间距
    * &lt;caption>&lt;/caption>表格标题
    * &lt;thead>&lt;/thead>表头
    * &lt;tbody>&lt;/tbody>表体
    * &lt;tfoot>&lt;/tfoot>页脚
6. input元素
    - type
        - text:定义一个单行文本框
        - password:定义一个密码框
        - radio:定义单选框
        - checkbox:定义一组多选框
        - submit:定义一个提交按钮,提交当前表单内容
        - reset:定义一个重置按钮,重置当前表单内容
        - button:定义一个单纯的点击按钮,来触发各种函数或者提交脚本
        - hidden:定义一个隐藏域
    - checked:radio和checkbox可用:页面加载时该项是否被选中
    - disabled:禁用页面元素
    - maxlength:文本框可用:限制可以输入的最大字数
    - placeholder:在输入文字前预期的提示信息
    - readonly:文本框可用:规定输入字段为只读
7. &lt;form>&lt;/form>表单元素
    - action:用于指定提交表单数据的地址
    - method:指定表单数据的提交方法
        - get
        - post
        - put
        - delete
8. &lt;button>&lt;/button>按钮元素
    - button
    - reset
    - submit
9. &lt;select>&lt;/select>下拉列表
    - &lt;option>&lt;/option>定义下拉列表中的一个选项
    - &lt;outgroup>&lt;/outgroup>把相关的选项组合在一起
10. &lt;textarea>&lt;/textarea>文本域:定义一个多行的文本输入框
    - cols指定文本域的宽度
    - rows指定文本域的高度
    - readonly：指定文本域只读
    - disabled禁用





## CSS

1. 概念及其简介

    CSS指层叠样式表(Cascading Style Sheets),CSS为HTML标记语言提供了一种样式描述，所以我们称CSS为样式。在制作HTML页面时采用CSS语言，可以有效的对页面的布局、字体、颜色、背景和其他效果实现更加精确的控制。

2. HTML中嵌入CSS的方式

+ 内联式:行内样式

    ```
    <p style="color:red;font-size:10px;">这是内联样式</p> 
    ```

+ 嵌入式:内部样式/页内样式

    ```
    <style type="text/css">
    
        h1{color:red}
    
        h2{color:mediumblue}
    
    </style>
    ```

* 外链式:外部样式

    ```
    <link rel="stylesheet" href="css的url" type="text/css" > xxxxxxxxxx 外链式:外部样式    type    rel    href<link rel="stylesheet" href="css的url" type="text/css" > 
    ```

* 内部样式和外部样式的通用写法

    ```
    Selector{property1 :value1;property2:value2;...}
    ```

3. CSS选择器

    * 元素选择器element
    * 类选择器classs
    * id选择器id
    * 属性选择器attribute
    * 包含选择器动态伪类
    * 子选择器
    * 兄弟选择器
    * 相邻兄弟选择器
    * 伪元素选择器
        - :first-letter伪元素：向文本的第一个字母添加特殊样式
        - :first-line伪元素：向文本的首行添加特殊样式
        - :before伪元素：在元素之前添加内容（需要配合content属性）
        - :after指定对象内部的尾端添加内容（需要配合content属性）
    * 伪类选择器
        - 结构化伪类
        - 动态伪类
            - :link 超链接被访问前的状态
            - :visited 超链接访问后的状态
            - :hover 鼠标指针正悬停在链接上的状态
            - :active 代表鼠标指针按下但是没有放开的状态
            - love hate原则
    * 选择器组合

4. CSS优先级

    * 嵌入CSS优先级

        内联式最高、嵌入式CSS次之、外链CSS优先级最低

    * 选择器CSS优先级

        通用选择器（*） < 元素(类型)选择器 < 类选择器 < 属性选择器 < 伪类 < ID 选择器 < 内联样式

## 字体与文本相关元素

### 字体相关属性

+ color
+ font
    - font-style字体样式
        - normal
        - italic斜体
        - oblique倾斜体
    - font-weight字体粗体
        - lighter 更细
        - normal正常
        - bold 加粗
        - bolder更粗
        - 还可以使用具体的数值100-900
    - font-size字体大小
    - font-family 字体
+ text-decoration
    - none无修饰
    - underline下划线
    - line-through中划线
    - over-line上划线
+ text-transform
    - none不转换
    - capitalize首字母大写
    - uppercase全部大写
    - lowercase全部小写
+ line-height设置字体行高
+ letter-spacing设置字符间隔
+ word-spacing设置单词间隔
+ text-indent设置段落文本的缩进
+ text-align设置目标组件中文本的水平对齐方式(left/center/right)
+  text-shadow可以同时添加多个阴影
    - xoffset指定阴影在横向上的偏移
    - yoffset指定阴影在纵向上的偏移
    - radius指定阴影的模糊半径，越大越模糊
    - color:指定该阴影的颜色

### 背景相关属性

- background设置背景样式
- background-color用于设置背景颜色
- background-image设置背景图片
- background-size设置图片的大小尺寸
- background-position设置背景图片位置(前提是必须有background-image属性)
- background-repeat设置对象的背景图片是否平铺
    - repeat
    - no-repeat
    - repeat-x
    - repeat-y

### 边框相关属性

- border 复合属性:border:5px solid red;
- border-style边框线型
    - none无边框
    - hidden隐藏边框
    - dotted点线边框
    - dashed虚线边框
    - solid实线边框
    - double双线边框
- border-color
- border-width
- border-right
- border-bottom
- border-left
- border-top
- 作用域
    - 一个值：作用于四条边
    - 两个值：第一个值设定上下，第二个值设定左右
    - 三个值：1，上；2：左右；3：下
    - 四个值：上右下左

### 其他样式

#### 表格样式

- ​	border-collapse设置相邻单元格的边框处理样式
    - separate边框分开
    - collapse边框合并
- border-spacing设置相邻单元格边框的间距
- caption-side设置表格标题的位置(bottom/top)
- empty-cells设置空单元格是否显示边框hide/show
- list-style-type设置列表标记
    - disc实心圆
    - circle空心圆
    - square实心方块
- list-style-image使用图像列表标记
- list-style-position属性设置在何处放置列表项标记
    - inside	列表项目标记放置在文本以内，且环绕文本根据标记对齐。
    - outside 默认值。保持标记位于文本的左侧。列表项目标记放置在文本以外，且环绕文本不根据标记对齐。
    - inherit 规定应该从父元素继承 list-style-position 属性的值。
- list-style 复合属性:list-style:square inside url('/i/arrow.gif');
- cursor光标形状

### 过渡

​	在HTML中,我们为了添加某种效果可以从一种样式转变为另一个样式的时候,虽然可以通过脚本实现这个动态效果,但是CSS也提供了这样的动态效果，我们称之为过渡

- transition-delay设置过渡开始之前的延时
- transition-duration设置过渡持续的时间
- transition-property设置过渡的参与属性
- transition-timing-function设置过渡的速率
    - linear:相同的速度从开始到结束
    - ease:慢速开始→变快→慢速结束
    - ease-in:慢速开始
    - ease-out:慢速结束
    - ease-in-out:以慢速开始和结束
- transition: property duration timing-function delay;复合写法

## 盒子模型

可见的元素在页面中占据了一个矩形的区域，该区域就被称为是这个元素的盒子

- width：设置元素宽度

- height：设置元素高度

- padding：设置内边距

    - padding-top
    - padding-bottom
    - padding-right
    - padding-left

- margin：设置外边距

    - margin-top
    - margin-bottom
    - margin-left
    - margin-right

- 设置最小和最大尺寸

    - min-width
    - min-width

- overflow：处理元素内容溢出

    - overflow-x横轴溢出
    - overflow-y纵轴溢出
        - visible:默认值。内容不会被修剪，会呈现在元素框之外。
        - hidden:内容会被修剪，并且其余内容是不可见的。
        - scroll:内容会被修剪，但是浏览器会显示滚动条以便查看其余的内容。
        - auto:如果内容被修剪，则浏览器会显示滚动条以便查看其余的内容。

- 元素类型

    - inline：行内元素

        例如:a、b、br、em、i、span、strong

        性质:

        1、不可以设置宽高

        2、不可以独占一行

    - inline-block：行内块级元素

        例如:img、input

        性质：1.可以设置宽高
        			2.不能独占一整行

    - block：块级元素

        性质：在页面中，该类元素可以设置宽高，并且在页面中是独占一整行

        例如：div、h1~h6、center、hr、ul、ol、p、table、form、button

    - display：可以转换元素之间的类型

        - 不显示元素none

    - visibility

        - visible可见的
        - hidden隐藏元素,位置保留

    - float浮动(left/right/none)

    - clear清除浮动

## 布局样式

- position设置元素在容器块中的定位方式

    - static默认值

    - relative相对定位

        是相对于自己原来的位置进行偏移

    - fixed固定定位

        相对于浏览器进行固定定位

    - absolute绝对定位

        生成绝对定位的元素，相对于 static 定位以外的第一个父元素进行定位

- 设置定位元素对于容器边界的偏移量

    - top
    - bottom
    - left
    - right

- z-index重叠优先级

    该属性仅当position属性值为relative或者absolute时有效。

    z-index的值越大，离用户越近



*课后任务*

一个简单的百度仿造