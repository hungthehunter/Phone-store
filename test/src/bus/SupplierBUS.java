package bus;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import dao.SupplierDAO;
import dto.SupplierDTO;


public class SupplierBUS {
	private final SupplierDAO suppDAO = new SupplierDAO();
	private ArrayList<SupplierDTO> listSupp = new ArrayList<>();
	
	public SupplierBUS() {
		listSupp = suppDAO.selectAll();
	}
	
	public ArrayList<SupplierDTO> getALL() {
		return this.listSupp;
	}
	
	public SupplierDTO getByIndex(int index) {
		return this.listSupp.get(index);
	}
	
	public int getIndexById(int supplierId) {
		int i = 0;
		int locate = -1;
		while (i < this.listSupp.size() && locate == -1) {
			if (listSupp.get(i).getSupplierId() == supplierId) {
				locate = i;
			}else {
				i++;
			}
		}
		return locate;
	}
	
	public Boolean add(String supplierName, String phone, String address, String email, String note) {
		
		SupplierDTO supp = new SupplierDTO(suppDAO.getAutoIncrement(), supplierName, phone, address, email, note);
		boolean check = suppDAO.insert(supp) != 0;
		if (check) {
			this.listSupp.add(supp);
		}
		return check;
	}
	
	public Boolean delete(SupplierDTO supp) {
		boolean check = suppDAO.delete(Integer.toString(supp.getSupplierId())) != 0;
		if(check) {
			this.listSupp.remove(supp);
		}
		return check;
	}
	
	public Boolean update(SupplierDTO supp) {
		boolean check = suppDAO.update(supp) != 0;
		if(check) {
			this.listSupp.set(this.getIndexById(supp.getSupplierId()), supp);
		}
		return check;
	}
	
	public ArrayList<SupplierDTO> search(String text){
		text = text.toLowerCase();
	
		ArrayList<SupplierDTO> result = new ArrayList<SupplierDTO>();
		for(SupplierDTO s : this.listSupp) {
			if(Integer.toString(s.getSupplierId()).toLowerCase().contains(text) || s.getSupplierName().toLowerCase().contains(text) || 
					s.getAddress().toLowerCase().contains(text) || s.getEmail().toLowerCase().contains(text)) {
				result.add(s);
			}
		}
		return result;
	}
	
    public boolean checkDup(String phone , int supplierIdToExclude) { 
	    boolean check = true;
	    int i = 0;
	    while (i < this.listSupp.size() && check == true) {
	        if (this.listSupp.get(i).getSupplierId() == supplierIdToExclude) {
	            i++;
	        }
	        else if (this.listSupp.get(i).getPhone() == phone.toLowerCase()) {
	            check = false;
	        } else {
	            i++;
	        }
	    }
	    return check;
	}

    
    public void importExcel () { 	
    	JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(null);
   		int result = fileChooser.showOpenDialog(null);
   		String url = fileChooser.getSelectedFile().getAbsolutePath();
		if(result == JFileChooser.APPROVE_OPTION) {
	    	try {
	    		FileInputStream inputStream = new FileInputStream(url);
				suppDAO.importDatabase(inputStream);
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
