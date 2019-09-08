package entity;

/**
 * @Classname PageResult
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/9/5 14:28
 * @Created by Happy-微冷的雨
 */

import java.util.List;

/**
 * 保存单页数据的一个Bean
 */
public class PageResult<T> {
    private long total;
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
