package com.hcl.bb.dao;

import java.util.List;

import com.hcl.bb.model.DonateBlood;
import com.hcl.bb.model.User;
/**
 * @author Rasool Malik Vempalli
 */
public interface DonationStatusDao {
	public List<DonateBlood> getDonationList(User user);
}
