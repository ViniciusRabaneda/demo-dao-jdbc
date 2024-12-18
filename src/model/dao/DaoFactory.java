package model.dao;

import model.dao.impl.SellerDaoJDBC;

//DaoFactory é uma forma de fazer a injeção de dependência sem explicitar a implementação

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}