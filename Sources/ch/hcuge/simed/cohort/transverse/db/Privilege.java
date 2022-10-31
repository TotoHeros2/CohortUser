package ch.hcuge.simed.cohort.transverse.db;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webobjects.eocontrol.EOEditingContext;

public class Privilege extends _Privilege {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(Privilege.class);

	@Override
	public void awakeFromInsertion(EOEditingContext editingContext) {
		super.awakeFromInsertion(editingContext);
		this.setPublicID(UUID.randomUUID().toString());
	}

	public static Privilege instanceByCode(EOEditingContext editingContext, String code) {
		return Privilege.fetchPrivilege(editingContext, CODE_KEY, code);
	}
}
