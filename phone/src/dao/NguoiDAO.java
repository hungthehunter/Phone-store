package dao;

import java.util.ArrayList;

import model.Nguoi;

public class NguoiDAO implements DAOInterface<Nguoi>{

	public static NguoiDAO getInstance() {
		return new NguoiDAO();
	}
	
	@Override
	public int insert(Nguoi t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Nguoi t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Nguoi t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Nguoi> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nguoi selectById(Nguoi t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Nguoi> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
