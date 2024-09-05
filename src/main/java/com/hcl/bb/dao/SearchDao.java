package com.hcl.bb.dao;

import java.util.List;

import com.hcl.bb.model.DonateBlood;
/**
 * @author Rasool Malik Vempalli
 */
public interface SearchDao {

	public List<DonateBlood> getSearchResults(String searchQuery);

}
