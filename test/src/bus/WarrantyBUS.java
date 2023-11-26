package bus;

import java.sql.Date;
import java.util.ArrayList;

import dao.WarrantyDAO;
import dto.CategoryDTO;
import dto.WarrantyDTO;


public class WarrantyBUS {
	private final WarrantyDAO warrDAO = new WarrantyDAO();
	private ArrayList<WarrantyDTO> listWarr = new ArrayList<>();
	
	public WarrantyBUS() {
		// TODO Auto-generated constructor stub
		listWarr = warrDAO.selectAll();
	}
	
	public ArrayList<WarrantyDTO> getALL() {
		return this.listWarr;
	}
	
	public Boolean add(int customerId, String productName, Date dateReceived, Date dateReturned, double warrantyFee, int warrantyStatusId, String warrantyDescription) {
		WarrantyDTO warr = new WarrantyDTO(warrDAO.getAutoIncrement(), customerId, productName,
										dateReceived, dateReturned, warrantyFee, warrantyStatusId, warrantyDescription);
		boolean check = warrDAO.insert(warr) != 0;
		if (check) {
			this.listWarr.add(warr);
		}
		return check;
	}
	
}
