package dao;
import java.util.ArrayList;

import dto.ProductDTO;
import dto.ReceiptDetailDTO;
public interface DAOInterface<T> {
	public int insert(T t);
	public int update(T t);
	public int delete(String t);
	public ArrayList<T> selectAll();
	public T selectById(String t);
	public ArrayList<T> selectByCondition(String condition);
	public int getAutoIncrement();
	public ArrayList<T> selectAllDelete();
	int restore(ProductDTO t);
	int update(ReceiptDetailDTO r, String pk);
}
