package com.onion.home.product;

import com.onion.home.productoption.ProductOptionDTO;

public class ProductService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDAO productDAO = new ProductDAO(); 
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductName("product1");
		productDTO.setProductDetail("detail1");
		
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();
		productOptionDTO.setOptionName("optionName1");
		productOptionDTO.setOptionPrice(4000);
		productOptionDTO.setOptionStock(10);
		
		
		ProductOptionDTO productOptionDTO2 = new ProductOptionDTO();
		productOptionDTO.setOptionName("optionName2");
		productOptionDTO.setOptionPrice(200);
		productOptionDTO.setOptionStock(20);
		productOptionDTO.setProductNum(null);
		
		try {
			Long num = productDAO.getProductNum();
			productDTO.setProductNum(num);
			
			int result = productDAO.setAddProduct(productDTO);
			
			productOptionDTO.setProductNum(num);
			
			if(result>0) {
				productDAO.setAddProductOption(productOptionDTO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

