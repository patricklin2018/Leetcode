# 263. 丑数

## 问题

编写一个程序判断给定的数是否为丑数。

丑数就是只包含质因数 `2, 3, 5` 的**正整数**。

**示例 1:**

```
输入: 6
输出: true
解释: 6 = 2 × 3
```

**示例 2:**

```
输入: 8
输出: true
解释: 8 = 2 × 2 × 2
```

**示例 3:**

```
输入: 14
输出: false 
解释: 14 不是丑数，因为它包含了另外一个质因数 7。
```

**说明：**

1. `1` 是丑数。
2. 输入不会超过 32 位有符号整数的范围: [−231,  231 − 1]。

## 思路

丑数包含因子 2，3，5，相应的，丑数可以表示为 `丑数 = 2 * a + 3 * b + 5 * c`。

那么，要验证该数是否为丑数，只需要验证该数能否为 2、3、5 除尽。

需要注意的是，1 为丑数， 0 不为丑数。

## 实现

[代码 - JAVA](Solution.java)

### 1. JAVA

```java
public class Solution {

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num = num >> 1;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
```

