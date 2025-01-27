package com.entity.vo;

import com.entity.NongyejiqiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 农业技巧
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public class NongyejiqiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 简述
	 */
	
	private String jianshu;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 技巧内容
	 */
	
	private String jiqiaoneirong;
		
	/**
	 * 发日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fariqi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：简述
	 */
	 
	public void setJianshu(String jianshu) {
		this.jianshu = jianshu;
	}
	
	/**
	 * 获取：简述
	 */
	public String getJianshu() {
		return jianshu;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：技巧内容
	 */
	 
	public void setJiqiaoneirong(String jiqiaoneirong) {
		this.jiqiaoneirong = jiqiaoneirong;
	}
	
	/**
	 * 获取：技巧内容
	 */
	public String getJiqiaoneirong() {
		return jiqiaoneirong;
	}
				
	
	/**
	 * 设置：发日期
	 */
	 
	public void setFariqi(Date fariqi) {
		this.fariqi = fariqi;
	}
	
	/**
	 * 获取：发日期
	 */
	public Date getFariqi() {
		return fariqi;
	}
			
}
