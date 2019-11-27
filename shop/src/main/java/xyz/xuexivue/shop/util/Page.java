package xyz.xuexivue.shop.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName page
 * @Description: TODO
 * @Author xuexi
 * @Date 2019/10/10
 * @Version V1.0
 **/
@Component
public class Page {
    // 1.当前页数 从页面获取
    private int currentPage=0;
    // 2.每页显示数据个数，赋初值或者setter获取
    private int currentCount=10;
    // 3.总条数，从数据库获取
    private int totalRecord;
    // 4.总页数，计算得到
    private int totalPage;
    // 5.每页的显示数据，数据库得到
    List<?> list = new ArrayList<>();
    //标题
    private String title;
    //id文章id
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String bTitle ;

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public static int TotalPage(int totalRecord, int currentCount){
        if (totalRecord%currentCount==0){
            return totalRecord/currentCount;
        }else {
            return totalRecord/currentCount+1;
        }
    }


}
