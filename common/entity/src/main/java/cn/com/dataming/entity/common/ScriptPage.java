package cn.com.dataming.entity.common;

import lombok.Data;

@Data
public class ScriptPage<T> {
	private Object rows;
	//private List<T> rows = new ArrayList<T>();
	private Integer total = -1;
	public int pageIndex ;
	public int pageSize;
}
