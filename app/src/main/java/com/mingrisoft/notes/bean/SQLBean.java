package com.mingrisoft.notes.bean;
public class SQLBean {
	private String _id; //主键自增id
	private String title; //日记标题
	private String context; //日记内容
	private String time; //日记记录时间
	private String datatype; //是否设置了到时提醒0代表未提醒
	private String datatime; //提醒时间
	private String locktype; //是否添加了密码锁0代表未添加
	private String lock; //密码锁密码
	public String get_id() {//获取日记id
		return _id;
	}                                    //获取日记id
	public void set_id(String _id) {//设置日记id
		this._id = _id;
	}                        //设置日记id
	public String getTitle() {//获取日记标题
		return title;
	}                               //获取日记标题
	public void setTitle(String title) {//设置日记标题
		this.title = title;
	}              //设置日记标题
	public String getContext() {//获取日记内容
		return context;
	}                          //获取日记内容
	public void setContext(String context) {//设置日记内容
		this.context = context;
	}      //设置日记内容
	public String getTime() {//获取日记添加时间
		return time;
	}                                 //获取日记添加时间
	public void setTime(String time) {//设置日记添加时间
		this.time = time;
	}                   //设置日记添加时间
	public String getDatatype() {//获取是否设置了到时提醒
		return datatype;
	}                        //获取是否设置到时提醒
	public void setDatatype(String datatype) {//设置日日期到时提醒
		this.datatype = datatype;
	} //设置日期到时提醒
	public String getDatatime() {//获取提醒时间
		return datatime;
	}                        //获取提醒时间
	public void setDatatime(String datatime) {//设置提醒时间
		this.datatime = datatime;
	}  //设置提醒时间
	public String getLocktype() {//获取是否添加了日记锁
		return locktype;
	}                        //获取是否添加日记锁
	public void setLocktype(String locktype) {//设置日记锁
		this.locktype = locktype;
	}  //设置日记锁
	public String getLock() {//获取日记锁秘密
		return lock;
	}                                 //获取日记锁密码
	public void setLock(String lock) {//设置日记锁秘密
		this.lock = lock;
	}                  //设置日记锁密码
}
