package ch.hcuge.simed.cohort.transverse.db;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webobjects.eocontrol.EOEditingContext;

public class Role extends _Role {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(Role.class);
	@Override
	public void awakeFromInsertion(EOEditingContext editingContext) {
		super.awakeFromInsertion(editingContext);
		this.setPublicID(UUID.randomUUID().toString());
	}

	public static Role instanceByCode(EOEditingContext editingContext, String code) {
		return Role.fetchRole(editingContext, CODE_KEY, code);
	}
}
