package com.lz.specialSort;

/**
 * @Classname BucketSort
 * @Description  桶排序
 * @Date 2019/6/19 20:13
 * @Created by liZhi
 */
public class BucketSort {


/**
 桶排序：将要排序的数据分到几个有序的桶里，每个桶里的数据再单独进行排序。桶内排完序之后，再把每个桶里的数据按照顺序依次取出，组成的序列就是有序的了。
 如果要排序的数据有n个，我们把它们均匀的分到m个桶内，每个桶内的数据就有k=n/m个元素。然后每个桶内使用快速排序，时间复杂度为0(k*logk)。m个桶就是O(m*k*logk)。
 因为k=n/m，所以整个桶排序的时间复杂度就是O(n*log(n/m))。当桶的个数m接近数据个数n时，log(n/m)就是一个非常小的常量，这时候桶排序的时间复杂度接近O(n)。

 桶排序对要排序数据的要求是非常苛刻的。
 要排序的数据需要很容易就能划分为m个桶，并且，桶与桶之间有着天然的大小顺序。这样，桶与桶之间的数据不需要再进行排序。
 而且，数据在各个桶之间的分布最好是比较均匀的。

 桶排序比较适合用在外部排序中。外部排序：(数据存储在外部磁盘中，数据量比较大，内存有限，无法将数据全部加载到内存中)。
 例: 我们有10GB的订单数据，我们希望按订单金额进行排序，但是我们内存只有几百MB。这时候应该怎么办？
 答: 我们可以先扫描一遍文件，看订单金额所处的数据范围，假设扫描之后发现订单金额最小是1元，最大是10万元。我们就将所有订单数据金额划分到100个桶里。
 第一个桶内存储金额在1元到1000元之内的订单，第二个桶存储金额在1001到2000元之内的订单，以此类推，每一个桶对应一个文件，并且按照金额范围的大小顺序编号命名桶。

订单金额在1元到10万元之间并不一定是均匀分布的，所以10GB订单数据是无法均匀的被划分到100个文件中。有可能某个金额区间的数据特别多。
 针对这些划分之后还是比较大的文件，我们可以继续划分，比如，订单金额在1元到1000元之间的比较多，我们就将这个区间继续划分为10个小区间，1元到100元，101元到200元....
 如果划分之后，101到200元之间的订单还是太多，无法一次性读入内存，那就继续再划分，直到所有的文件都能读入内存为止。

 */

}
