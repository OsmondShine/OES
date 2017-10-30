package com.exam.util;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 鍒嗛〉灏佽锟�
 * 鐢ㄤ簬鍋氬垎椤垫煡璇㈢殑鍩虹绫伙紝灏佽浜嗕竴浜涘垎椤电殑鐩稿叧灞烇拷?
 * @author bigpig
 * @version v1.0
 * @param <T>
 */
public class PageResults<T> implements Serializable {
 
private T obj;
	
    // 下一�?
    private int pageNo;
 
    // 当前�?
    private int currentPage;
 
    // 每页个数
    private int pageSize = 4;
 
    // 总条数
    private int totalCount;
 
    // 总页数
    private int pageCount;
    
    //开始查询时间
    private Date startTime;
    
    //结束查询时间
    private Date endTime;
    
    
    private String startTimeStr;
    private String endTimeStr;
    
    // 记录
    private List<T> results;
    
 
    public int getPageCount() {
    	pageCount = this.getTotalCount() % this.getPageSize() == 0 ? this.getTotalCount() / this.getPageSize()
                : this.getTotalCount() / this.getPageSize() + 1;
        return pageCount;
    }
 
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
 
    public int getPageNo() {
        if (pageNo <= 0) {
            return 1;
        } else{
        	this.pageNo = this.getCurrentPage() + 1;
            return pageNo > pageCount ? pageCount : pageNo;
        }
    }
 
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
 
    public List<T> getResults() {
        return results;
    }
 
    public void setResults(List<T> results) {
        this.results = results;
    }
 
    public int getCurrentPage() {

    	if(currentPage <= 0) {
    		currentPage = 1;
    	}
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
    	if(currentPage <= 0) {
    		currentPage = 1;
    	} else {
    		this.currentPage = currentPage;
    	}
        
    }
 
    public int getPageSize() {
    	this.pageSize = pageSize <= 0 ? 10 : pageSize;
        return pageSize;
    }
 
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
 
    public int getTotalCount() {
        return totalCount;
    }
 
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
 
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStartTimeStr() {
		return startTimeStr;
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			startTime = sdf.parse(startTimeStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getEndTimeStr() {
		return endTimeStr;
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			endTime = sdf.parse(endTimeStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
